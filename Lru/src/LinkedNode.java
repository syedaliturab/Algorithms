public class LinkedNode<K,V> {
    private Node<K,V> node;
    private LinkedNode<K,V> next;
    private LinkedNode<K,V> prev;
    public LinkedNode(Node<K,V> node) {
        this.node = node;
    }
    public Node<K,V> getNode() {return node;
    }
    public void setNode(Node<K,V> node) {this.node = node;}
    public LinkedNode<K,V> getNext() {return next;}
    public void setNext(LinkedNode<K,V> next) {this.next = next;}
    public LinkedNode<K,V> getPrev() {return prev;}
    public void setPrev(LinkedNode<K,V> prev) {this.prev = prev;}
}
