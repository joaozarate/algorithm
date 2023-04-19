package org.example.algoexpert.binarysearchtrees;

public class FindClosestValueInBST {

    public static void main(String[] args) {

        var root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(13);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);

        int actual = findClosestValueInBST(root, 13, root.value);

        System.out.println(actual);

    }

    static int findClosestValueInBST(BST tree, int target, int closest) {

        if (tree == null) {
            return closest;
        }

        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }

        if (target < tree.value && tree.left != null) {
            return findClosestValueInBST(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBST(tree.right, target, closest);
        } else {
            return closest;
        }

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

}
