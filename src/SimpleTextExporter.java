import java.util.Scanner;

public class SimpleTextExporter implements Exporter {
    private static String ADMIN_PW = "password";

    @Override
    public void export(FestivalSchedule schedule) {
        if (schedule.isEmpty()) {
            throw new IllegalArgumentException("Festival schedule is empty");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter festival admin password: ");
        String password = scanner.nextLine();

        if (ADMIN_PW.equals(password)) {
            System.out.println("Correct password. Successfully exported!");
            schedule.printSchedule();
        } else {
            System.out.println("Wrong password. Access denied");
        }
    }
}
