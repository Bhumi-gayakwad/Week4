package multi_level_university_course_management_system;

import multi_level_university_course_management_system.course.Course;
import multi_level_university_course_management_system.course.course_type.AssignmentCourse;
import multi_level_university_course_management_system.course.course_type.CourseType;
import multi_level_university_course_management_system.course.course_type.ExamCourse;
import multi_level_university_course_management_system.course.course_type.utils.CourseTypeUtility;

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {

        Course<ExamCourse> examBasedCourses = new Course<>();
        examBasedCourses.addCourse(new ExamCourse("Btech", 4));
        examBasedCourses.addCourse(new ExamCourse("BSc", 3));
        CourseTypeUtility.displayCourseDetail(examBasedCourses.getCourses());

        Course<AssignmentCourse> assignmentBasedCourse = new Course<>();
        assignmentBasedCourse.addCourse(new AssignmentCourse("Python course", 1));
        assignmentBasedCourse.addCourse(new AssignmentCourse("Web development course", 1));
        CourseTypeUtility.displayCourseDetail(assignmentBasedCourse.getCourses());

        Course<CourseType> as = new Course<>();
        as.addCourse(new AssignmentCourse("Python course", 1));
        as.addCourse(new ExamCourse("Web development course", 1));
        CourseTypeUtility.displayCourseDetail(as.getCourses());

    }
}
