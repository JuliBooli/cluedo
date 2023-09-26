package ch.bbw.ja.cluedo.logic;

import ch.bbw.ja.cluedo.datamodel.Crime;
import ch.bbw.ja.cluedo.logic.GameLogic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameLogicTest {
private GameLogic gameLogic;

    @Test
    void evaluateSuggestion(){
        Crime suggestion = new Crime();
        Crime secret = new Crime();
        int numberOfSuggestion= 0;
        int maxNumberIfSuggestion= 0;

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        GameLogic gameLogic = new GameLogic();

        assertEquals(true, gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberIfSuggestion));
    }

}
