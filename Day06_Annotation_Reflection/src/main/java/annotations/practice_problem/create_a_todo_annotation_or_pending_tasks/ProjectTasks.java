package annotations.practice_problem.create_a_todo_annotation_or_pending_tasks;

class ProjectTasks {

    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void implementAuth() {
        // Authentication logic (To be implemented)
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {
        // Query optimization logic (To be implemented)
    }

    @Todo(task = "Refactor code structure", assignedTo = "Charlie", priority = "LOW")
    public void refactorCode() {
        // Code refactoring logic (To be implemented)
    }
}
