package HW.HW_7;

//Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
// метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
public class Salary {
    static int getSum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum = sum + employees[i].salary;
        }
        return sum;
    }

}
