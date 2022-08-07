public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList("g");
        linkedList.addFirst("f");
        linkedList.addFirst("e");
        linkedList.addFirst("d");
        linkedList.addFirst("c");
        linkedList.addFirst("b");
        linkedList.addFirst("a");
        System.out.println("===========trước khi thêm==================");
        linkedList.printList();
        linkedList.add(5, "hello");
        System.out.println("===========sau khi thêm==================");
        linkedList.printList();
    }
}