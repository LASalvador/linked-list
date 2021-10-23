package com.fatec.linkedList;

public class Main {
    public static void main(String[] args) {
        //linkedList = []
        LinkedList linkedList = new LinkedList();
        //linkedList = [4]
        linkedList.add(4);

        //linkedList = [3,4]
        linkedList.add(3);

        //linkedList = [2,3,4]
        linkedList.add(2);

        //linkedList = [2,3,4,5]
        linkedList.add(3,5);

        linkedList.printList();

      // adding without head
       Node n = linkedList.get(1);
       linkedList.add(n,7);

        linkedList.printList();
//        false
        System.out.println(linkedList.contains(6));

        //        true
        System.out.println(linkedList.contains(5));

        //linkedList = [3,4,5]
        linkedList.remove();

        linkedList.printList();

        //linkedList = [3,4,5]
        linkedList.remove(5);

        linkedList.printList();

    }
}
