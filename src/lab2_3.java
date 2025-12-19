class lab2_3 {
    static int count = 0;

    lab2_3() {
        count++;
    }

    public static void main(String[] args) {
        lab2_3 obj1 = new lab2_3();
        lab2_3 obj2 = new lab2_3();
        lab2_3 obj3 = new lab2_3();

        System.out.println("Number of objects created = " + count);
    }
}
