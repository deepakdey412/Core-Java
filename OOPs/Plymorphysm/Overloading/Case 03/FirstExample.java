
class Demo{
    public void method01(String str){
        System.out.println("Print String example");
    }

    public void method01(StringBuffer sb){
        System.out.println("Print String Buffer example");
    }
}

public class FirstExample {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method01("Deepak");
        demo.method01("Deepak Dey");
        demo.method01(new StringBuffer());
        demo.method01(new String());
//        demo.method01(null); reference to method01 is ambiguous
    }
}

/**
 * String and StringBuffer are both child class of Object class so the
 * compiler will confused which child object to match
**/