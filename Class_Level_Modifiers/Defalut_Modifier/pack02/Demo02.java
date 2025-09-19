package pack02;

import pack01.Demo01; // default class is not accessable  outside the package

public class Demo02 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01(); // default class is not accessable outside the package

        System.out.println("Package pack 02");
        demo01.print();
    }
}
