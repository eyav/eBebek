public class Main {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee("Erdener YAVUZ", 20000, 43, 2009);

        System.out.println(emp1);
        System.out.println("Tax amount: " + emp1.tax());
        System.out.println("Salary Bonus: " + emp1.bonus());
        System.out.println("Salary Raise: " + emp1.raiseSalary());

    }
}
