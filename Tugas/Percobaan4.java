public class Percobaan4 {
    public static void main(String[] args) {
        int bil =10;
        String b[] = {"a", "b", "c"};

        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi pembagian dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi pelanggaran memory");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan");
        } 
    }
}
