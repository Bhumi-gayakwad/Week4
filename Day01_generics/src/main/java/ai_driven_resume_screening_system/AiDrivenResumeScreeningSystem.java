package ai_driven_resume_screening_system;

import ai_driven_resume_screening_system.job_role.DataScientist;
import ai_driven_resume_screening_system.job_role.JobRole;
import ai_driven_resume_screening_system.job_role.ProductManager;
import ai_driven_resume_screening_system.job_role.SoftwareEngineer;
import ai_driven_resume_screening_system.job_role.utils.JobRoleUtility;
import ai_driven_resume_screening_system.resume.Resume;

public class AiDrivenResumeScreeningSystem {
    public static void main(String[] args) {

        Resume<JobRole> jobRoleResume = new Resume<>();
        jobRoleResume.addResume(new SoftwareEngineer(70000));
        jobRoleResume.addResume(new SoftwareEngineer(80000));
        jobRoleResume.addResume(new SoftwareEngineer(90000));
        jobRoleResume.addResume(new DataScientist(100000));
        jobRoleResume.addResume(new DataScientist(120000));
        jobRoleResume.addResume(new ProductManager(200000));

        JobRoleUtility.displayResumeDetails(jobRoleResume.getResumes());

    }
}
