package myPack;

public class Package1 {
    String name;
    double bal;
    public Package1(String n, double b){
        name = n;
        bal = b;
    }
    public void show(){
        if(bal<0)
            System.out.println("--> ");
    System.out.println(name + "$" +bal);
    }
}
