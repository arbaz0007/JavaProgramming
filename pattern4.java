import java.util.*;

public class pattern4 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size:");
    int size = sc.nextInt();
    for(int i = 1;i<=size;i++){
        for (int y = 1 ;y<=i;y++){
            System.out.print(y );
        }System.out.println();
    }
sc.close();
}    
}
