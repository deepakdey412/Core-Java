public class Test {
    public static void main(String[] args) {
        // Create 2 students
        Student student01 = new Student("Deepak Dey", 15);
        Student student02 = new Student("Monika Dey", 18);

        // Print using toString
        System.out.println(student01.getName() + " " + student01.getRoll_no());
        System.out.println(student02.getName() + " " + student02.getRoll_no());

        // Update student01
        student01.setName("Mohan");
        student01.setRoll_no(74);
        System.out.println("After Update : " + student01.getName() + " " + student01.getRoll_no());

        // Update student02
        student02.setName("Lata");
        student02.setRoll_no(754);
        System.out.println("After Update : " + student02.getName() + " " + student02.getRoll_no());

    }
}
