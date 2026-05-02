public class MyStrings
{
    public static void main(String[] args)
    {
        // Remember the first letter of a String starts at position 0 (ZERO)
        
           String msg = "The people who are crazy enough to think they can change the world are the ones who do."; 
        System.out.println("My message:\n" + msg);
           // Print the length of msg
       System.out.println("Length of msg: " + msg.length()); // output: 83
    
                    String firstSubs = msg.substring(4, 10);
        System.out.println("msg.substring(4, 10): " + firstSubs);
       // What is the output? -> people
  
        // Are characters 4 and 10 included? -> 4 yes, 10 no
             // Print the length of firstSub
         System.out.println("Length of firstSubs: " + firstSubs.length()); // 6 

           String secondSubs = msg.substring(41);
 System.out.println("msg.substring(41): " + secondSubs);
    // What is the outuput? -> enough to think they can change the world are the ones who do.
        // Is the character 41 included? -> yes
// Print the lenght of secodSubs
       System.out.println("Length of secondSubs: " + secondSubs.length()); // 42 chars
       
       // Get and print the word people
               String people = msg.substring(4, 10);
       System.out.println("Word people: " + people); // output: people
        
               // Get and print the last three characters of msg
        String lastThree = msg.substring(msg.length() - 3);
           System.out.println("Last 3 characters: " + lastThree); // output: do.
    
 System.out.println("firstSubs: " + firstSubs);
       System.out.println("secondSubs: " + secondSubs);
     
        System.out.println("firstSubs.equals(secondSubs): " + firstSubs.equals(secondSubs));
        // What is the result of the comparisson? -> false, theyre diff strings
         
          // Create a new String object newStr and assign a value. Requirement: firstSubs.equals(newStr) should be True
                 // REMEMBER DO NOT USE == TO COMPARE STRINGS
             String newStr = "people";
        System.out.println("firstSubs.equals(newStr): " + firstSubs.equals(newStr)); // true
    
             System.out.println("msg.charAt(0) is: " + msg.charAt(0));
          // What is the output? -> T
        // Print the last character of msg using the method charAt()
        System.out.println("Last character of msg: " + msg.charAt(msg.length() - 1)); // output: .
     
        // YOU CAN COMPARE CHARACTERS USING ==
         System.out.println("msg.charAt(0) == 'A': ");
        System.out.println(msg.charAt(0) == 'A');  // false
        //  msg starts with T not A :)
     }
}
