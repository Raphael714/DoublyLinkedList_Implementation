// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.insertAtBeginning(3);
        list.insertAtBeginning(5);
        list.insertAtBeginning(4);
        list.insertAtBeginning(1);
        list.insertAtBeginning(8);
        list.display();
        System.out.println();
        list.displayReverse();
        System.out.println();
        list.insertAtPos(2,10);
        list.insertAtPos(0,9);
        list.insertAtPos(5,7);
        list.insertAtPos(8,2);
        list.display();
        System.out.println();
        list.deleteAtPos(8);
        list.display();


    }
}