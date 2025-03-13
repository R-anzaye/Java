import java.util.Scanner;
public class Line {
    public static void main(String[]args){
         Scanner scan= new Scanner(System.in);
        
         System.out.println("Enter the integer");

         int i= scan.nextInt();
         
         System.out.println("Enter the Line");

         String s= scan.nextLine();

         System.out.println("The number is" + i + " and the text is " + s);
         scan.close();
        }
    }