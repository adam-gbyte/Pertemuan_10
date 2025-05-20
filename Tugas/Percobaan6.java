public class Percobaan6 {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
        // System.out.println("Ini tidak akan dieksekusi");
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Pesan error :" + e);
        }
    }
}
