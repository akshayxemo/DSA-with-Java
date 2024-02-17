import java.util.Arrays;
import java.util.Scanner;
class Average{
    int avg(int x, int y, int z){
        int sum = x + y + z;
        return sum / 3;
    }

//    public void print(String s){
//        System.out.println(s);
//    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] x = new int[3];
        System.out.print("Enter 3 numbers : ");
        for(int i = 0; i < 3; i++){
            x[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(x));
        Average result = new Average();
        int average = result.avg(x[0], x[1], x[2]);

        System.out.print("The average is : ");
        System.out.println(average);
    }
}
