class Anagram 
{
    public boolean isAnagram(String s1, String s2) 
    {
        if (s1.length() != s2.length())              // can't be Anagram if they are not the same length
        {
            return false;
        }

        int[] freq = new int[26];                   // strings s1 and s2 only contain lowercase English letters a-z.
        for (int i = 0; i < s1.length(); i++)       // s1 = "abc" => s2 = "cab"
        {                                           
                                                    // freq : [0, 0, 0, 0, ..., 0]
            freq[s1.charAt(i) - 'a']++;             // (i=0) => s1.charAt(0) => 'a' - 'a' = 0 => freq[0]++ => freq[0] =  1
            freq[s2.charAt(i) - 'a']--;             // (i=0) => s2.charAt(0) => 'c' - 'a' = 2 => freq[0]-- => freq[2] = -1
                                                    // freq now: [1, 0, -1, 0, ..., 0]
                                                    // (i=1) => s1.charAt(1) => 'b' - 'a' = 1 => freq[1]++ => freq[1] =  1
                                                    // (i=1) => s2.charAt(1) => 'a' - 'a' = 0 => freq[0]-- => freq[0] =  0
                                                    // freq now: [0, 1, -1, 0, ..., 0]
                                                    // (i=2) => s1.charAt(1) => 'c' - 'a' = 2 => freq[2]++ => freq[2] =  0
                                                    // (i=2) => s2.charAt(1) => 'b' - 'a' = 1 => freq[1]-- => freq[1] =  0
                                                    // freq now: [0, 0, 0, 0, ..., 0]

        }

        for (int count : freq) 
        {
            if (count != 0)                         // count == 0
            {
                return false;
            }
        }
        return true;                                // hence an anagram
    }

    public static void main(String[] args) 
    {
        Anagram obj = new Anagram();

        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(obj.isAnagram(s1, s2)); 

        String s3 = "allergy";
        String s4 = "allergyy";
        System.out.println(obj.isAnagram(s3, s4)); 

        String s5 = "listen";
        String s6 = "lists";
        System.out.println(obj.isAnagram(s5, s6)); 
    }
}
