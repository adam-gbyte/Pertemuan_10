import java.io.*;

public class Pecobaan8 {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) throws IOException {
        Pecobaan8 c = new Pecobaan8();
        
        c.methodA();

        try {
            c.methodB();
        } catch (Exception e) {
            System.out.println("Error di method B");
        } finally {
            System.out.println("Ini selalu di cetak");
        }
    }
}