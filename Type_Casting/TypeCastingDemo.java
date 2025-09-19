public class TypeCastingDemo {
    public static void main(String[] args) {

        // Widening Casting (Implicit)

        byte byteValue = 10;            // 1 byte
        int intValue = byteValue;       // byte -> int
        double doubleValue = intValue;  // int -> double

        System.out.println("Widening Casting:");
        System.out.println("byte to int    : " + intValue);
        System.out.println("int to double  : " + doubleValue);

        // Narrowing Casting (Explicit)

        double bigDouble = 99.99;
        int narrowedInt = (int) bigDouble;     // double -> int
        byte narrowedByte = (byte) narrowedInt; // int -> byte

        System.out.println("\nNarrowing Casting:");
        System.out.println("double to int  : " + narrowedInt);
        System.out.println("int to byte    : " + narrowedByte);
    }
}
