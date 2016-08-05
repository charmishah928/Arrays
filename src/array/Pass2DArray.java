package array;
/**
 *
 * @author Charmi
 */
public class Pass2DArray
{
   public static void showArray(int[][] num)
   {
       for(int row = 0; row < num.length; row++)
       {
           for(int col = 0; col < num[row].length; col++)
           {
               System.out.print(num[row][col] + ", ");
           }
           System.out.println(" ");
        }
    }
   
   public static int rowSum(int[][] array, int row)
   {
      int total = 0;
       for(int c = 0; c < array[row].length; c++)
      {
          total += array[row][c];
        }
        return total;
   }
   
   public static int colSum(int [][] array, int col)
   {
       int total = 0;
       for(int r = 0; r < array.length; r++)
       {
           total += array[r][col];
        }
        return total;
    }
   
   
   public static void main(String[] args)
   {
       int[][] numbers = { {1,2,3,4} , {5,6,7,8}, {9,10,11,12}};
       //Display the contents of the array
       System.out.println("Here are the values in the array.");
       
       showArray(numbers);
       int sum = rowSum(numbers, 1);
       System.out.println(sum + " is the sum");
       
       for(int r = 0; r < numbers.length; r++)
       {
           System.out.println("Sum for row " + r + " is " + rowSum(numbers, r));
       }
       
       for(int c = 0; c < numbers[0].length; c++)

       {
           System.out.println("Sum for column " + c + " is " + colSum(numbers, c));
        }
       //System.out.println("The sum of the values is " + arraySum(numbers));
    }
}
