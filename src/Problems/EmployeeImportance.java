package Problems;

import Helper.Employee;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    public static int getImportance(List<Employee> employees, int id) {
        // Use hashmap to map employees to their ids for quick lookup
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return dfs(id, map);
    }

    private static int dfs(int id, Map<Integer, Employee> map) {
        Employee employee = map.get(id);
        int totalImp = employee.importance;

        for (Integer subordinateID : employee.subordinates) {
            totalImp += dfs(subordinateID, map);
        }

        return totalImp;
    }
}
