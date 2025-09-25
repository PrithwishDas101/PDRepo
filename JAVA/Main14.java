package JAVA;

public class Main14{
    public static void main(String[] args){

        // .substring() => A method used to extract a poriton of a string 
        //                 .substring(start, end)

        String email    = "BroCode1234@gmail.com";
        String username = email.substring(0, 7);
        String domain   = email.substring(12);

        System.out.println(username);
        System.out.println(domain);
    }
}

