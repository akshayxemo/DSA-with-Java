import java.util.Scanner;
public class PrintOdd {
    static void printOddNumber1toN(int n){
        System.out.print("Odd Numbers are : ");
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = in.nextInt();
        printOddNumber1toN(n);
    }
}
