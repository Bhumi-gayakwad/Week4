package annotations.custom_annotation_use;

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }
}
