import java.util.*;
public class pattern6 {

    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of star");
    int size = sc.nextInt();
    for (int i = 1 ; i<=size; i++){
        for(int j=1;j<=size-i;j++){
            System.out.print(" ");
        }for (int k = 1;k<=i ;k++){
            System.out.print("*");
        }System.out.println();
    }
for (int i =1 ;i<=4;i++){
    for(int j = 1; j<=i-1+1;j++){
        System.out.print(" ");
    }for(int k = 1;k<=4-i+1;k++){
        System.out.print("*");
    }System.out.println();
}



sc.close();


}





}