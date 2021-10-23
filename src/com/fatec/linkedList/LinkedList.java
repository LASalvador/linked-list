package com.fatec.linkedList;

public class LinkedList {
    Node head;
    // Time complexity of add() is O(1)
    // Add at the head
    public void add(int newData) {
        /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node newNode = new Node(newData);
        /* 3. Make next of new Node as head */
        /* Fist time head will be null so the head new node will pointer to null*/
        newNode.next = head;
        /* 4. Move the head to point to new Node */
        head = newNode;
    }
    // Do addition without head
    public void add(Node node, int newData) {
       Node newNode = new Node(newData);
       node.next = newNode;
    }

    // Time complexity of add() is O(n), best case O(1) worst case O(n)
    // Add at the middle
    public void add(int index, int data) {
//        If hasn't head set at head
        if (head == null) {
            head = new Node(data);
            return;
        }
//        set at the index or set as tail
        int position = 0;
        Node temp = head;
        while (temp.next != null) {
            position++;
            temp = temp.next;
            if ((position + 1) == index) {
                break;
            }
        }
        temp.next = new Node(data);
    }
    // Time complexity of remove() is O(n), best case O(1) wort case O(n)
    /* Given a key, deletes the first
      occurrence of key in linked list */
    public void remove(int key) {
        Node temp = head, prev = null;
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data ==key) {
            head = temp.next;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // If key was not present in linked list
        if (temp == null) {
            return;
        }
        // Unlink the node from linked list
        prev.next = temp.next;
    }
    // remove from head
    // Time complexity of remove is O(1)
    public void remove() {
        head = head.next;
    }

    // Time complexity of contains is O(n), best case O(1) worst case O(n)
    // search
    public boolean contains(int x) {
       Node current = head;

       while (current != null) {
           if (current.data == x) {
               return true;
           }
           current = current.next;
       }
       return false;
    }

    // Time complexity of get is O(n), best case O(1) worst case O(n)
    // search
    public Node get(int x) {
        Node current = head;

        while (current != null) {
            if (current.data == x) {
                return current;
            }
            current = current.next;
        }
        return null;
    }


    public void printList() {
        Node current = head;
        System.out.print("[");
        while (current !=null ) {
            System.out.print(current.data+ ",");
            current = current.next;
        }
        System.out.print("]");
    }

}
