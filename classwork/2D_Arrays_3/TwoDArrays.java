import java.util.Arrays;

public class TwoDArrays{
    public static void main(String[]args){
        //  Write a few test cases in the main method to test your code.
        // You may use Arrays.deepToString(your2DArray) to print 2d arrays
    }

    // Method Overloading: The next two methods have the same name and different parameter list

    // Returns the sum of all elements in a specific row
    public static int sumMatrix(int[][] matrix, int row) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
            {if (matrix[][] == matrix[i][row])
            {count  = count + matrix[i][row];}}
        return count;
    }

    // Returns the sum of all elements between rowStart and rowEnd (inclusive).
    public static int sumMatrix(int[][] matrix, int rowStart, int rowEnd){
        int count = 0;
        for (int i = 0; i >= rowStart && i <= rowEnd; i++)
            {count = count + matrix[i][]}
         return count;
    }

    // Return how many elements are zero in the 2D array
    public static int countZeros(int[][] nums){
        return 0;
    }

    /* The last element in row is incorrect.
       Fix the last column in row as follows:
       If row = 0, last col = number of rows
       If row = 1, last col = total number of elements in the array
       If row = 2, last col = sum of values in first and last rows in the 2D array
       Other rows, last col = 0
       Precondition: arr.length >= 3, row is a valid indix */
     public static void updateLastCol(int[][] arr, int row) {
    
     }
    
    /* Modify a given 2D array of integer as follows:
       Replace all the negative values:
         - When the row number is the same as the column number replace that negative with the value 1
         - All other negatives replace with 0 */
    public static void replaceNegative(int[][] vals){

    }

    /* Make a copy of the given 2d array.
       When testing : make sure that changing the original does not change the copy.
       DO NOT use any built in methods that copy an array.
       You may write a helper method for this. */
    public static int[][] copy(int[][] nums){
        return new int[1][1];
    }


    /* Make an HTML table by putting a table tag around the entire 2d array,
       tr tags around each row, and td tags around each value.
       You may use a helper method
       Note there is no whitespace in the string, it all one line with no spaces/tabs.
       e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
       "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>" */
    public static String htmlTable(int[][]nums){
        return "";
    }
}
