/**
 * Description:
 * Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. 
 * Marketing thinks it would be great to welcome visitors to the site in their own language. 
 * Luckily you already use an API that detects the user's location, so this is an easy win.
 * The task:
 * Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!
 * Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database. 
 * It should default to English if the language is not in the database, or in the event of an invalid input.
 */

// My solution
import java.util.*;
public class Welcome {
      private final Map<String, String> database;
      public Welcome() {
        database = new HashMap<>();
        database.put("english", "Welcome");       database.put("czech", "Vitejte");
        database.put("danish", "Velkomst");       database.put("dutch", "Welkom");
        database.put("estonian", "Tere tulemast");database.put("finnish", "Tervetuloa");
        database.put("flemish", "Welgekomen");    database.put("french", "Bienvenue");
        database.put("german", "Willkommen");     database.put("irish", "Failte");
        database.put("italian", "Benvenuto");     database.put("latvian", "Gaidits");
        database.put("lithuanian", "Laukiamas");  database.put("polish", "Witamy");
        database.put("spanish", "Bienvenido");    database.put("swedish", "Valkommen");
        database.put("welsh", "Croeso");
      }
  public static String greet(String language) {
    Welcome welcome = new Welcome();
    String greeting = welcome.database.getOrDefault(language.toLowerCase(), "Welcome");
    return greeting;
  }
}