import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Task3 extends Data {
    static BiFunction<Integer, Integer, Integer> bFunc = Integer::sum;

    public void startTask3() {
        gamersList(consoleInput());
    }

    public static void gamersList(String data) {
        Map<String, Integer> map = new HashMap<>();

        String[] stringArray = data.replace("\"", "").split(",");
        for (String a : stringArray) {
            String[] mapStr = a.split(" ");

            map.merge(mapStr[0], Integer.parseInt(mapStr[1]), bFunc);
        }
        getWinner(map, stringArray);
    }

    public static void getWinner(Map<String, Integer> map, String[] stringArray) {
        int maxValue = Collections.max(map.values());
        Map<String, Integer> newMap = new HashMap<>();

        for (String a : stringArray) {
            String[] mapStr = a.split(" ");
            newMap.merge(mapStr[0], Integer.parseInt(mapStr[1]), bFunc);
            if (Collections.max(newMap.values()) == maxValue) {
                for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
                    if (entry.getValue() == maxValue) {
                        String maxKey = entry.getKey();
                        System.out.println("Первым набрал " + maxValue + " очков " + maxKey);
                    }
                }
                break;
            }
        }
    }
}
