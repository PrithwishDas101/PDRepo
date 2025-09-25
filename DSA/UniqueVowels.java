import java.util.HashMap;

class UniqueVowels 
{
    public int vowelCount(String s) 
    {
        HashMap<Character, Integer> freq = new HashMap<>();  // each key is a vowel letter ('a', 'e', 'i', 'o', 'u') => each value count of the key
        String vowels = s;

        for (char c : s.toCharArray())                        // s = "ababe"
        {
            if (vowels.indexOf(c) != -1)                     // -1 for consonents => if vowel count it else ignore
            {
                freq.put(c, freq.getOrDefault(c, 0) + 1); // + 1 → Adds 1 to the count.
                                                                       // first  char 'a' => vowel => map: { 'a' : 1 }
                                                                       // second char 'b' => not vowel => skip
                                                                       // third  char 'a' => vowel => map: { 'a' : 2 }
                                                                       // fourth char 'b' => not vowel => skip
                                                                       // fifth  char 'e' => vowel => map { 'e' : 1}
            }
        }

        int uniqueVowels = freq.size();                                // uniqueVowels = 2

        if (uniqueVowels == 0)
        {
            return 0;
        }

        long totalWays = 1;
        long permutations = 1;

        for (int count : freq.values()) 
        {
            totalWays *= count;                                         // totalWays = 2
        }

        for (int i = 2; i <= uniqueVowels; i++) 
        {
            permutations *= i;                                          // permutations = 2
        }

        totalWays *= permutations;                                      // totalWays = 2*2 = 4

        return (int) totalWays;                                         // returns 4
    }
    public static void main(String[] args) 
    {
        UniqueVowels Uvow = new UniqueVowels();

        String s = "aeiou";  
        int result = Uvow.vowelCount(s);

        System.out.println("Total distinct strings: " + result);
    }
}