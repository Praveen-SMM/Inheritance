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
class Demo3 extends Demo2{
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
        d.hello();
        d.print2();
 }
}
