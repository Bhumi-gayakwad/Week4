package annotations.practice_problem.create_an_annotation_for_logging_method_execution_time;

class TaskService {

    @LogExecutionTime
    public void quickTask() {
        System.out.println("Executing quick task...");
    }

    @LogExecutionTime
    public void slowTask() {
        System.out.println("Executing slow task...");
        try {
            Thread.sleep(1000); // Simulating a long-running task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
