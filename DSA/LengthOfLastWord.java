public class LengthOfLastWord 
{
    static int lastWordLength(String s)                  // first way to do it
    {
        String words[] = s.split( "\\s+");         // split whenever there is empty spaces => we get words as strings also blank spaces

        for (int i = words.length - 1; i >= 0; i++)      // starting from the last word or blank spaces we get
        {
            if (!words[i].isEmpty())                     // if we encounter a word from the end we return its length
            {
                return words[i].length();
            }
        }

        return 0;
    }

    static int lengthOfLastWord(String s)               // second way to do it
    {
        String words[] = s.trim().split("\\s+");  // trim to remove blank splaces => split whenever there is an empty space in the sentence => we get words as string

        return words[words.length - 1].length();        // simply return the last word's length that we encounter
    }

    static int lastWordsLength(String s)                // third way to do it
    {
        s = s.trim();                                   // shave off the extra spaces   

        int lastSpaceIndex = s.lastIndexOf(' ');     // stores the index where the last seen splace is which is just before the last word

        return s.length() - lastSpaceIndex - 1;         // for s3 => 21 - 14 - 1 = 6 => returns 6 
    }
    public static void main(String[] args) 
    {
        String s1 = "Hello World";
        System.out.println(lastWordLength(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println(lastWordsLength(s3));
    }
}
