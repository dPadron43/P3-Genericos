import java.util.LinkedList;
public class Stack<T> {
    private T t;
    public Stack(T t) {
        this.t=t;
    }
    public static <T> boolean isEmpty(LinkedList<T> list) {
        return list.isEmpty();
    }
    public static <T> T removeFirst(LinkedList<T> list) {
        return list.removeFirst();
    }
    public static <T> T getFirst(LinkedList<T> list) {
        return list.getFirst();
    }
    public static <T> void add(LinkedList<T> list, T element) {
        list.add(element);
    }
    public static <T> String toString(LinkedList<T> list) {
        return list.toString();
    }
}


