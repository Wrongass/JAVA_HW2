import java.util.*;

public class Data {
    public static <T> Collection<T> getCollection() {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int num = 5 + random.nextInt(10);
            arrList.add(num);
        }
        return (Collection<T>) arrList;
    }

    public static <K, V> Map<V, K> getMap() {
        Map mapA = new TreeMap();
        mapA.put("key1", "element 1");
        mapA.put("key2", "element 2");
        mapA.put("key3", "element 3");
        return mapA;
    }


}
