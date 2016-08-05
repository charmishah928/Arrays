
package array;

/**
 *
 * @author Charmi
 */
public class practicingArrays 
{
    public static int getMax(int [] nums)
    {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public static int getMin(int[] nums)
    {
        int min = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < min)
                min = nums[i];
        }
        return min;
    }

    public static int getSum(int[] nums)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        return sum;
    }

    public static double getAverage(int[] nums)
    {
       /** double average = 0;
        for(int i = 0; i < nums.length; i++)
        {
            average += nums[i];
        }
        return (double)(average/nums.length); **/
        //OR YOU CAN
        int sum = getSum(nums);
        return (double)(sum)/(nums.length);
    }

    public static void printArray(int[] nums)
    {
        System.out.print("{ ");
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println("}");
    }
    
    public static void main(String[] args)
    {
        int[] numbers = {10, 15, 5, 25, 6, 8, 9};
        int high = getMax(numbers);
        int low = getMin(numbers);
        int sum = getSum(numbers);
        double average = getAverage(numbers);
        System.out.println("The highest is " + high + ". The lowest is " + low + ". The sum is " + sum);
        System.out.println("Average: " + average);
        printArray(numbers);
        
        int[][] numbers1 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int total;
        for(int col = 0; col < numbers1[0].length; col++)
        {
            total = 0;
            for(int row = 0; row < numbers1.length; row++)
                total += numbers1[row][col];
            System.out.println("Total of column " + col + " is " + total);
        }
    }
    
  
}

