
ArrayList<Ball> ballList;

void setup() {
  size(1000, 800);
  ballList = new ArrayList<Ball>();
}

void mouseClicked() {
  //add a new Ball to the ballList, constructed as follows:
  //The x and y positions are the same as the mouse
  //the xVel and yVel should be random values in the range (-3.0, 3.0)
}

void draw() {
  // You may change the background
  background(173, 216, 230);
  // Make each Ball object stored in the ArrayList move, bounce and display;
  fill(0);
  text(ballList.size(), 20, 40);
}
