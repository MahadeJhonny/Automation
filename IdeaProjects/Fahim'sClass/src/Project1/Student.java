package Project1;
//Define a student class and create three different instances of student,using three different constructor calls.You can define student how you want.make sure you have at least 5 fields and three methods.

public class Student {

    public String  StName;

    public int StId;
    public String stEmail;
    public int stDoB;


public void registerForClass() {
    System.out.println(this.StName +"registered for class");
}

public void dropOfClass () {
    System.out.println(this.StName +"Drop class");
}

    public Student(String stName, , int stId, String stEmail, int stDoB) {
        StName = stName;

        StId = stId;
        this.stEmail = stEmail;
        this.stDoB = stDoB;

    }

    public void StudentInfo() {

        System.out.println("student name is " +this.StName+"Student Id " +this.StId +"Student Email "+this.stEmail);
    }
}

