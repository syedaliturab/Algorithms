public class DoublyLinkedList<K,V> {
    LinkedNode<K,V> head;
    LinkedNode<K,V> tail;
    public LinkedNode<K,V> add(K key,V value)
    {
        Node<K,V> newNode = new Node<>(key,value);
        LinkedNode<K,V> linkedNode=new LinkedNode<>(newNode);
        if(head==null)
        {
            head=tail=linkedNode;
        }
        else
        {
            tail.setNext(linkedNode);
            linkedNode.setPrev(tail);
            tail=linkedNode;

        }
        return linkedNode;
    }
    public void remove(LinkedNode<K,V> node)
    {
        if(node==head)
        {
            removeFirst();
        }
       else if(node==tail)
        {
            removeLast();
        }
       else
        {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }



    }
    public K removeLast()
    {
        if (head == null) return null; // Handle empty list
        K key = tail.getNode().getKey(); // Save the key to
        if(head==tail)
        {
            head=tail=null;
            return key;
        };
        tail.getPrev().setNext(null);
        tail=tail.getPrev();
        return key;

    }
    public K removeFirst()
    {   if (head == null) return null; // Handle empty list
        K key = head.getNode().getKey(); // Save the key to
        if(head==tail)
        {
            head=tail=null;
            return key;
        }
        head.getNext().setPrev(null);
        head=head.getNext();
            return key;

    }
    public void display ()
    {LinkedNode node=head;
        while(node!=null)
        {
            System.out.println(node.getNode().getKey()+" ---> "+node.getNode().getValue());
            node=node.getNext();
        }
    }
}
