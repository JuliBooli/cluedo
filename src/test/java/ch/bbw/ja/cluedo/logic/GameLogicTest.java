package ch.bbw.ja.cluedo.logic;

import ch.bbw.ja.cluedo.model.Crime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class GameLogicTest {

    private GameLogic gameLogic;
    private Crime suggestion;
    private Crime secret;
    private int numberOfSuggestion;
    private int maxNumberOfSuggestions;
    @BeforeEach
    private void setupBevoreEachTest(){
        gameLogic = new GameLogic();
        suggestion = new Crime();
        secret = new Crime();
    }


    @Test
    void evaluateSuggestion(){
        int numberOfSuggestion= 8;
        int maxNumberOfSuggestion= 8;

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        assertEquals(true, gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
    }
    @Test
    void evaluateSuggestionFalse(){
        int numberOfSuggestion= 8;
        int maxNumberOfSuggestion= 8;
        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);


        // Kreiere einen Guess welcher Falsch ist.
        suggestion.setActor(1);
        suggestion.setWeapon(2);
        suggestion.setScene(3);

        // Create a GameLogic instance

        // Verify that the suggestion is evaluated as false
        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
    }

    @Test
    void ActorWeaponSceneNotEqualThenReturnFalseAndHistory0(){
        int numberOfSuggestion= 0;
        int maxNumberOfSuggestion= 8;
        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);


        // Kreiere einen Guess welcher Falsch ist.
        suggestion.setActor(1);
        suggestion.setWeapon(1);
        suggestion.setScene(1);
        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
        assertEquals("0", suggestion.getHistory().get(0));
    }
    @Test
    void ActorEqualWeaponSceneNotEqualThenReturnFalseAndHistory1(){
        int numberOfSuggestion= 0;
        int maxNumberOfSuggestion= 8;
        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);


        // Kreiere einen Guess welcher Falsch ist.
        suggestion.setActor(0);
        suggestion.setWeapon(1);
        suggestion.setScene(1);
        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
        assertEquals("1", suggestion.getHistory().get(0));
    }
    @Test
    void WeaponEqualActorSceneNotEqualThenReturnFalseAndHistory1(){
        int numberOfSuggestion= 0;
        int maxNumberOfSuggestion= 8;
        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);


        // Kreiere einen Guess welcher Falsch ist.
        suggestion.setActor(1);
        suggestion.setWeapon(0);
        suggestion.setScene(1);
        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
        assertEquals("1", suggestion.getHistory().get(0));
    }
    @Test
    void SceneEqualWeaponSceneNotEqualThenReturnFalseAndHistory1(){
        int numberOfSuggestion= 0;
        int maxNumberOfSuggestion= 8;
        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);


        // Kreiere einen Guess welcher Falsch ist.
        suggestion.setActor(0);
        suggestion.setWeapon(1);
        suggestion.setScene(1   );
        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
        assertEquals("1", suggestion.getHistory().get(0));
    }



    @Test
    void ActorWeaponEqualSceneNotEqualThenReturnFalseAndHistory2(){

    }

    @Test
    void ActorSceneEqualWeaponNotEqualThenReturnFalseAndHistory2(){

    }
    @Test
    void WeaponSceneEqualActorNotEqualThenReturnFalseAndHistory2(){


    }

    @Test
    void ActorWeaponSceneEqualThenReturnTrueAndHistoryWin(){

    }



}
