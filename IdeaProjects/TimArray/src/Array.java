import static java.lang.System.*;

public class Array {

    public static void main(String[] args) {

        int[] myIntArray=new int[10];

        for(int i=0;i<10;i++) {
            myIntArray[i]=i*10;
            out.println(myIntArray[i]);
        }

    }
}
