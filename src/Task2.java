import java.util.*;

public class Task2 {
    public static <K, V> Map<V, Collection<K>> invertKeysAndValues(Map<? extends K, ? extends V> map) {
        System.out.println("Задание №2\nИсходная Map:");
        System.out.println(map);
        Map<V, Collection<K>> invertedMap = new TreeMap<>();

        Set<? extends K> key1 = map.keySet();
        for (K key : key1) {
            V value = map.get(key);
            invertedMap.compute(value, (v, key2) -> {
                if (key2 == null) {
                    key2 = new TreeSet<>();
                }
                key2.add(key);
                return key2;
            });
        }
        System.out.println("Измененная Map:\n" + invertedMap + "\n");
        return invertedMap;
    }
}
