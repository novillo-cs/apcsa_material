public class MyStrings
{
    public static void main(String[] args)
    {
        // Remember the first letter of an String starts at position 0 (ZERO)
        
       String msg = "The people who are crazy enough to think they can change the world are the ones who do."; 
       System.out.println("My message:\n" + msg);

       // Print the length of msg
       
       String firstSubs = msg.substring(4, 10);
       System.out.println("msg.substring(4, 10): " + firstSubs);
       // What is the outuput?
       // Are characters 4 and 10 included?
       // Print the lenght of firstSub

       String secondSubs = msg.substring(41);
       System.out.println("msg.substring(41): " + secondSubs);
       // What is the outuput?
       // Is the character 41 included?
       // Print the lenght of secodSubs
       
       // Get and print the word people
        
       // Get and print the last three characters of msg

       System.out.println("firstSubs: " + firstSubs);
       System.out.println("secondSubs: " + secondSubs);

       System.out.println("firstSubs.equals(secondSubs): " + firstSubs.equals(secondSubs));
        // What is the result of the comparisson?
        // Create a new String object newStr and assign a value. Requirement: firstSubs.equals(newStr) should be True
        // REMEMBER DO NOT USE == TO COMPARE STRINGS

        System.out.println( "msg.charAt(0) is: " + msg.charAt(0));
        // What is the output?
        // Print the last character of msg using the method charAt()

        // YOU CAN COMPARE CHARACTERS USING ==
        System.out.println("msg.charAt(0) == \'A\': ");
        System.out.println(msg.charAt(0) == 'A'); 

    }
}
