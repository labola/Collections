import java.util.Set;
import java.util.List;

public interface CarMap<K,T> {
    void put(K key, T value);
    T get(K key);
    Set<K> keySet();
    List<T> values();
    boolean remove(K key);
    int size();
    void clear();


}
