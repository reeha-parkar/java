
package javamosh;

public final class Employee{ //ENCAPSULATION. perks: we can reuse this class entirely
    private int baseSalary;
    //public int extraHours; // Say for example, this changes every month, then we need to add it in the fn
    private int hourlyRate;
    public static int numberOfEmployees;
    
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours*hourlyRate);
    }
    
    public int calculateWage(){  // Method overloading
        return calculateWage(0);
    }
    
    public Employee(int baseSalary){  // Constructor
        setBaseSalary(baseSalary);
        setHourlyRate(0);
        //         OR
        //this(baseSalary, 0);
    }
    
    public Employee(int baseSalary, int hourlyRate){  // Constructor
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    
    public int getBaseSalary(){               //GETTER
        return baseSalary;
    }                                             //Both of them make your program better!!!
    
    public void setBaseSalary(int baseSalary){ //SETTER
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base salary cannot be 0 or less.");
        this.baseSalary = baseSalary;      
    }
    
    public void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
    
    public int getHourlyRate(){
        return hourlyRate;
    }
    
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }
}
