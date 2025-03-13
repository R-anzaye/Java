import java.io.*;

public class Rand {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");

        int i= Integer.parseInt(br.readLine());

        System.out.println("Enter the Line");

        String b = br.readLine();

        System.out.println("Thenumber is "+i+" and the line is " +b);
    }
}
