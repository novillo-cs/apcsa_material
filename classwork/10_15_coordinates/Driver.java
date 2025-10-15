public class Driver{

  // Additional methods not shown
  
  public static void main(String[] args){
    
    // Point is a class that represents a 2D coordinate
    Point point1 = new Point(4, 6);
    Point point2 = new Point(2, 8);
    System.out.println(distance(point1, point2));
    System.out.println(Point.distance(point1, point2));
    System.out.println(point1.distanceTo(point2)); 
  }
  
}

/* There are 3 different distance method called in the main method:
*  1. distance(point1, point2)
*  2. Point.distance(point1, point2)
*  3. point1.distanceTo(point2)
*  
*  For each of those methods respond the following questions:
*  1. Where is the method implemented (which class)? Justify your answer.
*  2. Is the method static or non-static? Justify your answer.
*/
