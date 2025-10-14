public class Rectangle{
    /* INSTANCE VARIABLES 
     * IMPORTANT: Should be private*/
    private int width;
    private int height;
    
    /* Static Variable */
    private static int totalRectangles = 0;
    
    /* CONSTRUCTORS: You may have more than one */
    
    /* Default Constructor */
    public Rectangle(){
    	  totalRectangles++;
    }
    
    /* Constructor 2 parameters */
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        totalRectangles++;
    }

    /* Constructor 1 parameter (square) */
    public Rectangle(int side){
        width = side;
        height = side;
        totalRectangles++;
    }
    
    /* Accessor/Getter methods */
    public int getWidth() {
        return width;
      }
      
    public int getHeight() {
        return height;
      }

    /* Setter methods */
    public void setWidth(int newWidth) {
        width = newWidth;
      }
      
    public void setHeight(int newHeight) {
        height = newHeight;
      }

     /* Other non-static methods */
     public int calcArea(){
       return width * height;
     }

     /* static method */
     public static void printMsg(){
       System.out.println("Hi! Rectangle class ");
     }
     
     public static int getTotalRectangles(){
	      return totalRectangles;
     }

}
