package multi_level_university_course_management_system.course.course_type;

public abstract class CourseType {

    private EvaluationType evaluationType;
    private String name;
    private int duration;

    public CourseType(EvaluationType evaluationType, String name, int duration){
        this.evaluationType = evaluationType;
        this.name = name;
        this.duration = duration;
    }

    public String getEvaluationType(){
        return evaluationType.name();
    }

    public void displayCourseDetails(){
        System.out.println("Evaluation type: "+getEvaluationType()+", name: "+this.name+", its duration is "+this.duration+" years.");
    }

    public String getName(){
        return this.name;
    }

    public int getDuration(){
        return this.duration;
    }

}
