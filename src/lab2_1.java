class lab2_1 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers");
            return;
        }

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even numbers = " + even);
        System.out.println("Number of odd numbers = " + odd);
    }
}
