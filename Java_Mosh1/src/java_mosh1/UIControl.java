package java_mosh1;


public class UIControl { // abstract class declaration: public abstract class UIControl{}
    //If we declare a class as abstract, we cannot instatiate it, we can only extend it...
    protected boolean isEnabled = true; // is like public, but for that package itself
    
//    public UIControl(boolean isEnabled){  //commentes during polymorphism
//        this.isEnabled = isEnabled;
//        System.out.println("UIControl");
//    }
    //public abstract void render(); // Abstract declaration
    public void render(){
        //leaving this empty because it is not same for all classes, and creating new ones for
        //each class is hectic. So, we use poymorphism in this way and override this in each class.
    }
    
    public void enable(){
        isEnabled = true;
    }
    
    public void disable(){
        isEnabled = false;
    }
    
    public boolean isEnabled(){
        return isEnabled;
    }
}
