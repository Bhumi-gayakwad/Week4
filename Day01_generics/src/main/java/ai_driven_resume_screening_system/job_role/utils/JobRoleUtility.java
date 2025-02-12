package ai_driven_resume_screening_system.job_role.utils;

import ai_driven_resume_screening_system.job_role.JobRole;

import java.util.List;

public class JobRoleUtility {

    public static void displayResumeDetails(List<? extends JobRole> resumes){
        for (JobRole resume : resumes){
            resume.displayDetails();
        }
    }
}
