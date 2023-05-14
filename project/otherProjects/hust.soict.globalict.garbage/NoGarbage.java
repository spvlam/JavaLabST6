public class NoGarbage {
    public static void createNoGarbage() {
        StringBuilder builder = new StringBuilder();
        while (true) {
            builder.append("This is garbage!");
            String result = builder.toString();
            builder.setLength(0); // Reset the StringBuilder
        }
    }

    public static void main(String[] args) {
        createNoGarbage();
    }
}
