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

## Day 2

### Maze Solver

The file you will have to read contains a rectangular ascii maze with the following characters:

- **'#'** => Walls (locations that cannot be moved onto)
- **' '** => Empty Space (locations that can be moved onto)
- **'E'** => The location of the goal, if any (0 or more per file)
- **'S'** => The location of the start (1 per file)

Let's solve this maze. Assume we can perform this set of moves: [South, North, Left, Right].

We need 2 extra characters to indicate:

-  **'.'** Spaces that have been visited
-  **'@'** Spaces that are part of the solution

```
######
#    #
# ## #
#  # #
#S#E #
#  # #
######
```

If you explore in the following order: [South, North, Left, Right], your solution will return 10, and the maze will end up in the following final state:

```
######
#@@@@#
#@##@#
#@ #@#
#@#E@#
#..#.#
######
```

## Implementation

#### Constructor

  Your constructor must:

  1. Load maze text file
  2. Set animate to false by default (we will add animation later)
  3. Set startRow and startCol based on the position of the 'S' in the maze file. When the file is not found then: throw a FileNotFoundException

**Note:** Your code must handle maze files that have blank newlines at the end of the file because some text editors include a newline at the end of a file, but that may not be present.

#### toString()

Return the string that represents the maze. It should look like the text file with some characters changed by solve.

#### solve(int row, int col)

The recursive solve method takes a row and col position.

- The 'S' is replaced with '@'
- The 'E' remains the same
- All visited spots that were not part of the solution are changed to '.'
- All visited spots that are part of the solution are changed to '@'


## Day 3

#### Animation

When you modify the maze by adding '@' and '.', you may add the following code:

```
if (animate) {
    gotoTop();
    clearTerminal();
    System.out.println(this);
    wait(200);
}

#### Color your output with this command

```
java MazeDriver | sed -e 's/#/\x1b[47;39m \x1b[0m/g' -e 's/@/\x1b[42m \x1b[0m/g' -e 's/\./\x1b[41m\ \x1b[0m/g'
```

