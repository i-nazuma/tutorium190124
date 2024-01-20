public class Concert extends Event {
    private Performer performer;

    public Concert(String title, String description, Performer performer) {
        super(title, description);
        this.performer = performer;
    }

    @Override
    public String getDetails() {
        return "Concert: " + title + " by " + performer.getName();
    }
}