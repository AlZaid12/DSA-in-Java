import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
    //   for(int number = 0;number < 9; number = number +1 ){
    //     System.out.println("number is " + number);
    //   }
    // for(int x = 20; x > 8; x--)
    //     System.out.println(x);
    // }
    // for(int even = 2; even <= 16;  even++){
    //     even++;
    //     System.out.println(even);
    // }
    // for(int x = 0; x <= 20; x++){
    //     if (x%2==0) {
    //         System.out.println(x+" is a even number");
            
    //     } else {
    //         System.out.println(x+" is a odd number");
            
    //     }
    // }
    // int k = 0;
    // while (k < 20) {
    //     System.out.println(k);
    //     //  k = k + 1; 
    //     k++;
    // }
    // int m = 0;
    // while(m<=100){
    //     if (m%3 == 0) {
    //         System.out.println(m + " is divisible by 3");
    //     } else {
    //         System.out.println(m+ " is not divisible by 3");
    //     }
    // m =m+10;
    // }
        // int i = 1;
        //  do {
        //     System.out.println(i);
        //     i++;
        //  } while (i<11);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int sum = 0;
        // for(int i=0; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

      for(int i=1; i<=10; i++){
        System.out.println(n+"*"+i+"="+n*i);
      }
    }
} 