package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList < Character > characterLinkedList = new LinkedList <>();

        characterLinkedList.add('S');
        characterLinkedList.add('C');
        characterLinkedList.add('H');
        characterLinkedList.add('O');
        characterLinkedList.add('O');
        characterLinkedList.add('L');

        characterLinkedList.remove(2);

        for (int i = 0; i < characterLinkedList.size(); i++) {
            System.out.println(characterLinkedList.get(i));

        }

        System.out.println("\nUsing for each loop");
        for (Character c : characterLinkedList) {

        }




    }
}
