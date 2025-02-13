package map_interface.group_objects_by_property;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class EmployeeGrouperTest {

    @Test
    void testGroupByDepartment() {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = EmployeeGrouper.groupByDepartment(employees);

        assertEquals(2, grouped.size());
        assertTrue(grouped.containsKey("HR"));
        assertTrue(grouped.containsKey("IT"));
        assertEquals(List.of("Alice", "Carol"), grouped.get("HR").stream().map(e -> e.name).toList());
        assertEquals(List.of("Bob"), grouped.get("IT").stream().map(e -> e.name).toList());
    }

    @Test
    void testGroupByDepartmentWithSingleEmployee() {
        List<Employee> employees = List.of(new Employee("David", "Finance"));

        Map<String, List<Employee>> grouped = EmployeeGrouper.groupByDepartment(employees);

        assertEquals(1, grouped.size());
        assertTrue(grouped.containsKey("Finance"));
        assertEquals(List.of("David"), grouped.get("Finance").stream().map(e -> e.name).toList());
    }

    @Test
    void testGroupByDepartmentWithEmptyList() {
        List<Employee> employees = List.of();

        Map<String, List<Employee>> grouped = EmployeeGrouper.groupByDepartment(employees);

        assertTrue(grouped.isEmpty());
    }
}
