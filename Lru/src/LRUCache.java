import java.util.HashMap;
import java.util.Map;


public class LRUCache<K,V> {
    private Map<K,LinkedNode<K,V>> nodeMap=new HashMap<K,LinkedNode<K,V>>();
    private DoublyLinkedList<K,V> list=new DoublyLinkedList<>();
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    public Integer getSize()
    {
        return nodeMap.size();
    }
    public void clear()
    {
        nodeMap.clear();
        list=new DoublyLinkedList<>();

    }
    public void add(K key,V value )
    {

        LinkedNode<K,V> node=nodeMap.get(key);
        if(node!=null)
        {
            list.remove(node);

        }
        else {
            if(nodeMap.size()>=capacity)
            {
                nodeMap.remove(list.removeFirst());
            }
        }
        node= list.add(key,value);
        nodeMap.put(key,node);
    }
    public V getValue(K key)
    {
        LinkedNode<K,V> node=nodeMap.get(key);
        if (node != null) {
            list.remove(node); // Remove it from the current position
            list.add( node.getNode().getKey(),  node.getNode().getValue()); // Add it to the end (recently used)
            return  node.getNode().getValue();
        } else {
            return null;
        }
    }
    public void display()
    {
        list.display();
    }
}
