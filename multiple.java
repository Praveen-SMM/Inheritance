interface Demo{
    public void print();
}
interface Demo1{
    public void hello();
    }

class Demo2 implements Demo,Demo1{
    public void print(){
        System.out.println("Hello");
    }
    public void hello(){
        System.out.println("World");
    }
    }
public class Main {

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.print();
        d.hello();
    }
}
