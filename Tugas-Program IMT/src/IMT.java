// Program Java untuk menentukkan kriteria kegemukan menggunakan index berat tubuh

import java.util.Scanner;

public class IMT {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan Anda (kg)\t: ");
        float B = inputan.nextFloat();
        System.out.print("Masukkan Tinggi Badan Anda (m)\t: ");
        float T = inputan.nextFloat();
        float IMT = B / T / T;
        if (IMT <= 18.5) {
          System.out.printf("IMT\t:\t%.2f%s%n ", IMT, "\t\tTergolong Kurus");
        }
        else if (18.5 < IMT && IMT <= 25) {
          System.out.printf("IMT\t:\t%.2f%s%n ", IMT, "\t\tTergolong Normal");
        }
        else if((25 < IMT) && (IMT <= 30)) {
          System.out.printf("IMT\t:\t%.2f%s%n ", IMT, "\t\tTergolong Gemuk");
        }
        else if(IMT > 30) {
          System.out.printf("IMT\t:\t%.2f%s%n ", IMT, "\t\tTergolong Kegemukan(Obesitas)");
        }
    }
}
