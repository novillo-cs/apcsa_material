/*
* Directions:
* 1. Continue working on yesterday's folder
* 2. Copy the file Point.java from the apcsa_material repo to your folder
* 3. Write a toString() method that returns the coordinate with this format "(2.0, 4.0)"
* 4. Write the Point constructor that receives a Point as paramether
* 5. Write the method: public static double distance(Point a, Point b) in Point
* 6. Write the method: public double distanceTo(Point other) non-static in Point
* 7. Write the method: public static double distance(Point a, Point b) in Driver
* 8. Add test cases to your main and verify the output
*/

public class Driver{

    /*
    * Do not duplicate your code
    * Reuse code
    */
    public static double distance(Point a, Point b){
        return 0.0;
    }

    public static void main(String[]args){
        Point point1 = new Point(4, 6);
        Point point2 = new Point(-2, 4);
        System.out.println( distance(point1, point2));
        System.out.println( Point.distance(point1, point2));
        System.out.println( point1.distanceTo(point2));
    }
}
