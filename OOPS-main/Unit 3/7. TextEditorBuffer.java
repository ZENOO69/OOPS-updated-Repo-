public class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Initial");
        sb.append(" Text");
        sb.insert(0, "Start ");
        sb.reverse();
        System.out.println(sb.toString());
    }
}
