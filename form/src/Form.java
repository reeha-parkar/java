import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
   
public class Form extends Applet implements ActionListener {
    
    String name=" ", gender=" ",mother ="",phonenum="",altphone="", telephone="",email="",address="",history="",dob="",age="",y="";
    TextField n= new TextField(20);
    TextField m= new TextField(20);
    CheckboxGroup g= new CheckboxGroup();
    Checkbox male=new Checkbox("Male",g,false);
    Checkbox f=new Checkbox("Female",g,false);
    Checkbox o=new Checkbox("Other",g,false);
    TextField d= new TextField(5);
    TextField a= new TextField(3);
    TextField p= new TextField(5);
    TextField ap= new TextField(5);
    TextField tp= new TextField(5);
    TextField em= new TextField(10);
    TextField add= new TextField(30);
    TextField h= new TextField(30);
    CheckboxGroup c= new CheckboxGroup();
    Checkbox agree=new Checkbox("I agree",c,false);
    Label l1= new Label("Name: ");
    Label l2= new Label("Mother's Name: ");
    Label l3= new Label("Gender: ");
    Label l4= new Label("Date Of Birth: ");
    Label l5= new Label("Age: ");
    Label l6= new Label("Phone: ");
    Label l7= new Label("Alt Phone: ");
    Label l8= new Label("Tele Phone: ");
    Label l9= new Label("Email Id: ");
    Label l10= new Label("Address: ");
    Label l11= new Label("History Of Patient: ");
    Label l12= new Label("I abide by information given by me and it is true");
    Button b1= new Button("Register");
    public void init() {
        
        add(l1);
        add(n);
        add(l2);
        add(m);
        add(l3);
        add(male);
        add(f);
        add(o);
        add(l4);
        add(d);
        add(l5);
        add(a);
        add(l6);
        add(p);
        add(l7);
        add(ap);
        add(l8);
        add(tp);
        add(l9);
        add(em);
        add(l10);
        add(add);
        add(l11);
        add(h);
        add(l12);
        add(agree);
        add(b1);
        b1.addActionListener(this);
        
    }

    public void paint (Graphics g){
        g.drawString("Check Your Details", 20, 200);
        g.drawString("Name: "+name,20,250);
        g.drawString("Phone Number: "+phonenum,20,300);
        g.drawString("Email Id: "+email,20,350);
    }
    public void actionPerformed(ActionEvent e){
        name= n.getText();
        phonenum= p.getText();
        email= em.getText();
        repaint();
    }
}
