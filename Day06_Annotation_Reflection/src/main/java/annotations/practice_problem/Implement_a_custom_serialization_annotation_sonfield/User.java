package annotations.practice_problem.Implement_a_custom_serialization_annotation_sonfield;
class User {
    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "user_age")
    private int age;

    @JsonField(name = "user_email")
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}