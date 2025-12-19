import java.util.Scanner;

class lab2_5 {
    int roll;
    String name;
    double cgpa;

    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        lab2_5[] s = new lab2_5[n];
        double minCgpa;
        int index = 0;

        for (int i = 0; i < n; i++) {
            s[i] = new lab2_5();
            s[i].read(sc);
        }

        minCgpa = s[0].cgpa;

        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < minCgpa) {
                minCgpa = s[i].cgpa;
                index = i;
            }
        }

        System.out.println("\nRoll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        System.out.println("\nStudent with lowest CGPA: " + s[index].name);
    }
}
