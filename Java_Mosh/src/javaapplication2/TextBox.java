package javaapplication2;
//Creating a class and an object.
public class TextBox {
    public String text = " ";//Field // initialization so that exception may not occur
    
    public void setText(String text){
        this.text = text;
    }
    
    public void clear(){
        text = "";  // To clear out the string
    }
    
    public static void main(String[] args){
        //var textBox1 = new TextBox(); //  for cleaner code, but doesn't work here
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase()); // would print 'null' if .setText wasn't called
        
        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
        
        TextBox textBoxx = new TextBox();  //we didn't consume twice the memory, but 2 variables refer
        TextBox textBoxy = textBoxx;       //to the same object. refer stack: pointing and heap: storing 
        textBoxy.setText("Changed something in second, reflected in first!");
        System.out.println(textBoxx.text); //Cool
        
        
    }
}
