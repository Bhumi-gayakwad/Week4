package multi_level_university_course_management_system.course.course_type;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse(String name, int duration){
        super(EvaluationType.ASSIGNMENT_BASED, name, duration);
    }
}
