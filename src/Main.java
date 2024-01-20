public class Main {
    public static void main(String[] args) {
        // Create some performers
        Performer bandA = new Performer("Band A", "Rock");
        Performer bandB = new Performer("Band B", "Jazz");

        // Create stages
        Stage mainStage = new Stage("Main Stage");
        Stage jazzStage = new Stage("Jazz Stage");

        // Create and add events to stages
        mainStage.addPerformanceSlot(new PerformanceSlot("12:00", "13:00", new Concert("Rocking the Stage", "The best rock bands of the year", bandA)));
        jazzStage.addPerformanceSlot(new PerformanceSlot("14:00", "15:00", new Workshop("Jazz Hands", "Learn to play jazz like a pro", "John Doe")));

        // Create a festival schedule
        FestivalSchedule festivalSchedule = new FestivalSchedule();

        // Add stages to the festival schedule
        festivalSchedule.addStage(mainStage);
        festivalSchedule.addStage(jazzStage);

        // Print the full festival schedule
        System.out.println("Festival Schedule:");
        festivalSchedule.printSchedule();

        Exporter exporter = new SimpleTextExporter();

        try {
            exporter.export(festivalSchedule);
        } catch (IllegalArgumentException error) {
            System.err.println(error.getMessage());
        }


    }

}
