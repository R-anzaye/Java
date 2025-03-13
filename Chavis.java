import java.io.*;
public class Chavis {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value :");

        int i = Integer.parseInt(br.readLine());

        System.out.println("Enter a text:");

        String line= br.readLine();

        System.out.println("You have the number "+i+" and the text "+line);




    }
}
