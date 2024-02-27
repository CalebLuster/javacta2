import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wage;

        System.out.println("Enter your wage: ");
        wage = sc.nextInt();

        if (wage < 500) {
            System.out.println("Your tax rate is 10%");
        }
        else if (wage >= 500 && wage < 1500) {
            System.out.println("Your tax rate is 15%");
        }
        else if (wage >= 1500 && wage < 2500) {
            System.out.println("Your tax rate is 20%");
        }
        else {
            System.out.println("Your tax rate is 30%");
        }
    }
}
