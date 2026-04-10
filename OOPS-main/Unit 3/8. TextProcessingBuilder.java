public class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb.toString());
    }
}
// StringBuffer is synchronized (thread-safe) whereas StringBuilder is not, making StringBuilder faster for single-threaded use.
