int x, y;

void setup(){
  size(800, 600);
  
  x = 180;
  y = 190;

}

void draw(){
  background(255, 192, 203);
  avatar();
  x++;
  y++;
  //avatar(x+100,y+100);
}
void avatar(){

  // left arm
  stroke(1);
  strokeWeight(2);
  line(x, y, x-80, y-60 );
  strokeWeight(1);

  // body
  // bottom
  noStroke();
  fill(255);
  //middle
  ellipse(x+20, y, 80, 80);
  //head
  ellipse(x+20, y-70, 70, 70);
  stroke(1);

  //eyes
  //left eye
fill(0);
  ellipse(x, y-70, 12, 12);
  //right eye
  ellipse(x+25, y-65, 15, 15);

  //buttons
  //first button
  fill(0);
  ellipse(x+5, y-25, 10, 10);
  ellipse(x, y+5, 10, 10);
  ellipse(x+5, y+30, 10, 10);
  noFill();

  // hat
  fill(0);
  ellipse(x+20,y-90,90,15);
  rect(x-5,y-150,50,60);
  ellipse(x+20,y-150,50,10);

  // nose
  //triangle(x1, y1, x2, y2, x3, y3)
  fill(#F58905);
  triangle(x-5, y-60, x+15, y-60, x+15, y-50 );
  noFill();

  // right arm
  strokeWeight(2);
  line(x+40, y-10, x+120, y-60 );
  strokeWeight(1);



}
