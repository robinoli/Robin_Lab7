package edu.cscc;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RPSLSpockTest {

    @Test
    public void testIsValidPickRock(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "rock";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( cond );
    }


    @Test
    public void testIsValidPickPaper(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "paper";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( cond );
    }


    @Test
    public void testIsValidPickScissors(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "Scissors";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( cond );
    }

    @Test
    public void testIsValidPickLizard(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "Lizard";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( cond );
    }

    @Test
    public void testIsValidPickSpock(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "Spock";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( cond );
    }
    @Test
    public void testIsValidPickTrim(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "     rock     ";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( cond );
    }

    @Test
    public void testIsValidPickUpperCase(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "ROCK";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( cond );
    }

    @Test
    public void testIsInvalidValidPick(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = "stone";
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( !cond );
    }

    @Test
    public void testIsInValidPickNull(){
        RPSLSpock game = new RPSLSpock();
        String pick_h = null;
        boolean cond = game.isValidPick (pick_h);
        assertTrue ( !cond );
    }

    @Test
    public void testGeneratePickReturnsNotNull(){
        RPSLSpock game = new RPSLSpock();
        String returnValue = game.generatePick ();
        boolean condition = (!returnValue.equals(null));
        assertTrue ( condition );
    }

    @Test
    public void testGeneratePickMillionTimes(){
        RPSLSpock game = new RPSLSpock();
        for(int i=0; i<1000000; i++) {
            String returnValue = game.generatePick (); //rock //scissors //spock //paper //lizard
            boolean condition = game.isValidPick ( returnValue );
            assertTrue ( condition );
        }
    }

    @Test
    public void testIsComputerWinRockWinsScissors(){
        RPSLSpock game = new RPSLSpock();
        String c_pick = "rock";
        String h_pick = "scissors";
        boolean result = game.isComputerWin(c_pick,h_pick);
        assertTrue(result);
    }

    @Test
    public void testIsComputerWinRockWinsLizard(){
        RPSLSpock game = new RPSLSpock();
        String c_pick = "rock";
        String h_pick = "lizard";
        boolean result = game.isComputerWin(c_pick,h_pick);
        assertTrue(result);
    }

    @Test
    public void testIsComputerWinPaperWinsRock(){
        RPSLSpock game = new RPSLSpock();
        String c_pick = "paper";
        String h_pick = "rock";
        boolean result = game.isComputerWin(c_pick,h_pick);
        assertTrue(result);
    }

    @Test
    public void testIsComputerWinPaperWinsSpock(){
        RPSLSpock game = new RPSLSpock();
        String c_pick = "paper";
        String h_pick = "spock";
        boolean result = game.isComputerWin(c_pick,h_pick);
        assertTrue(result);
    }

    @Test
    public void testIsComputerScissorsWinsPaper(){
        RPSLSpock game = new RPSLSpock();
        String c_pick = "scissors";
        String h_pick = "paper";
        boolean result = game.isComputerWin(c_pick,h_pick);
        assertTrue(result);
    }
    @Test
    public void testIsComputerScissorsWinsLizard(){
        RPSLSpock game = new RPSLSpock();
        String c_pick = "scissors";
        String h_pick = "lizard";
        boolean result = game.isComputerWin(c_pick,h_pick);
        assertTrue(result);
    }

    @Test
    public void testIsComputerLizardWinsPaper() {
        RPSLSpock game = new RPSLSpock ();
        String c_pick = "lizard";
        String h_pick = "paper";
        boolean result = game.isComputerWin ( c_pick, h_pick );
        assertTrue ( result );
    }

    @Test
    public void testIsComputerLizardWinsSpock() {
        RPSLSpock game = new RPSLSpock ();
        String c_pick = "lizard";
        String h_pick = "spock";
        boolean result = game.isComputerWin ( c_pick, h_pick );
        assertTrue ( result );
    }

    @Test
    public void testIsComputerSpockWinsRock() {
        RPSLSpock game = new RPSLSpock ();
        String c_pick = "spock";
        String h_pick = "rock";
        boolean result = game.isComputerWin ( c_pick, h_pick );
        assertTrue ( result );
    }


    @Test
    public void testIsComputerSpockWinsScissors() {
        RPSLSpock game = new RPSLSpock ();
        String c_pick = "spock";
        String h_pick = "scissors";
        boolean result = game.isComputerWin ( c_pick, h_pick );
        assertTrue ( result );
    }

    @Test
    public void testIsComputerSpockLossesPaper() {
        RPSLSpock game = new RPSLSpock ();
        String c_pick = "spock";
        String h_pick = "paper";
        boolean result = game.isComputerWin ( c_pick, h_pick );
        assertTrue ( !result );
    }
}