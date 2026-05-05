Use the left and right arrow keys to navigate between different kernels and display the name of the currently applied kernel.

'm'''
  currentKernel = 0;
  names = new String[]{
    "Identity", "Blur", "Sharpen",
    "Outline", "Left Sobel", "Right Sobel",
    "Top Sobel", "Emboss"
  };

  kernels = new Kernel[] {
    new Kernel( new float[][] {
      {0, 0, 0},
      {0, 1, 0},
      {0, 0, 0}
    }) ,
    new Kernel( new float[][] {
      {.111, .111, .111},
      {.111, .111, .111},
      {.111, .111, .111}
    }) ,
    new Kernel( new float[][] {
      {0, -1, 0},
      {-1, 5, -1},
      {0, -1, 0}
    }) ,
    new Kernel( new float[][] {
      {-1, -1, -1},
      {-1, 8, -1},
      {-1, -1, -1}
    }) ,
    new Kernel( new float[][] {
      {1, 0, -1},
      {2, 0, -2},
      {1, 0, -1}
    }) ,
    new Kernel( new float[][] {
      {-1, 0, 1},
      {-2, 0, 2},
      {-1, 0, 1}
    }) ,
    new Kernel( new float[][] {
      {1, 2,  1},
      {0, 0, 0},
      {-1, -2, -1}
    }),
    new Kernel( new float[][] {
      {-2, -1,  0},
      {-1, 1, 1},
      {0, 1, 2}
    })
  };
}'''
