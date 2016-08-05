
package array;
/**
 * @author Charmi
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        //Create an ArrayList to hold some names.
        ArrayList <String> nameList = new ArrayList<String>();
        
        //Add some names to the ArrayList.
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");
        
        //Display the size of the ArrayList.
        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");

        //display the items in nameList.
        for(int index = 0; index < nameList.size(); index++)
            System.out.println("Index: " + index + " Name: " +nameList.get(index));
        //Example of an enhanced for loop:
        for(String name : nameList)
            System.out.println(name);
            
       //Now remove the item at index 1.
      // nameList.remove(1);
       //System.out.println("The item at index 1 is removed. " + "Here are the items below. ");
       
       //display the items in nameList and their indicies
       for(int index = 0; index < nameList.size(); index++)
       {
           System.out.println("Index: " + index + " Name: " + nameList.get(index));
       }
       
       int i = find(nameList, "Catherine");
       if(i == -1)
            System.out.println("Not found");
       else
            System.out.println("Name found at index: " + i);
    }
    
    public static int find(ArrayList<String> demo, String find)
    {
        
        for(int index = 0; index < demo.size(); index++)
        {
            if(demo.get(index).equals(find))
                return index;
        }
        return -1;
   }
}
