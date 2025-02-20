package annotations.practice_problem.Implement_a_rolebased_access_control_with_roleallowed;

public class RoleBasedAccessControl {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        User admin = new User("ADMIN");
        User normalUser = new User("USER");

        System.out.println("Trying to execute admin task with ADMIN user:");
        AccessController.invokeIfAllowed(service, "adminTask", admin); // Allowed ✅

        System.out.println("\nTrying to execute admin task with USER:");
        AccessController.invokeIfAllowed(service, "adminTask", normalUser); // Denied ❌

        System.out.println("\nTrying to execute user task with USER:");
        AccessController.invokeIfAllowed(service, "userTask", normalUser); // Allowed ✅
    }
}