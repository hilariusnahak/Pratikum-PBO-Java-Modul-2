// Program dengan pernyataan IF ELSE bertingkat

import java.util.Scanner;

public class Prak_203 {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan angka 1 - 3 : ");
        int bil = masukan.nextInt();
        switch (bil) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
            default:
                System.out.println("Bilangan di luar range");
        }
    }
}
