
public class BinTreeNode<T> {

    T value;
    BinTreeNode<T> left;
    BinTreeNode<T> right;

    public BinTreeNode(final T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinTreeNode(final BinTreeNode<T> left, final T value, final BinTreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinTreeNode<T> getRight() {

        return this.right;
    }

    public BinTreeNode<T> getLeft() {

        return this.left;
    }
}
