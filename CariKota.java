public class CariKota {
    public static void main(String[] args) {
        String placeBirth[] = {"JAKARTA", "BANDUNG", "MALANG", "SUKABUMI", "MAGELANG"};

        int totalCity = 0;
        for (int i = 0; i < placeBirth.length; i++) {
            char prefix = placeBirth[i].charAt(0);
            if (prefix == 'M') {
                totalCity++;
            }
        }
        System.out.println("Total kota : " + totalCity);
    }
}
