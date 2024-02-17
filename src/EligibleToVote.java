import java.util.Scanner;

public class EligibleToVote {
    int age;
    EligibleToVote(int age){
        this.age = age;
    }
    void eligibility(int age){
        if (age >= 18){
            System.out.println("This person is eligible to vote");
        }else{
            System.out.println("This person is Not eligible to vote");
        }
    }
    void eligibility(){
        if (this.age >= 18){
            System.out.println("This person is eligible to vote");
        }else{
            System.out.println("This person is Not eligible to vote");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the persons age : ");
        int age = in.nextInt();
        EligibleToVote obj = new EligibleToVote(age);
        obj.eligibility();
        obj.eligibility(age);
    }
}
