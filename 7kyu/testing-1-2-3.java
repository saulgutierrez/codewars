/**
 * Description:
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 */

// My solution
import java.util.*;

public class LineNumbering {
  public static List<String> number(List<String> lines) {
    // Create an empty ArrayList string
    List<String> numberedLines = new ArrayList<String>();
    for (int i = 0; i < lines.size(); i++) {
      // In each iteration, saves the index, and its information using the get method
      String numberedLine = (i+1) + ": " + lines.get(i);
      // Append each item to the ArrayList string
      numberedLines.add(numberedLine);
    }
  return numberedLines;
  }
}