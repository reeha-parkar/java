package javamosh;

public class JavaMosh { //main method
    
    public static void main(String[] args) {
        Employee employee1 = new Employee(50_000, 20); // or only one argument -baseSalary
        //employee1.baseSalary = 50_000; removed because: what if baseSalary is entered negative or 0
        /*employee1.setHourlyRate(20);
        employee1.setBaseSalary(30000);*/
        int base = employee1.getBaseSalary();// if you're not using these, you can change the access 
        //int rate = employee1.getHourlyRate();// specifiers of them to private, in the employee class
        int wage = employee1.calculateWage();
        System.out.println(base);
        //System.out.println(rate);
        System.out.println(wage);
        //System.out.println(Employee.numberOfEmployees); to access static member directly through class
        Employee.printNumberOfEmployees();
    }
    
}
