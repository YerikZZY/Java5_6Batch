package day4;

import java.util.*;

public class Assignment3_15 {
    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        Collections.addAll(a,1,2,3,4,10);
        Map<String, String> b = new HashMap<>();
        b.put("a", "1");
        b.put("b", "2");
        b.put("c", "10");
        for(int i = 0; i<a.size(); i++){
            String j = a.get(i).toString();
            if(!b.containsValue(j)){
                c.add(j);
            }
        }
        System.out.println(c);
    }

}
