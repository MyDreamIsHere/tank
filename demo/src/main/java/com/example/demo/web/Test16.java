package com.example.demo.web;

import java.util.LinkedList;

/**
 * @author xiong
 */
public class Test16 {

    public static void main(String[] args) {
        TreeNode treeNode = constructTree();
        level(treeNode);
    }

    public static void level(TreeNode treeNode) {
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.push(treeNode);
        while (list.size() > 0) {
            TreeNode nodeCur = list.pop();
            System.out.print(nodeCur.getValue() + " ");
            TreeNode nodeLeft = nodeCur.getLeft();
            TreeNode nodeRight = nodeCur.getRight();
            if (nodeLeft != null) {
                list.addLast(nodeLeft);
            }
            if (nodeRight != null) {
                list.addLast(nodeRight);
            }
        }
    }

    public static TreeNode constructTree() {

        TreeNode treeNodeP = new TreeNode(19, null, null);
        TreeNode treeNodeQ = new TreeNode(27, null, null);


        TreeNode treeNodeI = new TreeNode(16, null, null);
        TreeNode treeNodeK = new TreeNode(25, treeNodeP, treeNodeQ);
        TreeNode treeNodeN = new TreeNode(51, null, null);
        TreeNode treeNodeO = new TreeNode(66, null, null);


        TreeNode treeNodeG = new TreeNode(58, treeNodeN, treeNodeO);
        TreeNode treeNodeF = new TreeNode(34, null, null);
        TreeNode treeNodeE = new TreeNode(18, null, treeNodeK);
        TreeNode treeNodeD = new TreeNode(13, null, treeNodeI);

        TreeNode treeNodeC = new TreeNode(50, treeNodeF, treeNodeG);
        TreeNode treeNodeB = new TreeNode(17, treeNodeD, treeNodeE);

        TreeNode treeNodeA = new TreeNode(33, treeNodeB, treeNodeC);
        return treeNodeA;
    }

    static class TreeNode {
        private Object value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(Object value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
