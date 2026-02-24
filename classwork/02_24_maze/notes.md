# Maze

## Day 1

Save this classwork here: 

`.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/02_24_maze/maze1.txt`

`.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/02_24_maze/Maze.java`


The following code represents a maze (we will learn the meaning of each symbol in our next lesson):
```
###################################
#   #         #   #   #     # # #E#
# # ### ######### # # # ### # # # #
# # #   #           #   #         #
# # # ### ######### ##### ### ### #
# # # # #   #     #   #     # # # #
### # # ### # # ### # # # ### # ###
#S            #   # # # # #   #   #
###################################
```
1. Copy this maze into a text file maze1.txt Do not add spaces before or after the lines. 

2. Write a method that reads the file into a 2d array of characters and returns the array. You do not know the dimensions of the rectangular maze ahead of time. 

3. Write a method to print the 2d array as one 1D array per line. It will help you check if it looks correct.
  
4. Write a method that converts the 2d array to a string that look like the text file (no spaces or commas)

### Notes:

You may use built-in methods to print an array as string ```Arrays.toString()```

### Example:

- 1D arrays, Arrays.toString(myOneDArray) => "{1, 2, 3, 4}"


- 2D arrays, Arrays.toString(myTwoDArray) => It does not work as the 1D array. You may try it. There is another built-in methond you can use to print a 2D array as string. Please take a look at the documentation: https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html
