public class WeekdaySwitch {
    public static void main(String[] args) {
        int dayNo = 3;  // Mention the day number here (1 to 7 or any number)

        switch (dayNo % 7) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 0:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
