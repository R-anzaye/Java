public class square {
    public static void main(String[]args) {
     int sr=100;
     answer(sr);

    }

public static boolean isPrime (int n){
 if (n<2) return false;

 for (int i = 2; i <= Math.sqrt(n); i++) { 
    if (n % i == 0) {
        return false;
    }
}
return true;


}

public static void answer(int n){

    for (int i=2;i<=n;i++){

        while (n%i == 0 && isPrime(i)){
        System.out.print(i +" " );

        n= n/i;

        }


}
System.out.println();
}
}