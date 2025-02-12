package ai_driven_resume_screening_system;

import ai_driven_resume_screening_system.job_role.DataScientist;
import ai_driven_resume_screening_system.job_role.JobRole;
import ai_driven_resume_screening_system.job_role.ProductManager;
import ai_driven_resume_screening_system.job_role.SoftwareEngineer;
import ai_driven_resume_screening_system.job_role.utils.JobRoleUtility;
import ai_driven_resume_screening_system.resume.Resume;
import multi_level_university_course_management_system.course.Course;
import multi_level_university_course_management_system.course.course_type.AssignmentCourse;
import multi_level_university_course_management_system.course.course_type.CourseType;
import multi_level_university_course_management_system.course.course_type.ExamCourse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AiDrivenResumeScreeningSystemTest {

    @Test
    void testResumeScreeningSystem(){
        // arrange
        int softwareEngSalary = 100000;

        // act
        Resume<JobRole> jobRoleResume = new Resume<>();
        jobRoleResume.addResume(new SoftwareEngineer(softwareEngSalary));

        // assertion
        List<JobRole> resumes = jobRoleResume.getResumes();
        Assertions.assertEquals(1, resumes.size());
        Assertions.assertEquals(softwareEngSalary, resumes.get(0).getSalary());
    }

}
