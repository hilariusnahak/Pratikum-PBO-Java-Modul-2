// Program dengan pernyataan Switch Case

import java.util.Scanner;

public class Prak_204 {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai Matematika-nya :");
        int matematika = masukan.nextInt();
        System.out.print("Masukkan nilai Fisika-nya :");
        int fisika = masukan.nextInt();
        if ((matematika > 80) && (fisika > 70))
        System.out.println("Siswa tersebut DITERIMA");
        else
        System.out.println("Siswa tersebut TIDAK DITERIMA");
    }
}
