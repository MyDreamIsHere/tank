package com.example.demo.web;

/**
 * @author xiong
 */
public class Test17 {

    public static void main(String[] args) {
        TreeNode treeNode = constructTree();

        System.out.println("high:" + high(treeNode));

        TreeNode rs = find(treeNode, 1);
        if (rs != null) {
            System.out.println(rs.getValue());
        } else {
            System.out.println("not exist");
        }

        insert(treeNode, new TreeNode(55, null, null));
        TreeNode rs2 = find(treeNode, 51);
        if (rs2 != null) {
            System.out.println(rs2.getValue() + " " + rs2.getRight().getValue());
        } else {
            System.out.println("not exist");
        }

        delete(treeNode, 55);
        delete(treeNode, 13);
        delete(treeNode, 18);
        delete(treeNode, 33);
        System.out.println(1);
    }

    public static int high(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return Math.max(high(treeNode.getLeft()), high(treeNode.getRight())) + 1;
    }

    public static void delete(TreeNode treeNode, int value) {
        //查找要删除的节点和其父节点
        TreeNode p = treeNode;
        TreeNode pp = null;
        while (p != null && (int) p.getValue() != value) {
            pp = p;
            if (value > (int) p.getValue()) {
                p = p.getRight();
            } else {
                p = p.getLeft();
            }
        }

        if (p == null) {
            return;
        }

        //要删除的节点有两个子节点
        if (p.getLeft() != null && p.getRight() != null) {
            TreeNode t = p.getRight();
            TreeNode tt = t;
            while (t.getLeft() != null) {
                tt = t;
                t = t.getLeft();
            }

            p.setValue(t.getValue());
            p = t;
            pp = tt;
        }

        //要删除的节点有1个子节点 或者为叶子节点
        TreeNode child;
        if (p.getLeft() != null) {
            child = p.getLeft();
        } else if (p.getRight() != null) {
            child = p.getRight();
        } else {
            child = null;
        }

        if (pp.getLeft() == p) {
            pp.setLeft(child);
        } else if (pp.getRight() == p) {
            pp.setRight(child);
        }

    }

    public static void insert(TreeNode treeNode, TreeNode insertTreeNode) {
        int treeNodeValue = (int) treeNode.getValue();
        int insertTreeNodeValue = (int) insertTreeNode.getValue();
        if (insertTreeNodeValue > treeNodeValue) {
            if (treeNode.getRight() == null) {
                treeNode.setRight(insertTreeNode);
            } else {
                insert(treeNode.getRight(), insertTreeNode);
            }
        } else if (insertTreeNodeValue < treeNodeValue) {
            if (treeNode.getLeft() == null) {
                treeNode.setLeft(insertTreeNode);
            } else {
                insert(treeNode.getLeft(), insertTreeNode);
            }
        }
    }

    public static TreeNode find(TreeNode treeNode, int value) {
        if (treeNode == null) {
            return null;
        }
        int treeNodeValue = (int) treeNode.getValue();
        if (treeNodeValue == value) {
            return treeNode;
        } else if (treeNodeValue > value) {
            return find(treeNode.getLeft(), value);
        } else if (treeNodeValue < value) {
            return find(treeNode.getRight(), value);
        }
        return null;
    }

    public static TreeNode constructTree() {

        TreeNode treeNodeP = new TreeNode(19, null, null);
        TreeNode treeNodeQ = new TreeNode(27, null, null);


        TreeNode treeNodeI = new TreeNode(15, null, null);
        TreeNode treeNodeK = new TreeNode(17, null, null);
        TreeNode treeNodeN = new TreeNode(25, treeNodeP, treeNodeQ);
        TreeNode treeNodeO = new TreeNode(51, null, null);
        TreeNode treeNodeR = new TreeNode(66, null, null);


        TreeNode treeNodeG = new TreeNode(58, treeNodeO, treeNodeR);
        TreeNode treeNodeF = new TreeNode(34, null, null);
        TreeNode treeNodeE = new TreeNode(18, treeNodeK, treeNodeN);
        TreeNode treeNodeD = new TreeNode(13, null, treeNodeI);

        TreeNode treeNodeC = new TreeNode(50, treeNodeF, treeNodeG);
        TreeNode treeNodeB = new TreeNode(16, treeNodeD, treeNodeE);

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
