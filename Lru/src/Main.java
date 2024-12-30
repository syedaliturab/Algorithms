//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 LRUCache<String,Integer> lru=new LRUCache<>(4);
 lru.add("as",4);
 lru.add("an",3);
 lru.add("ad",2);
        lru.add("av",4);
        lru.add("ak",3);
        lru.add("as",9);
        lru.add("ak",9);
        lru.getValue("av");
        lru.display();
        }
    }
