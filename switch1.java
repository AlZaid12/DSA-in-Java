import java.util.*;
public class switch1{
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int button = sc.nextInt();
//     if (button == 1){
//         System.out.println("Hello");
//     }
//         else if (button == 2){
//         System.out.println("Bonjour");
//         }
//         else if (button == 3){
//             System.out.println("Namaste");
//         }
//             else {
//                 System.out.println("Not Valid");
//             }
        
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("good morning");
            break;
            case 3 : System.out.println("bonjour");
            break;
            case 4 : System.out.println("good night");
            break;
        }

    }
}
