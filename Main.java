/*
 * Copyright (C) 2020 Syamsuddin, Averill
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 
 *
 * @author Syamsuddin & Averill
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main gate = new Main(); //penghubung method
        Scanner scan = new Scanner(System.in);

        String confirm = "n";

        String golongan[] = new String[7];
        String gol_temp = "Belum Pilih"; // untuk tampilan dan beberapa fungsi lain
        long lis_temp = 0;      // untuk tampilan
        double bia_temp = 0;    // untuk tampilan
        long listrik[] = new long[7];
        double biaya[] = new double[7];
        golongan[0] = "R-1/TR";
        listrik[0] = 450;
        biaya[0] = 165;
        golongan[1] = "R-1/TR";
        listrik[1] = 900;
        biaya[1] = 274;
        golongan[2] = "R-1M/TR";
        listrik[2] = 900;
        biaya[2] = 1352;
        golongan[3] = "R-1/TR";
        listrik[3] = 1300;
        biaya[3] = 1444.70;
        golongan[4] = "R-1/TR";
        listrik[4] = 2200;
        biaya[4] = 1444.70;
        golongan[5] = "R-2/TR";
        listrik[5] = 5500;
        biaya[5] = 1444.70;
        golongan[6] = "R-3/TR";
        listrik[6] = 5501; //diatas 5500
        biaya[6] = 1444.70;
        String barang[] = {"Lampu", "Rice Cooker", "Kulkas", "AC", "Setrika", "Mesin Cuci"}; //[] pertama = tipe,
        do {
            gate.mainmenu(); //panggil menu
            int menu = scan.nextInt();

            if (menu == 1) {
                do {
                    gate.menuhitung(gol_temp, lis_temp, bia_temp);
                    int menu1 = scan.nextInt();
                    if (menu1 == 1) {
                        gate.daftargolongan();
                        int temp = scan.nextInt();
                        temp--;
                        gol_temp = golongan[temp];
                        lis_temp = listrik[temp];
                        bia_temp = biaya[temp];
                        System.out.println("Golongan : " + golongan[temp]);
                        if (temp == 6) {
                            System.out.println("Daya Max : > " + listrik[temp] + " VA");
                        } else {
                            System.out.println("Daya Max : " + listrik[temp] + " VA");
                        }
                        System.out.println("Biaya    : Rp." + biaya[temp] + "/KWh");
                        System.out.print("Lanjutkan Proses? (Y/N)");
                        confirm = scan.next() + scan.nextLine();
                    } else if (menu1 == 2) {
                        gate.jenisBarang(barang);
                        int pilih = scan.nextInt();
                        gate.daftarBarang(pilih);

                    } else if (menu1 == 6) {
                        break;
                    }
                } while (confirm.equalsIgnoreCase("y"));
            } else if (menu == 2) {
                gate.contact();
            } else if (menu == 3) {
                System.out.println("Bye-bye");
                break;
            }
        } while (true);
    }

    public void mainmenu() { //menu awal
        System.out.println("\nPenghitung biaya listrik (By Syamsuddin & Averill)");
        System.out.println("");
        System.out.println("=====================");
        System.out.println(" Menu:");
        System.out.println(" 1. Hitung");
        System.out.println(" 2. Bantuan");
        System.out.println(" 3. Keluar");
        System.out.println("=====================");
        System.out.print("Pilih menu (1-3): ");
    }

    public void menuhitung(String gol_temp, long lis_temp, double bia_temp) { //menu bagian hitung
        System.out.println("");
        System.out.println("=====================");
        System.out.println(gol_temp + " | " + lis_temp + " | " + bia_temp + "/KWh");
        System.out.println("=====================");
        System.out.println("     HITUNG BIAYA    ");
        System.out.println("=====================");
        System.out.println("1. Pilih Kategori Listrik");
        System.out.println("2. Tambahkan barang");
        System.out.println("3. Update data barang");
        System.out.println("4. Hapus barang");
        System.out.println("5. Hitung total biaya");
        System.out.println("6. Back");
        System.out.println("=====================");
        System.out.print("Pilih menu (1-6): ");
    }

    public void daftargolongan() { //menampilkan daftar golongan
        System.out.println("");
        System.out.println("=====================");
        System.out.println("List Golongan listrik");
        System.out.println("=====================");
        System.out.println("1. R-1/TR  (0 - 450 VA)");
        System.out.println("2. R-1/TR  (451 - 900 VA)");
        System.out.println("3. R-1M/TR (451 - 900 VA)");
        System.out.println("4. R-1/TR  (901 - 1300 VA)");
        System.out.println("5. R-1/TR  (1301 - 2200 VA)");
        System.out.println("6. R-2/TR  (2201 - 5500 VA)");
        System.out.println("7. R-3/TR  (diatas 5500 VA)");
        System.out.println("=====================");
        System.out.print("Pilih (1-7): ");
    }

    public void jenisBarang(String barang[]) {
        for (int i = 0; i < barang.length; i++) {
            System.out.println((i + 1) + ". " + barang[i]);
        }
    }

    public void daftarBarang(int pilih) {
        switch (pilih) {
            case 1:
//                System.out.println("1. LED (4, 6, 10, 13, 18 Watt)"
//                        + "\n2. CFL (6, 9, 12, 15, 20 Watt)"
//                        + "\n3. Halogen (18, 28, 42, 53, 70 W)"
//                        + "\n4. Standard (25, 40, 60, 75, 100 W)");
                System.out.println("Lampu : ");
                System.out.println("1.  4 Watt"
                        + "\n2.  6 Watt"
                        + "\n3.  9 Watt"
                        + "\n4.  10 Watt"
                        + "\n5.  12 Watt"
                        + "\n6.  13 Watt"
                        + "\n7.  15 Watt"
                        + "\n8.  18 Watt"
                        + "\n9.  20 Watt"
                        + "\n10. 25 Watt"
                        + "\n11. 28 Watt"
                        + "\n12. 40 Watt"
                        + "\n13. 42 Watt"
                        + "\n14. 53 Watt"
                        + "\n15. 60 Watt"
                        + "\n16. 70 Watt"
                        + "\n17. 75 Watt"
                        + "\n18. 100 Watt");
            case 2:
                System.out.println("Rice Cooker : ");
        }
    }

//    public int hitung(double bia_temp, double data []){
//        double harga;
//        int KWh;
//        for (int i = 0; i<data.length;i++){
//            KWh = data[i]
//        }
//         
//        harga = bia_temp * KWh
//        return harga;
//    }
    public void contact() {
        System.out.println("Contact Us : "
                + "\n- e-mail  \t: "
                + "\n- WhatsApp\t:"
                + "\n- LINE    \t:");

    }
}
