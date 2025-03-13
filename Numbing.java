import java.io.*;
public class Numbing {
    public static void main (String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The value of the current day from 1 to 7:");
        int i = Integer.parseInt(br.readLine());

        if (i>7 && i<0){
            System.out.println("Make sure the current day iranges from 0-7");
            System.exit(0);
        }
        System.out.println("Enter the difference from the current day:");
        int j = Integer.parseInt(br.readLine());

       if (j<0){
              System.out.println("Make sure the Number is greater than 0");
              System.exit(0);

       }
       int mod = j % 7;
       int diff = i - mod;

      if (diff<0){
        diff = 7+diff;
      }

      switch(diff){
        case 0:
        System.out.println("The day is Sunday");
        break;

        case 1:
        System.out.println("The day is Monday");
        break;

        case 2:
        System.out.println("The day is Tuesday");
        break; 

        case 3:
        System.out.println("The day is Wednesday");
        break; 

        case 4:
        System.out.println("The day is Thursday");
        break; 

        case 5:
        System.out.println("The day is Friday");
        break; 

        case 6:
        System.out.println("The day is Saturday");
        break;

      }
}
}