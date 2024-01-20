public abstract class Event {
    protected String title;
    protected String description;

    public Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract String getDetails();
}
