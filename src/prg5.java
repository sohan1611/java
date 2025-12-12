public class GradeChecker {
    public static void main(String[] args) {
        int mark = 85;  // Mention the mark here

        if (mark >= 90) {
            System.out.println("Grade: O");
        } else if (mark >= 80) {
            System.out.println("Grade: E");
        } else if (mark >= 70) {
            System.out.println("Grade: A");
        } else if (mark >= 60) {
            System.out.println("Grade: B");
        } else if (mark >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
