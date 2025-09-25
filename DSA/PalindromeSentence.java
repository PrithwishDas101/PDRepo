class PalindromeSentence 
{
    public boolean isPalindromeSentence(String s) 
    {
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // s.toLowerCase() => converts the whole string to lowercase 
                                                                                   // .replaceAll("[^a-z0-9]", "") => uses regex to remove everything that is not => a lowercase letter (a-z) or a digit (0-9) the ^ means NOT
        int left = 0, right = s1.length() - 1;                                     // two pointers  
                                                                                   // left  = staring index of string
                                                                                   // right = ending  index of string

        while (left < right)                                                       // as long as left is before right
        {
            if (s1.charAt(left) != s1.charAt(right))                               // characters at two ends must be equal to be Palindrome
            {
                return false;
            }

            left++; right--;                                                       // moving the pointers inward
        }

        return true;
    }
    public static void main(String[] args) 
    {
        PalindromeSentence obj = new PalindromeSentence();

        System.out.println(obj.isPalindromeSentence("Too hot to hoot"));
        System.out.println(obj.isPalindromeSentence("Abc 012..## 10cbA"));
        System.out.println(obj.isPalindromeSentence("ABC $. def01ASDF"));
        System.out.println(obj.isPalindromeSentence("0101!@#$%^&*1010"));
        System.out.println(obj.isPalindromeSentence("12abdiddybabyoil69@@96lioybabyddidba21"));
    }
}
