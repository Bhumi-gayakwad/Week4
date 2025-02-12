package multi_level_university_course_management_system;

import multi_level_university_course_management_system.course.Course;
import multi_level_university_course_management_system.course.course_type.AssignmentCourse;
import multi_level_university_course_management_system.course.course_type.CourseType;
import multi_level_university_course_management_system.course.course_type.ExamCourse;
import multi_level_university_course_management_system.course.course_type.utils.CourseTypeUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import personalized_meal_plan_generator.meal.Meal;
import personalized_meal_plan_generator.meal.meal_plan.HighProteinMeal;
import personalized_meal_plan_generator.meal.meal_plan.MealPlan;
import personalized_meal_plan_generator.meal.meal_plan.VeganMeal;
import personalized_meal_plan_generator.meal.meal_plan.VegetarianMeal;

import java.util.List;

public class UniversityCourseManagementSystemTest {

    @Test
    void testCoursePlan(){
        // arrange
        String assignmentCourseName = "python course";
        String examCourseName = "btech";
        int assignmentCourseDuration = 1;
        int examCourseDuration = 4;

        // act
        Course<CourseType> course = new Course<>();
        course.addCourse(new AssignmentCourse(assignmentCourseName, assignmentCourseDuration));
        course.addCourse(new ExamCourse(examCourseName, examCourseDuration));

        // assertion
        List<CourseType> courses = course.getCourses();
        Assertions.assertEquals(2, courses.size());
        Assertions.assertEquals(assignmentCourseName, courses.get(0).getName());
        Assertions.assertEquals(assignmentCourseDuration, courses.get(0).getDuration());
        Assertions.assertEquals(examCourseName, courses.get(1).getName());
        Assertions.assertEquals(examCourseDuration, courses.get(1).getDuration());
    }

}
