import java.util.Scanner;

class lab2_7 {
    double length;
    double breadth;

    lab2_7() {
        length = 0;
        breadth = 0;
    }

    lab2_7(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        lab2_7 r1 = new lab2_7();
        System.out.println("Area using default constructor = " + r1.area());

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        lab2_7 r2 = new lab2_7(l, b);
        System.out.println("Area using parameterized constructor = " + r2.area());
    }
}
