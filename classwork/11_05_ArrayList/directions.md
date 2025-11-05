## ArrayList Practice

### Exercise 1

Complete the `StudyAtHome.java` class. Use the comments in the starter code as a guide to help you implement each part correctly.

### Exercise 2

Write a Java file `ArrayListPractice.java` with the following methods. 

A Driver is not needed. You may write the main method in ArrayListPractice.java

1. Return the sum of all the numbers at even positions in the array list.

```
public int listSumEvenIndexes(ArrayList<Integer> numsList) {     
  
}
```

Examples:

```
listSumEvenIndexes([1, 2, 3, 4]) → 4
listSumEvenIndexes([8, 16, 10]) → 18
listSumEvenIndexes([5, 0, -10]) → -5
```

2. An array list contains a list of animals. If the animal is a cat (i.e. the animal's description contains the word "cat" or "Cat"), then add it to a new array list. Return the new array list of cats.

```
public ArrayList<String> listCatty(ArrayList<String> animalsList) {    
  
}
```

Examples:

```
listCatty(["buffalo", "dog"]) → []
listCatty(["bobcat", "siamese cat", "catbird"]) → ["bobcat", "siamese cat", "catbird"]
listCatty(["Cat", "frog", "mouse"]) → ["Cat"]
```

3. Return the sum of the numbers in the array list that are odd and have an even index, or the number is even and its index is odd.

```
public int listFairlyOddNums(ArrayList<Integer> numsList) { 
  
}
```

Examples:
```
listFairlyOddNums([1, 2, 3, 4]) → 10
listFairlyOddNums([8, 16, 10]) → 16
listFairlyOddNums([5, 0, 13, 51]) → 18
```
