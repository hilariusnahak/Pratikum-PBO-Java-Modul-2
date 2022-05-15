// Program dengan Pernyataan IF

import java.util.Scanner;

public class Prak_201 {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir mata kuliahnya :");
        nilai = masukan.nextInt();
        if (nilai < 55)
         System.out.println("Mahasiswa tersebut tidak lulus");
    }
}
