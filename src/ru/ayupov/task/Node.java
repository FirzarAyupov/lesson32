package ru.ayupov.task;

class Node {
    private int id;
    private Node left = null;
    private Node right = null;

    Node(int id) {
        this.id = id;
    }

    public void addChildNode(Node childNode) {
        if (this.id > childNode.id) {
            if (this.left == null) {
                this.left = childNode;
            } else {
                this.left.addChildNode(childNode);
            }
        } else {
            if (this.right == null) {
                this.right = childNode;
            } else {
                this.right.addChildNode(childNode);
            }
        }
    }

    public static int getLeafCount(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }
}
