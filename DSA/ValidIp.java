class ValidIp 
{
    public boolean isValid(String s) 
    {
        if (s == null || s.isEmpty()) return false;

        String[] parts = s.split("\\.");    //splits whenever there is an actual . 
        if (parts.length != 4) return false;

        for (String part : parts) 
        {
            if (part.isEmpty()) return false;
            if (part.length() > 1 && part.charAt(0) == '0') return false;

            try 
            {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false;
            } 
            catch (NumberFormatException e) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        ValidIp sol = new ValidIp();

        System.out.println(sol.isValid("192.168.0.1"));
        System.out.println(sol.isValid("255.255.255.255")); 
        System.out.println(sol.isValid("256.100.50.25")); 
        System.out.println(sol.isValid("192.168.1.01")); 
    }
}