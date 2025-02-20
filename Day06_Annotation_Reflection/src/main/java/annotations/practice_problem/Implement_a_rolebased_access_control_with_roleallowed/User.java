package annotations.practice_problem.Implement_a_rolebased_access_control_with_roleallowed;

class User {
    private String role; // Role of the user

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
