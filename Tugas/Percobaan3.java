public class Percobaan3 {
    public static void main(String[] args) {
        int bil = 10;

        try {
            System.out.println(bil / 0);
        } catch (Exception e) {
            System.out.println("Terjadi pembagian dengan nol");
        }
    }
}
