import java.util.ArrayList;
import java.util.List;

public class Stage {
    private String stageName;
    private List<PerformanceSlot> performanceSlots;

    public Stage(String stageName) {
        this.stageName = stageName;
        this.performanceSlots = new ArrayList<>();
    }

    public void addPerformanceSlot(PerformanceSlot slot) {
        performanceSlots.add(slot);
    }

    public List<PerformanceSlot> getPerformanceSlots() {
        return performanceSlots;
    }

    public String getStageName() {
        return stageName;
    }

    @Override
    public String toString() {
        String stageInfo = "Stage: " + stageName + "\n";
        for (PerformanceSlot slot : performanceSlots) {
            stageInfo += slot.toString() + "\n";
        }
        return stageInfo;
    }
}
