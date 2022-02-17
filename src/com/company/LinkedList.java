package com.company;

public class LinkedList <Type> {
    // a Node of the list
    private class Node {
        public Type data;
        public Node next;
    }

    // the head of the list is first node
    private Node head;

    // the list starts empty
    public LinkedList() {
        head = null;
    }

    // add an item to the list
    public void add(Type item) {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = head;
        head = newNode;
    }

    // add an item to the end of the list
    public void append(Type item) {
        if (head == null) {
            add(item);
        } else {
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
    }

    // remove an item based on the value
    public void remove(Type item) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data.equals(item)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            }

            prev = current;
            current = current.next;
        }
    }

    // remove an item based on its index
    public void remove(int index) {
        Node current = head;
        Node prev = null;

        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }

            prev = current;
            current = current.next;
        }

        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }
    }

    // print the list from start to finsih
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // print a linked list backwards using recursion
    public void printBackwards(Node node) {
        if (node != null) {
            printBackwards(node.next);
            System.out.println(node.data);
        }
    }

    // helper function to begin printing a linked list backwards
    public void printBackwards() {
        printBackwards(head);
    }

    /**
     * this method returns the number of elements in the list
     * @return the size of the list
     */
    public int size(){
        int counter = 0;
        Node current = head;
        while( current != null){
            current = current.next;
            counter++;
        }
        return counter;

    }

    /**
     * this method should check if the given item is present in the list or not.
     * @param item the item within the list
     * @return boolean returns true if item is within the list
     */
    public boolean contains(Type item){
        Node current = head;
        boolean success = false;
        while(success == false && current != null) {
            if (item.equals(current.data)) {
                success = true;

            } else {
                current = current.next;
            }
        }
        return success;
    }


    /**
     * This method returns the element at a given index.
     * * @param index the index you want to return
     * * @return The data within the index.
     */
    public Type get(int index) {
        Node current = head;
        int counter = 0;
        Type item = current.data;
        for (int i = 0; i <= index; i++)
            if(i == index){
                return current.data;
            }else{
                current = current.next;
            }
        return current.data;
    }
}