class Demo{
    public void print(){
        System.out.println("Hello");
    }
}
class Demo2 extends Demo{
    public void hello(){
        System.out.println("Hello world");
    }

}
class Demo3 extends Demo{
    int a = 10;
    int b = 15;
    public void print2(){
        System.out.println(a+b);
    }
}
public class Main {

    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.print();
        d.print2();
        Demo2 d1 = new Demo2();
        d1.print();
        d1.hello();
    }
}
