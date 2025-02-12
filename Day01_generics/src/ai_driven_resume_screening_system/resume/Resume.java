package ai_driven_resume_screening_system.resume;
import ai_driven_resume_screening_system.job_role.JobRole;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    List<T> resumes;

    public Resume(){
        this.resumes = new ArrayList<>();
    }

    public void addResume(T resume){
        resumes.add(resume);
    }

    public List<T> getResumes(){
        return this.resumes;
    }
}

