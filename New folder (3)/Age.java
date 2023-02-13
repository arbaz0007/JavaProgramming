import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age >18){
            System.out.println("Adult");

        }else if(age >12 && age<18){
            
            System.out.println("teenage");
        }else{
            
            System.out.println("child");
        }
        sc.close();
    }
}
