package java_mosh1;

public class CheckBox extends UIControl {

    @Override //if render is declared as abstract in UIControl and this class impements it, then it's necessary
    public void render() { // for this class to also use that abstract method or else be declared as
        System.out.println("Render CheckBox");                                      // abstract itself!
    }
    
    
    
}
//Final Class:
//public final class ChcekBox{}
//We cannot extends it. So when we want to avoid any class to be inherited from, we declare it as final
//Example: String class is final, therefore we cannot extend it
//final methods cannot be overwritten 