
public class BinTree<T> {
    private BinTreeNode<T> root;

    public BinTree() {
        this.root = null;
    }

    public BinTree(final BinTreeNode<T> root) {
        this.root = root;
    }

    public int nodes() {
        return nodes(this.root);

    }

    public int nodes(final BinTreeNode<T> node) {

        if (node == null) {
            return 0;
        } else {
            return 1 + nodes(node.left) + nodes(node.right);

        }

    }

    public int height() {

        return height(this.root);
    }

    public int height(final BinTreeNode<T> node) {

        if (node == null) {
            return 0;
        } else {
            int heightLeft = height(node.left);
            int heightRight = height(node.right);
            return Math.max(heightLeft, heightRight) + 1;

        }
    }

    public void printAll() {
        printAllHelper(this.root);
    }

    private void printAllHelper(final BinTreeNode<T> node) {
        if (node == null) {
            return;
        } else {
            printAllHelper(node.left);
            System.out.println(node.value);
            printAllHelper(node.right);
        }
    }

    public BinTree<T> mirror() {
        return new BinTree<T>(mirrorHelper(this.root));

    }

    private BinTreeNode<T> mirrorHelper(final BinTreeNode<T> currnode) {
        if (currnode == null) {
            return null;
        } else {
            return new BinTreeNode<T>(mirrorHelper(currnode.right), currnode.value, mirrorHelper(currnode.left));

        }

    }

}
