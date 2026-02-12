public class ArrayMethods
{
    public static void main(String[] args)
    {
         int[][] a = {{8,4,2}, {1,0,9}, {5,7,8}};
int[][] b = {{1,3,4}, {2,4,3}, {3,4,5}};
        int[][] c = {{1,3,4}, {2,4,3}};
           int[][] d = {};

print(a);
     System.out.println("Sum: " + findSum(a));
print(transpose(b) );
    print(transpose(c));
print(transpose(d));
    }
    public static void print(int[][] array)
    {
   System.out.print("[");
  for (int i = 0; i < array.length; i++)
        {System.out.print("[");
        for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j]);
        
      if (j < array[i].length - 1)
  System.out.print(", ");

            
}
            System.out.print("]");
            if (i < array.length - 1)
                System.out.print(", ");
            }
        System.out.println("]");
            //return result;
    }
 
            public static int findSum(int[][] array)
    {
         int sum = 0;
         for (int i = 0; i < array.length; i++)
         {for (int j = 0;  j < array[i].length; j++)
                    sum += array[i][j];}
         return sum; }
public static int[][] transpose(int[][] array)
    {
        if (array.length == 0) return new int[0][0];
            int rows =array.length;
          int cols = array[0].length;
  int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++)
        {
                for (int j = 0; j < array[i].length; j++)
                result[j][i]  = array[i][j];}
        return result;
    }
}
