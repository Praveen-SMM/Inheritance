class Demo{
    public void print(){
        System.out.println("Hello");
    }
}
class Demo2 extends Demo{

}
public class Main {

    public static void main(String[] args) {
	Demo2 d = new Demo2();
	d.print();
    }
}
