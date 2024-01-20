public class PerformanceSlot {
    private String startTime;
    private String endTime;
    private Event event;

    public PerformanceSlot(String startTime, String endTime, Event event) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.event = event;
    }

    @Override
    public String toString() {
        return event.getDetails() + " from " + startTime + " to " + endTime;
    }
}
