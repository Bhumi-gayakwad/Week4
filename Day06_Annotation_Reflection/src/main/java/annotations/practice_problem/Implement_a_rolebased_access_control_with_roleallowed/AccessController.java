package annotations.practice_problem.Implement_a_rolebased_access_control_with_roleallowed;

import java.lang.reflect.Method;

class AccessController {
    public static void invokeIfAllowed(Object obj, String methodName, User user) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
                String requiredRole = annotation.value();

                if (requiredRole.equals(user.getRole())) {
                    method.invoke(obj);
                } else {
                    System.out.println("Access Denied! You need " + requiredRole + " role.");
                }
            } else {
                method.invoke(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}