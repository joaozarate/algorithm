package org.example.algoexpert.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveDuplicatesFromLinkedListTest {

    @Test
    void test() {
        RemoveDuplicatesFromLinkedList.LinkedList input = new RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));

        List<Integer> expectedNodes = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6));

        RemoveDuplicatesFromLinkedList.LinkedList output = new RemoveDuplicatesFromLinkedList().execute(input);

        System.out.println("Expected Nodes: " + expectedNodes);
        Assertions.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

    public RemoveDuplicatesFromLinkedList.LinkedList addMany(RemoveDuplicatesFromLinkedList.LinkedList ll, List<Integer> values) {
        RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new RemoveDuplicatesFromLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(RemoveDuplicatesFromLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<>();
        RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

}