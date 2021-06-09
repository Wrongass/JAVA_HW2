import java.util.*;
import java.util.function.BiFunction;

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

    public static String consoleInput() {
        System.out.println("Задание №3");
        System.out.println("Введите данные соответствующие формату: имя_игрока количество_очков");
        System.out.println("Пример данных: \"Ivan 5\",\"Petr 3\",\"Alex 10\",\"Petr 8\",\"Ivan 6\",\"Alex 5\",\"Ivan 1\",\"Petr 5\",\"Alex 1\"");
        Scanner inputData = new Scanner(System.in);
        String data = inputData.nextLine();
        return data;
    }


}
