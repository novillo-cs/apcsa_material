void setup(){
  size(1370,800);
  PImage bird = loadImage("bird.jpg");
  PImage output = bird.copy();
  Kernel k = new Kernel( new float[][] {
    {-1, -1, -1},
    {-1, 8, -1},
    {-1, -1, -1}
  } );
  Kernel k2 = new Kernel( new float[][] {
    {.11, .11, .11},
    {.11, .11, .11},
    {.11, .11, .11}
  } );
  k.apply(bird, output);
  image(bird,0,0);
  image(output, bird.width,0);
}
