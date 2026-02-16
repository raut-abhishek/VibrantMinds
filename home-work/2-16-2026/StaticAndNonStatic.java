class Demo{
    int a;
    int b;
    static int c;
    void m1(){
        System.out.println("Method is called");
    }
}


public class StaticAndNonStatic{
    public static void main(String[] args) {
        Demo.c= 300;
        System.out.println(Demo.c);
        Demo d1 = new Demo();
        d1.a = 100;
        System.out.println(d1.a);
    }
}