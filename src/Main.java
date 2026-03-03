import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int month;

        System.out.print("Enter your birth month (1-12): ");
        month = imput.nextInt();

        if (month >= 1 && month <= 12)
        {
            System.out.println("your birth month is: " + month);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + month);
        }}}
