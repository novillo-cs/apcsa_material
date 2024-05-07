class Ball{
  float x, y;
  float xVel, yVel;
  color c;
  
  Ball(float x, float y, float xVel, float yVel){  
      this.x = x;
      this.y = y;
      this.xVel = xVel;
      this.yVel = yVel;
      c = color(random(255), random(255), random(255));
  }

  void move(){
    //change the x based on the xVel
    //change the y based on the yVel
x += xVel
y += yVel
  }

  void bounce(){
    // If a ball touches any border of the sketch
    // change the direction of the movement multiplying by -1
  }
  
  void display(){
    // Draw a circle at the x, y position
    // Make width and height = 50
    // Make sure it is the correct color
circle (x, y, 50);
fill(c);
  }
  
}
