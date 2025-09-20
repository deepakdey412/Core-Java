
class Demo{
    public void method01(int num){
        System.out.println("Print integer value");
    }

    public void method01(float num){
        System.out.println("Print float value");
    }
}

public class FirstExample {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method01(45);
        demo.method01(485f);
        demo.method01('A'); // it will type cast it and send it to the method
    }
}

/**
byte -> short -> int -> double -> long -> float
                /
            char
**/