package Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Map<String,Set<String>> student=new HashMap <>();

        String firstStudentId="30145NY";
        String secondStudentId="30145NY";
        String thirdStudentId="30145NY";

        Set<String> homeWorkCompleationbyStudent1=new HashSet <>();

        homeWorkCompleationbyStudent1.add("HW1");
        homeWorkCompleationbyStudent1.add("HW2");
        homeWorkCompleationbyStudent1.add("HW3");

        Set<String> homeWorkCompleationbyStudent2=new HashSet <>();

        homeWorkCompleationbyStudent2.add("HW1");
        homeWorkCompleationbyStudent2.add("HW2");

        Set<String> homeWorkCompleationbyStudent3=new HashSet <>();

        homeWorkCompleationbyStudent3.add("HW1");
        homeWorkCompleationbyStudent3.add("HW2");
        homeWorkCompleationbyStudent3.add("HW3");
        homeWorkCompleationbyStudent3.add("HW4");
        homeWorkCompleationbyStudent3.add("HW5");

        student.put(firstStudentId,homeWorkCompleationbyStudent1);
        student.put(secondStudentId,homeWorkCompleationbyStudent2);
        









    }
}
