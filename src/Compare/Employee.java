package Compare;

/**
 * Created by RishatRg on 29.10.2017.
 * Создайте класс для сотрудников, которые имеют имя, должность и зарплату.
 * Реализуйте в этом классе интерфейс Comparable для сравнивания сотрудников
 * по размеру оплаты труда. Реализуйте альтернативный способ сравнения по имени
 * с помощью интерфейса Comparator. Отсортируйте массив сотрудников сначала по одному,
 * а потом по другому параметру.
 */
public class Employee implements Comparable<Employee> {
    String name ;
    String position ;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int compareTo(Employee any)
    {return any.getSalary()>salary ? -1 :any.getSalary()< salary? 1 : 0;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary ;
    }
}
