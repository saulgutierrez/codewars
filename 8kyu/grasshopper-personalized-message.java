// Description
/* Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
Use conditionals to return the proper message: */
// My solution
class Kata {
    static String greet(String name, String owner) {
        // Add code here
      if(name.equals(owner)) {
        return "Hello boss";
      } else {
        return "Hello guest";
      }
    }
}