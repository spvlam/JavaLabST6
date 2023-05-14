public class swaper {
    public static <T> void swap(T obj1, T obj2) {
        T temp = obj1;
        obj1 = obj2;
        obj2 = temp;
    }
}
