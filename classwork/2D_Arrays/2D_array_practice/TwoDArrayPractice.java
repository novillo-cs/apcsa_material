public class TwoDArrayPractice
{

  public static void main(String[] args)
    {
      // Create test cases here.
      
      // Print the status of your 2D array before and after
      // invoking a method. You will need to add a print() method
      // to avoid duplicated code in your main.
    }

  
    /*
     * Swaps all values in the specified 2 rows of array.
    */
  public static void rowSwap(int[][] array, int rowAIndex, int rowBIndex)
    {
       new int[] temp = array[rowAIndex];
          array[rowAIndex] = array[rowBIndex];
        array[rowBIndex] = temp;
    }

  
    /**
     * Swaps all values in the specified 2 columns of array.
     */
    public static void colSwap(int[][] array, int colAIndex, int colBIndex)
    {
         new int[] temp2 = array[rowAIndex];
          array[rowAIndex] = array[rowBIndex];
        array[rowBIndex] = temp2;
    }

  
    /*
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.

     Examples:

      String[][] result = fillRows("Happy Halloween", 3, 4);
      
      result (after method call):
      "H"     "a"     "p"     "p"
      "y"     " "     "H"     "a"
      "l"     "l"     "o"     "w"
      
      
      String[][] result = fillRows("hello", 3, 4);
      
      result (after method call):
      "h"     "e"     "l"     "l"
      "o"     null    null    null
      null    null    null    null

     */
    public static String[][] fillRows(String str, int rows, int cols)
    {
            String[][] array = new String[rows][cols];
 int index = 0;

        for (int i = 0; i < rows; i++)
      {
    for (int j = 0; j < cols; j++)
        {
                    if (index < str.length())
          {
        array[i][j] = str.substring(index, index + 1);
            index++; }
              else {
array[r][c] = null;} }}
      return array;
    }
  
}    
