import java.util.ArrayList;
import java.util.List;

public class FestivalSchedule {
    private List<Stage> stages;

    public FestivalSchedule() {
        this.stages = new ArrayList<>();
    }

    public void addStage(Stage stage) {
        stages.add(stage);
    }

    public boolean isEmpty() {
        for (Stage stage : stages) {
            if (!stage.getPerformanceSlots().isEmpty()) {
                return false; // Found a stage with performance slots, so not empty
            }
        }
        return true; // All stages are empty
    }

    public void printSchedule() {
        if (isEmpty()) {
            System.out.println("The festival schedule is currently empty.");
        } else {
            stages.forEach(stage -> {
                System.out.println("Stage: " + stage.getStageName());
                stage.getPerformanceSlots().forEach(slot -> {
                    System.out.println(slot);
                });
            });
        }
    }
}
