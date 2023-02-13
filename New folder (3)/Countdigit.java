import java.util.Scanner;



public class Countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = sc.nextInt();
        int sumofdigit=0;
        while(n>0){
            sumofdigit+=n%10;
            
            n=n/10;
            //numofdigit++;
            
        }System.out.println(sumofdigit);
   
   sc.close(); }
}