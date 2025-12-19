class lab2_6 {

    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers = " + (a - b));
    }

    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers = " + (a - b - c));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction of two double values = " + (a - b));
    }

    public static void main(String[] args) {
        lab2_6 s = new lab2_6();

        s.subtract(20, 10);
        s.subtract(30, 10, 5);
        s.subtract(25.5, 10.2);
    }
}

