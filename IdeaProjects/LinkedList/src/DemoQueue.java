import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {
        LinkedList< Integer > ticketNumber=new LinkedList <>();
        ticketNumber.add(12333);
        ticketNumber.add(22222);
        ticketNumber.add(88888);
        ticketNumber.add(89990);

       int firstTicketNumber= ticketNumber.peekFirst();
        System.out.println(firstTicketNumber);

        ticketNumber.poll();

        firstTicketNumber= ticketNumber.peekFirst();
        System.out.println(firstTicketNumber);

        PriorityQueue <Character> alphabtQueue=new PriorityQueue <>();

        alphabtQueue.add('G');
        alphabtQueue.add('T');
        alphabtQueue.add('Y');
        alphabtQueue.add('I');

        alphabtQueue.poll();

        char firstCharectar=alphabtQueue.peek();
        System.out.println(firstCharectar);

        while (!alphabtQueue.isEmpty());
        System.out.println(alphabtQueue.poll());

        while (!alphabtQueue.isEmpty());
        System.out.println(alphabtQueue.poll());





    }

}
