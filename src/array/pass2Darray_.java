
package array;
/**
 *
 * @author Charmi
 */
public class pass2Darray_
{
    public static int rowSum(int[][]array, int row)
    {
        int sum = 0;
        for(int c = 0; c <array[row].length; c++)
        {
            sum = sum + array[row][c];
        }
        return sum;
    }

    public static int colSum(int [][] array, int col)
    {
        int sum = 0;
        for (int r = 0; r<array.length; r++)
        {
            sum = sum + array[r][col];
        }
        return sum;
    }

    public static int getHighestInRow(int[][]array, int row)
    {
        int highest = array[row][0];

        for(int c = 0;c<array[row].length;c++)
        {if (array[row][c] > highest)
                highest = array[row][c];}
        return highest;
    }

    public static int getLowestInRow(int[][]array, int row)
    {
        int lowest = array[row][0];

        for(int c = 0;c<array[row].length;c++)
        {
            if (array[row][c] < lowest)
                lowest = array[row][c];
        }
        return lowest;
    }

    public static void showArray(int [] [] array)
    {
        for (int r = 0; r<array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                System.out.print(array[r][c] + " ");
            }
            System.out.println("");
        }
    }

    public static int arraySum(int [] [] arrays)
    {
        int total = 0;
        for(int r = 0; r<arrays.length; r++)
        {
            for(int c = 0; c<arrays[r].length; c++)
            {
                total += arrays[r][c]; 
            }
        }
        return total;
    }

    public static int getAverage(int [] [] arrays)
    {
        int average = 0;
        int r = arrays.length;

        int totalNum = r*r;
        average = arraySum(arrays)/totalNum;

        return average;
    }

    public static void main(String[]args)
    {
        int [] [] numbers = {{2,1,9},
                {7,3,4},
                {5,6,8}};

        System.out.println("Processing iarray.");
        showArray(numbers);
        System.out.println("The sum of the values " + "is " + arraySum(numbers));
        System.out.println("The average of the array is " + getAverage(numbers));
        for(int r = 0; r<numbers.length; r++)
        {
            System.out.println("Sum of row " + r + " is " + rowSum(numbers,r));
        }
        for(int c = 0; c<numbers[0].length; c++)
        {
            System.out.println("Sum of column " +c+ " is " + colSum(numbers,c));
        }
        for(int r = 0; r<numbers.length; r++)
        {
            System.out.println("The highest in row " +r+ " is " + getHighestInRow(numbers,r));
        }
        for(int r = 0; r<numbers.length; r++)
        {
            System.out.println("The lowest in row " +r+ " is " + getLowestInRow(numbers,r));
        }
    }
}