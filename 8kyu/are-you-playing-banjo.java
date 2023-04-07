// Description:
/* Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo! */
// My solution
public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    // Program me!
    char firstLetter = name.charAt(0);
    String message = "";
    if(firstLetter == 'R' || firstLetter == 'r') {
      message = name + " plays banjo";
    } else {
      message = name + " does not play banjo";
    }
    return message;
  }
}