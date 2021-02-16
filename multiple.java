class Demo{
    public void print(){
        System.out.println("Hello");
    }
}
class Demo1{
    public void hello(){
        System.out.println("World");
    }

}
class Demo2 extends Demo,Demo1{
    }
public class Main {

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.print();
        d.hello();
    }
}
