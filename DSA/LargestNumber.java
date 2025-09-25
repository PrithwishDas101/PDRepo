import java.util.*;

public class LargestNumber 
{
    public static String largestNumber(int[] arr)               // [3,30,34,5,9]
    {
        String[] strArr = new String[arr.length];               // compare numbers as strings => a new String[] of same length
        
        for (int i = 0; i < arr.length; i++) 
        {
            strArr[i] = String.valueOf(arr[i]);                 // converting array elements into string data type
                                                                // arr1 = [3, 30, 34, 5, 9] => strArr = ["3", "30", "34", "5", "9"]
        }

        Arrays.sort(strArr, (a, b) -> (b+a).compareTo(a+b));    // custom sorting method for 2 string a, b 
                                                                // if b + a is greater than a + b => then b comes first
                                                                // 3  vs 30 => "330" vs "303" => "330" is bigger => 3  before 30
                                                                // 34 vs  3 => "343" vs "334" => "343" is bigger => 34 before 3
                                                                // 5  vs 34 => "534" vs "345" => "534" is bigger => 5  before 34
                                                                // 9  vs  5 =>  "95" vs  "59" =>  "95" is bigger => 9  before 5
        
        if (strArr[0].equals("0"))                     // After sorting => if first number = "0" => next numbers 0 as well
        {
            return "0";                                         // return "0" instead of "000..."
        }

        StringBuilder sb = new StringBuilder();                 // efficiently building the final string => Better than + in loop
        for (String s : strArr)                                 
        {
            sb.append(s);                                       // join the sorted strings together to form the final largest number 
                                                                // "9" + "5" + "34" + "3" + "30" => "9534330"
        }

        return sb.toString();                                   // returns 9534330 as a string data type
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {3, 30, 34, 5, 9};
        int[] arr2 = {54, 546, 548, 60};
        int[] arr3 = {3, 4, 6, 5, 9};
        int[] arr4 = {0, 0, 0};

        System.out.println(largestNumber(arr1)); 
        System.out.println(largestNumber(arr2));
        System.out.println(largestNumber(arr3));
        System.out.println(largestNumber(arr4));
    }
}
