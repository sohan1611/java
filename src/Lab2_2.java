class lab2_2 {
    static int count = 0;

    lab2_2() {
        count++;
    }

    public static void main(String[] args) {
        lab2_2 obj1 = new lab2_2();
        lab2_2 obj2 = new lab2_2();
        lab2_2 obj3 = new lab2_2();

        System.out.println("Number of objects created = " + count);
    }
}

