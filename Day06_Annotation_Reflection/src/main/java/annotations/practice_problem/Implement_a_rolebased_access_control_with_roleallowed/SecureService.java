package annotations.practice_problem.Implement_a_rolebased_access_control_with_roleallowed;

class SecureService {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully.");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed successfully.");
    }
}