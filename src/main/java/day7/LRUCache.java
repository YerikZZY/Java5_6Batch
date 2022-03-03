package day7;

import java.util.LinkedHashMap;

public class LRUCache {
    int cap;
    LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity){
        this.cap = capacity;
    }

    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }
        makeRecent(key);
        return cache.get(key);
    }

    public void put(int key, int value){
        if(cache.containsKey(key)){
            cache.put(key, value);
            makeRecent(key);
            return;
        }
        if(cache.size() >= this.cap){
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }

        cache.put(key, value);

    }

    public void makeRecent(int key){
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }
}
