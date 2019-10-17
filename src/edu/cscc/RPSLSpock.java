package edu.cscc;
import java.util.Random;

public class RPSLSpock {

    static Random rand = new Random(System.currentTimeMillis());


    //all are the CONSTANT value; do not change anywhere in this program
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    /**
     *
     * @param pick: string value picked by the user and user can pick any value
     * @return: boolean value returns true if user picked from the following value "rock", "paper", "scissors", "lizards", "spock"; case ignored----- false otherwise
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }

        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    /**
     *
     * @return any one of the constant variable defined above based on system generated random number from 0 to 4
     */
    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) { //generate random number from 0 to 4
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    /**
     *
     * @param c_pick: system generated pick
     * @param h_pick : choice picked by user
     * @return: true if system choice wins the user choice-system wins; false otherwise-user wins
     */
    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase(); //user picked value
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}