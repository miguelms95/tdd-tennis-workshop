package org.kata.tennis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TennisTest {

    @Test
    void shouldReturnLoveLoveOnStart() {
        TennisGame game = initGame(0,0);

        String score = game.getScore();

        assertEquals("love-love", score);
    }

    @Test
    void shouldReturnFifteenLoveOnPlayerOneScoreOne() {
        TennisGame game = initGame(1,0);

        String score = game.getScore();

        assertEquals("fifteen-love", score);
    }

    @Test
    void shouldReturnThirtyLoveOnPlayerOneScoreTwo() {
        TennisGame game = initGame(2,0);

        String score = game.getScore();

        assertEquals("thirty-love", score);
    }

    @Test
    void shouldReturnFortyLoveOnPlayerOneScoreThree() {
        TennisGame game = initGame(3,0);

        String score = game.getScore();

        assertEquals("forty-love", score);
    }

    @Test
    void shouldReturnLoveFifteenOnPlayerTwoScore() {
        TennisGame game = initGame(0,1);

        String score = game.getScore();

        assertEquals("love-fifteen", score);
    }

    private TennisGame initGame(int player1points, int player2points ){
        TennisGame game = new TennisGame();
        for (int i = 0; i < player1points; i++) {
            game.player1Scores();
        }
        for (int i = 0; i < player2points; i++) {
            game.player2Scores();
        }
        return game;
    }

}
