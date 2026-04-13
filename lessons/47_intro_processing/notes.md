# Processing

Processing is a programming language based on Java.

## Running Processing

In the lab: Open a terminal, type processing and press enter.

At home: [Download](https://processing.org/download) and install processsing depending on your OS and how you install it, you will have a shourtcut or your will run it using the terminal (./processing).

## Documentation

Built in documentation: Click on Help and then Reference.

## Writting a program

1. If you want to draw some shapes without creating methods. You may deifne a setup function and write your code there.

```
void setup(){}
```

2. If you want to create a program with multiple methods, you need to have a setup function and optionally a draw method. You may include instance variables as well.

```
void setup(){}

void draw(){}

void method1(){}

...

```

### draw():

The draw() function continuously executes the lines of code contained inside its block until the program is stopped or noLoop() is called. draw() is called automatically and should never be called explicitly.
## Fist Program

### Sketch:

```size(600,400);```

It will create a canvas 600 px wide and 400 px high.

### Background

- Grey scale: single number (0 is black, 255 is white, other numbers are gray)
  ```background(50);```
  
- RGB: three values
  ```background(220, 25, 65);```

### Coordinate System in Processing

![image](https://github.com/user-attachments/assets/3d6fe833-42ca-4671-81d1-2bfeb24b3b9c)


Please read the [documentation](https://processing.org/tutorials/gettingstarted) to get familiar with Processing

Here is an example of how to add simple shapes to your program.
  
```
void setup(){
  size(800, 600);
  
  background(255, 192, 203);
  
  line(250, 400, 320, 400); // line( x1, y1, x2, y2); 
  
  rect(0, 0, 200, 50);     // rect(x, y, w, h);
  
  stroke(255, 0, 0);       // Sets the color used to draw lines and borders around shapes.
  fill(160, 210, 230);     // Sets the color used to fill shapes. 
  rect(300, 150, 200, 100);
  
  stroke(20, 100, 130);
  fill (255, 255, 255);
  ellipse(300, 150, 70, 70);
  
  stroke(0, 0, 255);
  fill(160, 220, 90);
  ellipse(500, 400, 100, 100);
}
```
