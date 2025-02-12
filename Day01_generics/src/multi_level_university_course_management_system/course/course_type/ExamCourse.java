package multi_level_university_course_management_system.course.course_type;

public class ExamCourse extends CourseType {
    public ExamCourse(String name, int duration){
        super(EvaluationType.EXAM_BASED, name, duration);
    }

}
