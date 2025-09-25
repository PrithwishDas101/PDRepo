import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

class ASCIISum 
{
    public ArrayList<Integer> asciirange(String s)            // s= "abacab"
    {
        int n = s.length();                                   // n = 6
        HashMap<Character, int[]> map = new HashMap<>();      // Key = character => Value = int[] → [first, last] index of that char

        for (int i = 0; i < n; i++)                           // "abacab"
        {
            char ch = s.charAt(i);                            // index: 0:a, 1:b, 2:a, 3:c, 4:a, 5:b
            if (!map.containsKey(ch)) 
            {
                map.put(ch, new int[]{i, i});
            } 
            else
            {
                map.get(ch)[1] = i;                           // (i=0) => ch = a => map = a => [0,0]
                                                              // (i=1) => ch = b =>	map = b => [1,1]
                                                              // (i=2) => ch = a => map = a => [0,2]
                                                              // (i=3) => ch = c =>	map = c => [3,3]
                                                              // (i=4) => ch = a =>	map = a => [0,4]
                                                              // (i=5) => ch = b => map = b => [1,5]
                                                              // finally  'a' = [0,4] , 'b' = [1,5] , 'c' = [3,3]
            }
        }

        ArrayList<Integer> result = new ArrayList<>();        // prepares result 

        for (Entry<Character, int[]> entry : map.entrySet())  // Loop over every char in the map
        {                                                     // 'a' => [0, 4]                                  'b' => [1, 5]                                  'c' => [3, 3] 
            int first = entry.getValue()[0];                  // first = 0                                      first = 1                                      first = 3
            int last =  entry.getValue()[1];                  // last  = 4                                      last  = 5                                      last  = 3
            if (first != last)                                // 0 != 4                                         1 != 5                                         3 = 3 => skip
            {
                int sum = 0;
                for (int i = first + 1; i < last; i++)        // looping (i = 1 to 3)                           looping (i = 2 to 4)
                {
                    sum += (int) s.charAt(i);                 // sum = (i=1) => s.charAt(i) = b => ASCII = 98   sum = (i=2) => s.charAt(i) = a => ASCII = 97   
                                                              // sum = (i=2) => s.charAt(i) = a => ASCII = 97   sum = (i=3) => s.charAt(i) = c => ASCII = 99
                                                              // sum = (i=3) => s.charAt(i) = c => ASCII = 99   sum = (i=4) => s.charAt(i) = a => ASCII = 97
                }
                if (sum > 0)                                  // sum = 98 + 97 + 99 = 294 > 0                   sum = 97 + 99 + 97 = 293 > 0 
                {
                    result.add(sum);                          // result = [294]                                 result = [294, 293]
                }
            }
        }
        return result;                                        // returns [294, 293]
    }
    public static void main(String[] args) 
    {
        ASCIISum obj = new ASCIISum();
        System.out.println(obj.asciirange("abacab"));
        System.out.println(obj.asciirange("acdac"));
        System.out.println(obj.asciirange("abc"));
    }
}