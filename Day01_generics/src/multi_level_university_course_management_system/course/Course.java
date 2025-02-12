package multi_level_university_course_management_system.course;
import multi_level_university_course_management_system.course.course_type.CourseType;

import java.util.ArrayList;
import java.util.List;
public class Course<T extends CourseType> {
    List<T> courses;

    public Course(){
        this.courses = new ArrayList<>();
    }

    public void addCourse(T course){
        courses.add(course);
    }

    public List<T> getCourses(){
        return courses;
    }
}
