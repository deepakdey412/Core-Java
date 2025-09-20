
class Demo{
    public void method01(Object obj){
        System.out.println("Print Object class ");
    }

    public void method01(String str){
        System.out.println("Print String class");
    }
}

public class FirstExample {
    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.method01(demo);
        demo.method01("Deepak");
        demo.method01(new String());
        demo.method01(new Object());
        demo.method01(null);

    }
}

/**
child argument will get the first priority
**/