package java_mosh3;
//This is the interface
public interface TaxCalculator {
    /*public*/ double calculateTax();  //public is default, so redundant
  //if I declare any field / variable, then it will be by default, public, static and final, so unchangeable
    //constants have no places in an interface
    
    //can't define static methods:
    /*static double getTaxableIncome(double income, double expenses){
        return income-expenses; // This has code, logic that can change which shouldn't be in interfaces
        //Interfaces are about what and not how
        //If you still want to implement this logic which is going to be 
        //constantly used, use abstract class
    }*/
//Interfaces shouldn't also have any private methods, only method declarations and NOTHING ELSE
}
    