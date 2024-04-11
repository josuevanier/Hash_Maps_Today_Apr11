import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {


        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1,"sas2d");
        map.put(2,"saassd");
        map.put(3,"ssasd");
        System.out.println("s");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
