public class Driver{
    public static void main(String[]args){
    	// Create an object rect
        Rectangle rect = new  Rectangle(4, 7);
        
        //Total Rectangles
        System.out.println("Total Rectangles: " + Rectangle.getTotalRectangles() );
        
        //Can view and change the width
        System.out.println("initial rect w: " + rect.getWidth() );
        rect.setWidth(2);
        System.out.println("updated rect w:" + rect.getWidth() );

        //Can view and change the height
        System.out.println("initial rect h: " + rect.getHeight() );
        rect.setHeight(5);
        System.out.println("updated rect h: " + rect.getHeight() );

        //Calc. area
        System.out.println("Area: " + rect.calcArea() ); 

	// Create an object rect1
        Rectangle rect1 = new  Rectangle();
        
        //Total Rectangles
        System.out.println("Total Rectangles: " + Rectangle.getTotalRectangles() );

        System.out.println("rect1 w: " + rect1.getWidth() );
        System.out.println("rect1 h: " +  rect1.getHeight() );

	rect1.setWidth(3);
	rect1.setHeight(4);
	
        System.out.println("updated rect w:" + rect1.getWidth() );
        System.out.println("updated rect h: " + rect1.getHeight() );
        
	// rect2 becomes rect1
        Rectangle rect2 = rect1;
        
        System.out.println("initial rect2 w: " + rect2.getWidth() );
        System.out.println("initial rect2 h: " +  rect2.getHeight() );
        
        rect1.setHeight(10);
        rect2.setWidth(20);

        //System.out.println("updated rect1 w: " + rect1.getWidth() );
        //System.out.println("updated rect1 h: " +  rect1.getHeight() );
        //System.out.println("updated rect2 w: " + rect2.getWidth() );
        //System.out.println("updated rect2 h: " +  rect2.getHeight() );        
  
  	// call printMsg
        Rectangle.printMsg();
        
        // Can we make this call? 
      // System.out.println("Area: " + Rectangle.calcArea() ); 
        
	// Can we make this call? 	       
         //rect2.printMsg();

    }

}
