package Tree;

public class App {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        root.inorder(root);
        System.out.println("\n ___________________________");
        root.preorder(root);
        System.out.println("\n ___________________________");
        root.postorder(root);

        System.out.println("\n ___________________________");

        System.out.println(root.height(root));

        System.out.println("\n ___________________________");

        root.printKDistance(root,2);

        System.out.println("\n ___________________________");

        root.printLevel(root);

        System.out.println("\n ___________________________");

        root.printLevelByLine(root);

        System.out.println("\n ___________________________");
        System.out.println(root.getSize(root ));

    }
}


// Inorder (Left Root Right)
// Preorder (Root Left Right)
// Postorder (Left Right Root)