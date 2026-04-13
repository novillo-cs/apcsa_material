Save your work here: `.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/04_13_avatar/avatar/avatar.pde`


Create an avatar and implement 4 animations:

- Reset: The avatar should move vertically or horizontally and when it touches the border, it goes back to the original position
- Bounce: The avatar should move in any direction, and when it touches a border, it bounces back.
- Radom: The avatar should appear at random positions.
- Mouse: The avatar should follow your mouse.

```
int x, y, animation;

void setup(){
  size(800, 600);
  x = width/2;
  y = height/2;
  animation = 2;
}

void draw(){
  background(255, 192, 203); // You may change the background
  avatar();
  if (animation == 1) {
    // reset
  }
  else if (animation == 2) {
    // bounce
  }
  else if (animation == 3) {
    // random position
  }
  else if (animation == 4) {
    // mouse position
    // Read: https://processing.org/reference/mouseX.html
  }
  else {
    x++;
    y++;
  }

}
```
