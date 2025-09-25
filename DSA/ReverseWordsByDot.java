import java.util.*;

public class ReverseWordsByDot 
{
    public static String reverseWords(String s) 
    {
        String[] parts = s.split("\\.");    // splitting by dot the dots

        List<String> words = new ArrayList<>();

        for (String word : parts) 
        {
            if (!word.isEmpty()) 
            {
                words.add(word);                  // filtering out multiple dots = ....
            }
        }
 
        Collections.reverse(words);               // reversing words from string 
 
        return String.join(".", words); // joing words by dots
    }
    public static void main(String[] args) 
    {
        String s1 = "i.like.this.program.very.much";
        System.out.println(reverseWords(s1));

        String s2 = "..geeks..for.geeks.";
        System.out.println(reverseWords(s2));

        String s3 = "..home.....";
        System.out.println(reverseWords(s3));

        String s4 = "i..like.kanye..east";
        System.out.println(reverseWords(s4));

        String s5 = ".....................................meow......................bhow";
        System.out.println(reverseWords(s5));
    }
}
