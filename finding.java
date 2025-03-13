public class finding {
    
    public static void main (String args []){
        int rrr = 300000;

        answer (rrr);

    }

    public static boolean  itPrime(int t){
        for ( int i = 2; i<= Math.sqrt(t); i++){
            if ( t % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void answer(int t){
        for (int i = 2; i<=t; i++){
            while (t % i == 0 && itPrime(i)){
                System.out.print(i + " ");
                t = t/i;
            }
        }
        System.out.println();
    }
}
