public class Workshop extends Event {
    private String instructor;

    public Workshop(String title, String description, String instructor) {
        super(title, description);
        this.instructor = instructor;
    }

    @Override
    public String getDetails() {
        return "Workshop: " + title + " with " + instructor;
    }
}