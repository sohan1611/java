import java.util.Scanner;

class lab2_4 {
    double length;
    double breadth;
    double area;
    double perimeter;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }

    public static void main(String[] args) {
        lab2_4 r = new lab2_4();
        r.read();
        r.calculate();
        r.display();
    }
}
