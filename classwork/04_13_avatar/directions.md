Save your work here: `.../APCSA2/apcsa-assignments-spring-YourUsername/classwork/04_13_avatar/avatar/avatar.pde`

# Day 1


Create an avatar and implement 4 animation modes:

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

# Day 2

1. Add a new animation mode **Wrap**: when the avatar leaves one side of the screen, it reappears on the opposite side

**Example:**

Goes off the left then appears on the right

Goes off the top then appears at the bottom

2. The user must be able to switch the animation using the keyboard (example: keys 1, 2, 3, 4 and 5)

3. Each animation mode must have a different background color. The background should update automatically when the animation mode changes.

### Optional Challenges:

**Add obstacles**

- Create at least one rectangular wall on the screen. The avatar must bounce off the wall (bounce mode, other modes ignore the wall).
  
- Change avatar color when it hits a wall.

Be creative and add any features to your project.

### Suggestions

- Test one feature at a time before adding the next.

- Use println() to debug values like position.
