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
class Demo4 extends Demo2{

}
public class Main {

    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.print();
    }
}
