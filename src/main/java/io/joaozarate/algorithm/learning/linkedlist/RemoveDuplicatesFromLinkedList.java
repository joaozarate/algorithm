package io.joaozarate.algorithm.learning.linkedlist;

public class RemoveDuplicatesFromLinkedList {

    static LinkedList execute(LinkedList linkedList) {

        LinkedList currentNode = linkedList;

        while (currentNode != null) {
            LinkedList nextDistinctNode = currentNode.next;

            while (nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
                nextDistinctNode = nextDistinctNode.next;
            }

            currentNode.next = nextDistinctNode;
            currentNode = nextDistinctNode;
        }

        return linkedList;
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value){
            this.value = value;
            this.next = null;
        }
    }

}
