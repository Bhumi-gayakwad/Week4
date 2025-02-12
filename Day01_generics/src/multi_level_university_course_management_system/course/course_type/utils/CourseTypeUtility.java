package multi_level_university_course_management_system.course.course_type.utils;
import multi_level_university_course_management_system.course.course_type.CourseType;

import java.util.List;
public class CourseTypeUtility {
    public static void displayCourseDetail(List<? extends CourseType> courses){
        for (CourseType course : courses){
            course.displayCourseDetails();
        }
    }

}
