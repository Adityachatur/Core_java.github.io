

// Write a program that prompts the user to input five integers and then calculates and displays their sum.



import java.util.Scanner;

public class Sum_of_Number {
    public static void main(String[] args) {

        System.out.println("Ener 5 Numbers:");
        Scanner sc = new Scanner(System.in);
        int i, sum = 0;

        for (i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }


        System.out.println("Sum of 5 number is:"+sum);
    }
}