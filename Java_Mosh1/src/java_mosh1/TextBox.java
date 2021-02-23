package java_mosh1;

public class TextBox extends UIControl {
    private String text = " ";
    
//    public TextBox(){ // commented during polymorphism
//        super(true); // in case of different arguments in the ctor of base class
//        System.out.println("TextBox");
//    }

    @Override
    public void render() {
        System.out.println("Render TextBox"); 
    }
    
    
    
    @Override
    public String toString(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public void clear(){
        text = "";
    }
}
