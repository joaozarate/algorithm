package io.joaozarate.algorithm.learning.binarysearchtrees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindClosestValueInBSTTest {

    @Test
    void findClosestValueInBST() {

        var root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(13);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);

        var target = 0;
        var expected = 1;

        int result = FindClosestValueInBST.findClosestValueInBST(root, target, root.value);

        Assertions.assertEquals(expected, result);

    }
}