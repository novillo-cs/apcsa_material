## WordPair

You are given a class called **WordPair** that can store pairs of words. You must create an ArrayList of WordPair Objects (**WordPairsList**). You will need a Driver file to test your code.

a) In the class **WordPairsList**, write the constructor which takes the array of words and pairs them up as shown in the figure. You will need nested loops to pair each element with the rest of the elements in the list. Here is the pseudocode.
  - Initialize the allPairs list to an empty ArrayList of WordPair objects.
  - Loop through the words array for the first word in the word pair (for loop from index i = 0 to length-1)
      - Loop through the rest of the word array starting from index i+1 for the second word in the word pair (for loop from index j = i+1 to length)
          - Add the new WordPair formed from the ith word and the jth word to the allPairs ArrayList.
         
<img width="212" height="192" alt="image" src="https://github.com/user-attachments/assets/95c005f2-128b-45fc-9d16-eb7277570804" />


b) Write a method called numMatches() in WordPairsList. This method counts and returns the number of pairs where the first word is the same as the second word. For example, if the word array is [“hi”,”bye”,”hi”], the pairs generated would be [“hi”,”bye”], [“hi”,”hi”], and [“bye”,”hi”]. In the second pair [“hi”,”hi”], the first word is the same as the second word, so numMatches() would return 1.

For this method, you will need a loop that goes through the ArrayList allPairs and for each WordPair in allPairs, it checks to see if its first word (using the getFirst() method) equals the second word (using the getSecond() method). If there is a match, it increments a counter which it returns at the end of the method.
