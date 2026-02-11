# N-Queens

## Day 1

### Problem

N queens must be placed on a NxN chessboard so that no queen can attack any other queen. The queen moves in 8 directions and can directly attack in these 8 directions only.

![image](images/q1.png)

Remember, you may place only 1 queen in each row, column, diagonal. 

![image](images/q2.png)

Based on this logic, we do not care about threatened spots if they are in the same row or higher.

![image](images/q3.png)

![image](images/q4.png)

- How would you solve this problem with recursive backtracking? Would you duplicate the entire board each time you make the recursive call?

- How could you place the queens on the board making sure no queens will attack each other?

- How can you indicate if a position on the board is safe to add a queen?

- Write a detailed pseudocode for the methods addQueen(...) and removeQueen(...)

- You may represent a queen with -1. Safe spots with 0. Threatened spots >= 1.

### Methods that could be added to your code

```
/**
*@return true when the queen added correctly, false Otherwise
*@precondition r and c are valid indices of the board array
*@postcondition the board is only changed when the function returns true
* in which case the queen is added and all it's threatened positions are incremented.
*/
private boolean addQueen(...){

}

/**Remove the queen that was added to r,c
*@precondition r and c are valid indices of the board array and there is a queen at position r,c
*@postcondition the board is modified to remove that queen and all it's
*threatened positions are decremented
*/
private void removeQueen(...){

}
```

Respond to the questions here:  `.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/02_09_NQueens/answers.txt (or md, docx, pdf)`

Write the pseudocode here:  `.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/02_09_NQueens/pseudocode.txt (or md, docx, pdf)`

Write and test the functions here:  `.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/02_09_NQueens/NQueens.java`

## Day 2

### Implementation

- Create a class NQueens (NQueens.java)
- There must be an instance variable board[][] which is a 2D array of integers.
- A queen should be represented with a -1.
- Squares that are not safe to place a queen must be represente with the number of queens threatening the square.
- Calculate squares that are not safe below each queen.
- Write methods addQueen and removeQueen
- Create a Driver.java to test your methods.

```
Given: int[][] board = new int[4][4];

addQueen(0,0);

[-1 0 0 0]
[ 1 1 0 0]
[ 1 0 1 0]
[ 1 0 0 1]

```


```
addQueen(1,2);

[-1 0  0 0]
[ 1 1 -1 0]
[ 1 1  2 1]
[ 2 0  1 1]

```

- Write the method toString()

```
/**
*@return The output string formatted as follows:
*All numbers that represent queens are replaced with 'Q'
*all others are displayed as underscores '_'
*There are spaces between each symbol:
_ _ Q _
Q _ _ _
_ _ _ Q
_ Q _ _
*/
public String toString(){}
```

## Recursive Methods

You must implement a method ```solve(int row)``` that returns false when the board cannot be solved and leaves the board filled with zeros. It returns true when the board can be solved, and leaves the board in a solved state.

You must have a ```solve()``` wrapper method that calls ```solve(0)``` to start the recursion on the starting row. (Your recursion increments the row).

A wrapper method is used to support recursion. This method will not actually perform recursion but will call one that does. The wrapper method may: Validate parameters.

You must clear the board before attempting to solve.

You must implement a method ```countSolutions(int row)``` that returns the total number of solutions found.

## Day 3

### Animation (Optional)

Animation is optinal for this lab.

Add the following instance variables and methods to your file:

```private boolean animated``` => It is false by default, but when it changes to true solve will print the animation. Otherwise, nothing will be printed.

```private int delay``` => It is the wait time in your animation. The default value is 1000.

```public void setAnimate(boolean newValue)``` => It sets the animated variable to the newValue received as parameter.

```public void setDelay(int newValue)``` => It sets the delay variable to the newValue received as parameter. Any value less than 0 should set to 0.

#### Part 1

- You will need the Text.java file provided.

- Add the following code after a queen has been successfully added. You may also add it after removing a queen:

```
if(animated){
  Text.go(1,1);
  System.out.println(this);
  Text.wait(delay);
}
```

- Add the following code in your main:

```
NQueens queens = new NQueens(8);
queens.setAnimate(true);
System.out.println(Text.CLEAR_SCREEN);
System.out.println(Text.HIDE_CURSOR);
Text.go(1,1);
queens.solve()
System.out.println(Text.RESET);
```

### Part 2

Add the board size and the wait time for animation as arguments when running your NQueens program.

**Examples:**

```java Driver``` It will solve and print the solution to an 8x8 board.

```java Driver 4``` It will solve and print the solution to a 4x4 board.

```java Driver 5 1000``` It will animate the solving of a 5x5 board.

How to use it:

```
int size = 8;

if(args.length > 0){
  size = Integer.parseInt(args[0]);
}
NQueens queens = new NQueens(size);;
if(args.length > 1){
  queens.setAnimate(true);
  queens.setDelay(Integer.parseInt(args[1]));
}
System.out.println(Text.CLEAR_SCREEN);
System.out.println(Text.HIDE_CURSOR);
Text.go(1,1);
queens.solve();
System.out.println(Text.RESET);
Text.go(1,1);
System.out.println(queens);
```

Number of solutions for N Queens

N | Solutions
------------- | -------------
1  | 1
2  | 0
3  | 0
4  | 2
5  | 10
6  | 4
7  | 40
8  | 92
9  | 352
10  | 724




You must have a ```countSolutions()``` wrapper method that calls ```countSolutions(0)``` to start the recursion on the starting row. (Your recursion increments the row).

