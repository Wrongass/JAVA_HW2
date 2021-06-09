import java.util.Collection;
import java.util.HashSet;

public class Task1 {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Collection<T> noDuplicatesColl = new HashSet<>(collection);
        System.out.println("Задание №1\n" + "Исходная коллекция:");
        System.out.println(collection);
        System.out.println("Коллекция без дубликатов: ");
        System.out.println(noDuplicatesColl + "\n");
        return noDuplicatesColl;
    }
}
