import java.util.*;

class PositiveNegative 
{
    static void rearrange(ArrayList<Integer> arr) 
    {
        ArrayList<Integer> pos=new ArrayList<>();            // to store positive elements from the given ArrayList
        ArrayList<Integer> neg=new ArrayList<>();            // to store negative elements from the given ArrayList
        
        for(int i:arr)
        {
            if(i>=0)
            {
                pos.add(i);
            }

            else
            {
                neg.add(i);
            }
        }

        arr.clear();                                         // to empty the given ArrayList 
        
        int i=0;

        for(i = 0; i < pos.size() && i < neg.size(); i++)     
        {
            arr.add(pos.get(i));                             // add the ith positive number first
            arr.add(neg.get(i));                             // then add the ith negative number 
        }

        while(i < pos.size())                                // if we run out of negatives but still have more positives left
        {                                                    
            arr.add(pos.get(i));                             // we add the remaining positive numbers one by one.
            i++;                                             // so we also increment the value of counter 
        }

        while(i < neg.size())                                // if we run out of positives but still have more negatives left
        {
            arr.add(neg.get(i));                             // we add the remaining negative numbers one by one.
            i++;                                             // so we also increment the value of counter 
        }
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
        
        System.out.println("Original: " + arr);

        rearrange(arr);
        
        System.out.println("Rearranged: " + arr);
    }
}
