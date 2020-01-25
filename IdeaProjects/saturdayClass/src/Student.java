public class Student {

    private String stName;
    private int  stId;

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public static void main(String[] args) {

        Student Messi=new Student();
        Messi.setStName("Lionel");
        System.out.println("Student name is " +Messi.getStName());

    }
}
