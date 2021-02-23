
package javaapplication1;

public class passingObjects {
    public static void main(String[] args){
        Test ob = new Test(15,20);
        System.out.println("Before call, ob.a: "+ob.a + "   ob.b: "+ob.b);
        ob.meth(ob);
        System.out.println("After call,  ob.a: "+ob.a + "   ob.b: "+ob.b);
    }
}
class Test{
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    void meth(Test o){
        o.a *= 2;
        o.b /=2;
    }
}
