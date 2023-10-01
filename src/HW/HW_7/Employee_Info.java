package HW.HW_7;

public class Employee_Info {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Olga";
        employee1.age = 20;
        employee1.sex = false;
        employee1.salary = 100;

        Employee employee2 = new Employee();
        employee2.name = "Jhon";
//        employee2.name = "Olga";  // true
        employee2.age = 30;
        employee2.sex = true;
        employee2.salary = 200;

        System.out.println(employee1.isSameName(employee2));

        Employee[] employees = new Employee[] {employee1, employee2};
        System.out.println(Salary.getSum(employees));
        
    }
}
