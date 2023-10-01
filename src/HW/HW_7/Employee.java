package HW.HW_7;
//Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
// Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника
// у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
public class Employee {
    public String name;
    public int age;
    public boolean sex;
    public int salary;

    public boolean isSameName(Employee otherEmployee) {
        return this.name.equals(otherEmployee.name);

    }

}
