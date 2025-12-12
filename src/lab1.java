import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + "! You are an adult.");
        } else {
            System.out.println("Hello " + name + "! You are not an adult yet.");
        }

        sc.close();
    }
}
