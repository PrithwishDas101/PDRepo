public class StringRotated1
{
    public static boolean isRotated(String s1, String s2) 
    {
        
        if (s1.length() != s2.length()) 
        {
            return false;
        }
        if (s1.length() <= 2) 
        {
            return s1.equals(s2);
        }

        String anti = s1.substring(2) + s1.substring(0, 2);
        
        String clock = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);

        return s2.equals(anti) || s2.equals(clock);
    }
    public static void main(String[] args) 
    {
        String s1 = "amazon";
        String s2 = "azonam"; 
        String s3 = "onamaz"; 
        String s4 = "mazona"; 

        System.out.println(StringRotated1.isRotated(s1, s2));
        System.out.println(StringRotated1.isRotated(s1, s3));
        System.out.println(StringRotated1.isRotated(s1, s4));
    }
}