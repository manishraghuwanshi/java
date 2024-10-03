import java.io.*;
public class J1_IO {
    public static void main(String[] args)
    throws IOException {
        // take input from user 
        // two ways to take input from user
        // BufferedReader Class
        // Scanner Class
        
        // 1. using BufferedReader class
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String str = bfn.readLine();
        int it  = Integer.parseInt(bfn.readLine());
        System.out.println("entered string" + str);
        System.out.println("entered integer" + it);    
    }
}
