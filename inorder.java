public Node inorderSuccessor(Node node) {
    if (node.right != null) {
        node = node.right;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    Node parent = node.parent;
    while (parent != null && parent.right == node) {
        node = parent;
        parent = parent.parent;
    }
    return parent;
}
