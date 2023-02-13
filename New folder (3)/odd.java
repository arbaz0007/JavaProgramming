import java.util.*;
public class odd{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num to be check :");
        int num = sc.nextInt();

        if( num %2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        sc.close();
    }
    
    
}


