public class RemoveDuplicates 
{
    String removeDuplocates(String s)               // s = "gfg"
    {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[26];           // lowercase only as per gfg

        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);                   // (i=0) => c = 'g'
                                                    // (i=1) => c = 'f'
                                                    // (i=2) => c = 'g'

            if (!seen[c - 'a'])                     // standard method
                                                    // !seen['g' - 'a'] = 6 = true
                                                    // !seen['f' - 'a'] = 5 = true
                                                    // !seen['g' - 'a'] = 6 = false => skip
            {
                seen[c - 'a'] = true;
                result.append(c);                   // result = ['g']
                                                    // result = ['g', 'f']
            }
        }

        return result.toString();                   // returns "gf"
    }
    public static void main(String[] args) 
    {
        RemoveDuplicates obj = new RemoveDuplicates();

        String s = "gfg";
        String result = obj.removeDuplocates(s);
        System.out.println("String after removing duplicates: " + result);
    }
}
