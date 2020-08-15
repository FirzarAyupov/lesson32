package ru.ayupov.task;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node4.addChildNode(node2);
        node4.addChildNode(node6);

        node2.addChildNode(node1);
        node2.addChildNode(node3);

        node6.addChildNode(node5);
        node6.addChildNode(node7);

        System.out.println(Node.getLeafCount(node4));

    }
}
