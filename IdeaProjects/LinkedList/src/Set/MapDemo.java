package Set;

import java.util.HashMap;
import java.util.Map;

public class MapDemo<Key,Value> {
    public static void main(String[] args) {
        Map< Integer,String > map=new HashMap <>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        map.replace(3,"Three");
        map.remove(5);

        for (Map.Entry m:map.entrySet());
        System.out.println("Key " + map.get(4)+ "Value " +map.get(4));



    }




}
