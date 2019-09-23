public class BTree
{

    private static class Node {
        int d = -1;
        Node l = null;
        Node r = null;

        public Node(int d) {
            this.d = d;
        }
    }

    private static void printInOrder(Node n) {
        if (n.l != null) {
            printInOrder(n.l);
        }
        System.out.print(n.d + " ");
        if (n.r != null) {
            printInOrder(n.r);
        }
    }
    private static void printPreOrder(Node n) {
        System.out.print(n.d + " ");
        if (n.l != null) {
            printInOrder(n.l);
        }
        if (n.r != null) {
            printInOrder(n.r);
        }
    }
    private static void printPostOrder(Node n) {
        if (n.l != null) {
            printInOrder(n.l);
        }
        if (n.r != null) {
            printInOrder(n.r);
        }
        System.out.print(n.d + " ");
    }

    public static void main(String[] args) {
        Node r = new Node(1);
        r.l = new Node(2);
        r.r = new Node(3);

        r.l.l = new Node(4);
        r.l.r = new Node(5);

        r.r.l = new Node(6);
        r.r.r = new Node(7);

        System.out.println("> In-order");
        printInOrder(r);
        System.out.println();
        System.out.println("> Pre-order");
        printPreOrder(r);
        System.out.println();
        System.out.println("> Post-order");
        printPostOrder(r);
        System.out.println();
    }
}