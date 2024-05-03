public class EqualsIgnoredCase {
    public static void main(String[] args) {
        String text = "Pemrograman Berbasis Objek";
        String text3 = "pemrograman berbasis objek";
        boolean isEqualIgnoreCase = text.equalsIgnoreCase(text3);
        System.out.println("String sama dengan text3 (case insensitive): " + isEqualIgnoreCase);
    }
}
