static final int SQUARE_SIZE = 80;
int [][]grid;

void setup() {
  size(500, 420);
  // This is just a SAMPLE grid (2D array): columns map to X, rows map to Y
  // This grid must be of dimensions: int[width/SQUARE_SIZE][height/SQUARE_SIZE]
  // grid = new int[height/SQUARE_SIZE][width/SQUARE_SIZE];
  // Assign random 1 or 0 values to each position of your grid
  grid = new int[][] { {1, 0, 1, 0, 1, 0 },
                       {1, 1, 0, 1, 0, 1 },
                       {1, 0, 0, 1, 0, 1 },
                       {0, 1, 0, 0, 1, 1 },
                       {0, 1, 1, 1, 0, 0 } };
}


void draw() {
  // First, test drawGrid()
  // drawGrid();
  // Second, when drawGrid() works, you may comment it out. Then, you can implement fillGrid(int[][]colors)
  // fillGrid(grid);
}


/* Fill the screen with squares.
 * Border color should be white.
 * No worries if the is a gap on the right and bottom side.
 */
void drawGrid() {

}

/* Fills the squares based on the grid values 0 ana 1
 * When the value is 0, choose a color to fill the square from 0 to 255 
 * When the value is 1, choose a different color from 0 to 255
 */
void fillGrid(int[][]colors) {

}
 


/* mouseClicked() is function called after a mouse button has been pressed and then released. 
 * When you click on a square, you must change the value in the grid 2D array. Alternate between 0 and 1.
 * Identify the square based on the mouse position variables: mouseX and mouseY.
 * Call the method fillGrid(int[][])
 * Clicking this will toggle the color displayed by your method fillGrid(int[][]).
 * Make sure you are invoking the method fillGrid(int[][]) in your draw().
*/
void mouseClicked() {

}
