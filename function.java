import java.util.Scanner;

public class function {
    
    // public static void main(String[] args) {
    //     sum();
    // }
    // static void sum() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number 1:");
    //     int num1 = sc.nextInt();
    //     System.out.println("Enter number 2:");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println("The sum ="+sum);
    // public static int calculateSum (int a , int b){
    //     int sum =  a + b;
    //     return sum;
    // }   
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum (a, b);
    //     System.out.println(sum);

    // public static int calculateProduct (int a , int b){
    //     return(a * b);
    // }
    //     public static void main(String args[]){
    //         Scanner sc = new Scanner(System.in);
    //         int a = sc.nextInt();
    //         int b = sc.nextInt();

    //         System.out.println("Product of 2 number is " + calculateProduct (a, b));
    //     }
    public static void printFactorial (int n ) {
        if( n < 0) {
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
      for ( int i=n; i>=1; i--){
        factorial = factorial * i;
      }  
        System.out.println(factorial);
        return;
    }
        public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }

}
    
    

