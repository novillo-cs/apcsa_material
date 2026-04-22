class Ball{
  PVector location;
  PVector velocity;
  PVector acceleration;
  color c;
  float mass;
  
  Ball(float x, float y, float xVel, float yVel){  
      location = new PVector(x, y); 
      velocity = new PVector(xVel, yVel);
      acceleration = new PVector(0, 0);
      c = color(random(255), random(255), random(255));
      mass = random(0.2, 2);
  }

 
  void move(){
    // Add the needed code to show how:
    // velocity changes location
    // acceleration changes velocity
    // Every frame of animation should reset the previous accelartion.
    // Otherwise, acceleration will increase after each frame
    
    velocity.limit(5); //let's have a limit velocity cannot have a magnitud greater than 5
  }

  void bounce(){
    // Update your bounce code to use vectors

  }
  
  void applyForce(PVector force){
    // acceleration = force / mass
    // Create a force vector
    // Update the acceleration vector applying the acceleraion formula
    // IMPORTANT: More than one force could be applied, so you need to add the forces
    // to have the net force

    
  }

  
  void display(){
    stroke(1);
    strokeWeight(2);
    fill(c);
    ellipse(location.x, location.y, 50 * mass, 50 * mass);
  }
  
}
