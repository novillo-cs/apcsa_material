import java.util.Arrays;

public class TwoDArrays{
    public static void main(String[] args){
 int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int[][] b= {{-1,2,-3},{4,-5,6},{-7,8,9}};

 System.out.println("sum row 0: "+sumMatrix(a,0));
System.out.println("sum rows 0-2: "+ sumMatrix(a,0,2));


        
      replaceNegative(b);
System.out.println("b after replceNegative: "+Arrays.deepToString(b));

        
 updateLastCol(a,0);
updateLastCol(a,1);
        System.out.println("a after updateLastCol: "+Arrays.deepToString(a));

        
int[][] c = copy(a);
c[0][0]=999;
 System.out.println("a after modifing copy: "+Arrays.deepToString(a));
   System.out.println("copy: "+Arrays.deepToString(c));

 System.out.println("htmlTabel for a: "+htmlTable(a));

    }
  // Returns the sum of all elements in a specific row
public static int sumMatrix(int[][] matrix, int row) {
      int count = 0;
for (int i = 0; i < matrix[row].length; i++) {
   count = count + matrix[row][i];
    }
    return count;
}
    // Returns the sum of all elements between rowStart and rowEnd (inclusive).
public static int sumMatrix(int[][] matrix, int rowStart, int rowEnd){
    int sum = 0;
    for(int i = rowStart; i <= rowEnd; i++){
        for(int j = 0; j<matrix[i].length; j++){
            sum = sum + matrix[i][j];
        }
    }
    return sum;
}

    // Return how many elements are zero in the 2D array
    public static int countZeros(int[][] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums[i].length; j++) {
    if (nums[i][j] == 0) {
    count++;
    }
    }
    }
    return count;
    }

  /* The last element in row is incorrect.
   Fix the last column in row as follows:
   If row = 0, last col = number of rows
   If row = 1, last col = total number of elements in the array
   If row = 2, last col = sum of values in first and last rows in the 2D array
   Other rows, last col = 0
   Precondition: arr.length >= 3, row is a valid index
*/
public static void updateLastCol(int[][] arr, int row) {
    int lastCol = arr[row].length - 1;

    if (row == 0) {
        arr[row][lastCol] = arr.length;}

        
    else if (row == 1) {
        int total = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
                    total += arr[i][j];}}
        arr[row][lastCol] = total;} 
     else if (row == 2) {
          int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[0][j];
              sum += arr[arr.length - 1][j];}
             arr[row][lastCol] = sum;} 
    else {
        arr[row][lastCol] = 0;}
}
    
    /* Modify a given 2D array of integer as follows:
       Replace all the negative values:
         - When the row number is the same as the column number replace that negative with the value 1
         - All other negatives replace with 0 */
    public static void replaceNegative(int[][] vals)
    {
        for (int r = 0; r < vals.length; r++)
        {
                for (int c = 0; c < vals[r].length; c++)
            {
       if (vals[r][c] < 0)
                {
        if (r == c)
                 vals[r][c] = 1;
   else
                        vals[r][c] = 0;}}}
    }

       /* Make a copy of the given 2d array.
           When testing : make sure that changing the original does not change the copy.
         DO NOT use any built in methods that copy an array.
            You may write a helper method for this. */
        public static int[][] copy(int[][] nums)
    {
            int[][] copy = new int[nums.length][];
   
        for (int r = 0; r < nums.length; r++)
        {
                copy[r] = new int[nums[r].length];
            for (int c = 0; c < nums[r].length; c++)
                    copy[r][c] = nums[r][c];
                
        
    }
          return copy;
    }

    /* Make an HTML table by putting a table tag around the entire 2d array,
       tr tags around each row, and td tags around each value.
       You may use a helper method
       Note there is no whitespace in the string, it all one line with no spaces/tabs.
       e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
       "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>" */
               public static String htmlTable(int[][] nums)
    {
           String result = "<table>";
         for (int r = 0; r < nums.length; r++)
         {
       result += "<tr>";
         for (int c = 0; c < nums[r].length; c++)
  result += "<td>" + nums[r][c] + "</td>";
      result += "</tr>";}
          result += "</table>";
         return result;
    }
