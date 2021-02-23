
package javaapplication1;

public class returningObjects {
    public static void main(String[] args){
       Testing ob1 = new Testing(3);
       Testing ob2;
       ob2 = ob1.incrByTen();
        System.out.println("ob1.a: "+ob1.a + "   ob2.a: "+ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("After second increase, ");
        System.out.println("ob1.a: "+ob1.a + "   ob2.a: "+ob2.a);
    }
}
class Testing{
    int a;
    Testing(int i){
        a = i;
    }
    Testing incrByTen(){
        Testing temp = new Testing(a+10);
        return temp;
    }
}