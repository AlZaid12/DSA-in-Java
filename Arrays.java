import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] marks = new int[4];
        int size = sc.nextInt();
        // marks[0]=97;
        // marks[1]=92;
        // marks[3]=66;
        // marks[2]=28;
        int numbers[] = new int[size];
        for (int i=0; i<size; i++){
            numbers[i]= sc.nextInt();

        }
        int x = sc.nextInt ();
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]== x ) {
                System.out.println("x found at index ; "+ i);
            }
        System.out.println(numbers[i]);
        }
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // for(int i=0; i<4; i++){
        //     System.out.println(marks[i]);
        // }
    }    
}
