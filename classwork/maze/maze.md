# Maze

## Day 1

Save this classwork here: classwork/xx_maze/Maze.java

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
1. Copy this maze into a text file maze1.txt Do not add spaces before or after the lines. Keep the newlines as shown here.

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

#### Constructor

The file you will have to read contains a rectangular ascii maze with the following characters:

- **'#'** => Walls (locations that cannot be moved onto)
- **' '** => Empty Space (locations that can be moved onto)
- **'E'** => The location of the goal, if any (0 or more per file)
- **'S'** => The location of the start (1 per file)

  Your constructor must:

  1. Load maze text file
  2. Set animate to false by default
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

#### Some other test cases

The solution for the following maze is 2. There should not be explored spots that are not part of the solution (no '.').

```
#######
###E###
### ###
#E S E#
### ###
###E###
#######
```

The solution for the following maze should be either 2 or 6. There should not be explored spots that are not part of the solution (no '.').
```
#######
#S    #
# ### #
#E###E#
#######
```

#### Animation

When you modify the maze by adding '@' and '.', you may add the following code:

```
if (animate) {
    gotoTop();
    clearTerminal();
    System.out.println(this);
    wait(200);
}
```

#### Color your output with this command

```
java Driver | sed -e 's/#/\x1b[47;39m#\x1b[39;49m/g' -e 's/@/\x1b[33m@\x1b[39;49m/g' -e 's/\./\x1b[49;32m\.\x1b[39;49m/g'
```

#### Carve a maze

Given a maze with only walls. You must carve a sequence of paths. Please follow these directions:

- Add a new constructor to your Maze.java, where you create a maze with only walls.
- Your constructor call the method carveMaze(row, column) and then place one 'S' and one 'E'.

**How to carve the maze?**

You must randomize the moves in the different directions, but you should not use the same directions twice.

For example, you may:

- Generate a random array cosidering 4 possible moves and loop through that array. 
- Generate an array with 4 posible moves, and remove those in a random order.

```
public Maze(int rows, int cols){
  maze = new char[rows][cols];
  for(char[]row:maze){
    for(int i = 0; i < row.length;i++){
      row[i]='#';
    }
  }
  carveMaze(1,1);
  addSE();
}


public void addSE() {
}


/* Recursion will end when there are no more valid directions left to explore
 * from the current position ensuring that dead ends are reached.
 */
public void carveMaze(int row, int col) {
  // Base Case
  // if (row, col) is a border, space or it has more than 1 adjacent spot with spaces => return

  // Recursive Case
  // Change spot at (row, col) to a space
  // Define an array or ArrayList with directions
  // For each direction randomly selected => call carveMaze in that direction
}
```
