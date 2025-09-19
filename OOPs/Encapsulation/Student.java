public class Student {
    private String name;
    private int roll_no;

    public Student(String name , int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }

    public int getRoll_no(){
        return roll_no;
    }
}
