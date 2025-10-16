public class Point{
    // Instance variables

    private double x,y;

    // Constructors

    // Initialize this Point with the xVal and yVal parameters
    public Point(double xVal, double yVal){
        x = xVal;
        y = yVal;
    }

    // Initialize this Point with other Point's values
    public Point(Point other){
        // YOUR CODE HERE
    }

    // Getters

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    
    // Print the coordinate like this "(5.0, 3.0)"

    public String toString(){
        // YOUR CODE
        return "";
    }

    /*
    Write distance method
    */
    public static double distance(Point a, Point b){
        // YOUR CODE HERE
        return 0.0;
    }

    /*
    The parameter list is different from distance method
    Do not duplicate your code
    Reuse code from prior methods
    */
    public double distanceTo(Point other){
        return 0.0;
    }
}
