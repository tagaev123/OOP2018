public class Main {
    public static void main(String[] args){
        Person simple = new Person("Steve", "Bankir", 25);
        Person simple_1 = new Person("Steve", "Bankir", 25);
        if(simple.equals(simple_1))
            System.out.println("YES");

        Employee emp = new Employee("Steve", 200000, 2018, "2");
        Employee emp_1 = new Employee("Steve", 200000, 2018, "2");
        Employee emp_2 = new Employee("Vitya", 200000, 2018, "2");
        if(emp.equals(emp_1))
                System.out.println("emp == emp_1");
        if(emp.equals(emp_2))
            System.out.println("emp == emp_2");


        Manager first = new Manager("Vitya", 200000, 2018, "2", 1);
        Manager second = new Manager("Vitya", 200000, 2018, "2", 1);
        Manager third = new Manager("Vitya", 200000, 2018, "2", 5);

        if(first.equals(second))
            System.out.println("first == second");
        if(emp.equals(emp_2))
            System.out.println("first == third");

        System.out.println(simple.toString());
        System.out.println(emp.toString());
        System.out.println(first.toString());
    }
}
