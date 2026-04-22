ArrayList<Ball> ballList;

void setup() {
  size(1000, 800);
  ballList = new ArrayList<Ball>();
}

void mouseClicked() {
  if (mouseButton == LEFT) {
    float x = mouseX;
    float y = height/2;
    // First test with these values
    float xVel = 0;
    float yVel = 2;
    // When your code is working you may try with random velocities
  //  float xVel = random(-3, 3); 
   // float yVel = random(-3, 3);
    ballList.add(new Ball(x, y, xVel, yVel));
  }
}

void draw() {
  // Add a gravity force vector
  // Apply the gravity force to your objects (ball)
  
  // If you right-click on the sketch create a wind vectpr and apply this force to your objects
  
  background(173, 216, 230);
  for (Ball b : ballList) {
    if (mousePressed && mouseButton == RIGHT){
    }
    b.move();
    b.bounce();
    b.display();
  }
  fill(0);
  text(ballList.size(), 20, 40);

  
}
