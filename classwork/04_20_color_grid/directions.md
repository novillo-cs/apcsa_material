# Color Grid

### Part 1: Grid with Click-to-Toggle

- Write a method drawGrid() that fills the screen with evenly sized squares. Each square should have a white border. It’s okay if there’s a small gap on the right or bottom edges due to the canvas size.

- Write a method fillGrid(int[][] grid) that fills the squares based on the values in a 2D array. The colors should be white, black or gray.

   - A value of 1 in the grid means the square should be filled with any color from 0 to 255.

   - A value of 0 means the square should be filled with another color from 0 to 255.

- Use the sample 2D array provided in the starter code as reference.

- Make sure your methods work correctly when you change the canvas size or the size of each square.

- Complete the mouseClicked() method so that when the user clicks a square, the corresponding value in the 2D array toggles between 1 and 0.

Save your work here: ```.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/04_20_color_grid/ColorGrid/ColorGrid.pde```

### Part 2: Colorful Grid

- Create a new sketch. You can reuse and adapt your code from Part 1.

- Instead of an int[][] array, define your grid as a color[][] array:

```
color[][] grid;
grid = new color[rows][cols];
```

- When the user clicks on a square, fill that square with a random color.

- Color variables may be defined like this:

```
color myColor = #ff8383; //HEX
color myColor = color(240, 30, 100);  // RGB
```
Save your work here: ```.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/04_20_color_grid/ColorfulGrid/ColorfulGrid.pde```

### Optional Challenge

- Allow the user to click and drag to paint multiple squares continuously. **Hint:** mouseDragged() and mousePressed().
