package ch.bbw.ja.cluedo.logic;

import ch.bbw.ja.cluedo.model.*;

import java.util.List;
import java.util.Random;

/**
 * GameLogic
 *
 * @author Peter Rutschmann
 * @version 18.09.2022
 */
public class GameLogic {


   /**
    * Setup randomly the secret of the game.
    * @param service Contains the list for actors, weapons and scenes.
    * @param secret  Randomly generate the secret for actor, weapon and scene.
    */
   public void setupNewGame(DataService service, Crime secret){
      Random random = new Random();

      List<Person> actors = service.getPeople();
      List<Weapon> weapons = service.getWeapons();
      List<Room> rooms = service.getRoom();

      int secretActorIndex = random.nextInt(actors.size());
      int secretWeaponIndex = random.nextInt(weapons.size());
      int secretSceneIndex = random.nextInt(rooms.size());

      secret.setActor(secretActorIndex);
      secret.setWeapon(secretWeaponIndex);
      secret.setScene(secretSceneIndex);
   }

   /**
    * Evaluates the suggestion to find the solution of the game.
    * @param suggestion The suggestion from the player
    * @param secret The game secret.
    * @param numberOfSuggestion Current number of suggestion
    * @param maxNumberOfSuggestions Max number of possible suggestions
    * @return true if games ends, false if another suggestion is allowed
    */
   public boolean evaluateSuggestion(Crime suggestion, Crime secret, int numberOfSuggestion, int maxNumberOfSuggestions){
         // Compare the suggestion with the secret
      boolean isCorrect = suggestion.getActor() == secret.getActor() &&
              suggestion.getWeapon() == secret.getWeapon() &&
              suggestion.getScene() == secret.getScene();


      if (isCorrect ) {
         return true; // Suggestion Correct => return true
      } else {
         return false; // The game continues if the suggestion is incorrect and the limit is not reached
      }
   }
}
