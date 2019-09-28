
public class DoubleNode<T> {
    T key;
    DoubleNode<T> next;
    DoubleNode<T> prev;
    public DoubleNode(){
        //:v
    }
    public DoubleNode (T key){
        this.key = key;
        next = null;
        prev = null;
    }
    public DoubleNode (T key, DoubleNode next, DoubleNode prev){
        this.key = key;
        this.next = next;
        this.prev = prev;
    }
}
