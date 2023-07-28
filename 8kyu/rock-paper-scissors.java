/**
 * Description:
 * Let's play! You have to return which player won! In case of a draw return Draw!.
 * Examples(Input1, Input2 --> Output):
 * "scissors", "paper" --> "Player 1 won!"
 * "scissors", "rock" --> "Player 2 won!"
 * "paper", "paper" --> "Draw!"
 */

// My solution:
public class Kata {
  public static String rps(String p1, String p2) {
    // your code
    String result;
    if (p1 == "scissors" && p2 == "paper") {
      result = "Player 1 won!";
    }  else if (p1 == "rock" && p2 == "scissors") {
      result = "Player 1 won!";
    } else if (p1 == "paper" && p2 == "rock") {
      result = "Player 1 won!";
    } else if (p1 == "scissors" && p2 == "rock") {
      result = "Player 2 won!";
    } else if (p1 == "paper" && p2 == "scissors") {
      result = "Player 2 won!";
    } else if (p1 == "rock" && p2 == "paper") {
      result = "Player 2 won!";
    } else {
      result = "Draw!";
    }
    return result;
  }
}