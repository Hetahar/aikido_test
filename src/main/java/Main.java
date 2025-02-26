import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AikidoTracker tracker = new AikidoTracker();
        boolean exit = false;

        System.out.println("===== Aikido Practice Tracker =====");

        while (!exit) {
            System.out.println("Do you want to...");
            System.out.println("1. Add practice session \n2. View total practice time \n3. Check graduation eligibility \n4. Exit");
            int decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Enter the number of practice sessions: ");
                    int amount = scanner.nextInt();
                    System.out.println("Enter the duration of the practice session (in minutes): ");
                    int duration = scanner.nextInt();
                    tracker.addTrainingSession(amount, duration);
                    break;
                case 2:
                    tracker.seeDuration();
                    break;
                case 3:
                    if (tracker.isEligibleForGraduation()) {
                        System.out.println("Congratulations! You are eligible for graduation.");
                        exit = true;
                    } else {
                        System.out.println("Keep practicing! You are not eligible for graduation yet.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input. Exiting...");
                    break;
            }
        }
    }
}
