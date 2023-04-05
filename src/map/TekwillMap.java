package map;

import java.util.HashMap;

public class TekwillMap<K,V> {

    HashMap<K, V> map = new HashMap<K, V>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
         return map.get(key);
    }
}
