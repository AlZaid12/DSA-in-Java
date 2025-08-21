import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b2");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("both are equal");
            
        } else {
            if (a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
                
            }
            
        }


    }
    
}
