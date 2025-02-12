package ai_driven_resume_screening_system.job_role;

public class JobRole {
    private JobRoleName name;
    private int salary;

    public JobRole(JobRoleName name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Job role name "+name.name()+" and its salary is "+salary);
    }

}

