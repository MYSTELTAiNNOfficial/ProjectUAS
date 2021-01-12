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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main gate = new Main(); //penghubung method
        Scanner scan = new Scanner(System.in);

        String confirm = "n";
        String yn = "n";

        String golongan[] = new String[7];
        String listrik[] = new String[7];
        double biaya[] = new double[7];
        String gol_temp = "-"; // untuk tampilan dan beberapa fungsi lain
        String lis_temp = "-";      // untuk tampilan
        double bia_temp = 0;    // untuk tampilan

//        int counter1 = 0;
//        String list[][] = new String[counter1][5];
        golongan[0] = "R-1/TR";
        listrik[0] = "450";
        biaya[0] = 165;
        golongan[1] = "R-1/TR";
        listrik[1] = "900";
        biaya[1] = 274;
        golongan[2] = "R-1M/TR";
        listrik[2] = "900";
        biaya[2] = 1352;
        golongan[3] = "R-1/TR";
        listrik[3] = "1300";
        biaya[3] = 1444.70;
        golongan[4] = "R-1/TR";
        listrik[4] = "2200";
        biaya[4] = 1444.70;
        golongan[5] = "R-2/TR";
        listrik[5] = "5500";
        biaya[5] = 1444.70;
        golongan[6] = "R-3/TR";
        listrik[6] = "> 5500"; //diatas 5500
        biaya[6] = 1444.70;

        String barang[] = {"Lampu", "Rice Cooker", "Kulkas", "AC", "Setrika", "Mesin Cuci", "Kipas Angin"}; //[] pertama = tipe,
        int lampu[] = {4, 6, 9, 10, 12, 13, 15, 18, 20, 25, 28, 40, 42, 53, 60, 70, 75, 100};
        int rcook[] = {200, 300, 350, 395, 400, 980};
        int kulkas[] = {60, 75, 80, 84, 85, 115, 116};
        int AC[] = {400, 600, 840, 1170, 1920, 2570};
        int Setrika[] = {150, 300, 350, 395, 400, 450, 1300, 2400};
        int mcuci[] = {220, 325, 350, 450};
        int kangin[] = {5, 30, 35, 45, 50, 70, 80, 90};

        ArrayList<Integer> Watt = new ArrayList<>();//array list
        ArrayList<Integer> Jumlah = new ArrayList<>();
        ArrayList<Integer> Waktu = new ArrayList<>();

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
                        System.out.println("Golongan : " + golongan[temp]);
                        System.out.println("Daya Max : " + listrik[temp] + " VA");
                        System.out.println("Biaya    : Rp." + biaya[temp] + "/KWh");
                        System.out.print("Lanjutkan Proses (Y/n)? ");
                        confirm = scan.next() + scan.nextLine();

                    } else if (menu1 == 2) {
                        do {
                            gate.jenisBarang(barang);
                            int pilih = scan.nextInt();

                            gate.daftarBarang(pilih, lampu, rcook, kulkas, AC, Setrika, mcuci, kangin);
                            System.out.print("Pilih : ");
                            int no = scan.nextInt();

                            if (pilih == 1) { //lampu
                                Watt.add(lampu[no-1]);
                                System.out.print("Jumlah Lampu : ");
                                int jumlah = scan.nextInt();
                                Jumlah.add(jumlah);
                                System.out.print("Lama Pemakaian (Akumulasi): ");
                                int waktu = scan.nextInt();
                                Waktu.add(waktu);
                            } else if (pilih == 2) { //Rice Coooker
                                Watt.add(rcook[no-1]);
                                System.out.print("Jumlah Rice Cooker : ");
                                int jumlah = scan.nextInt();
                                Jumlah.add(jumlah);
                                System.out.print("Lama Pemakaian (Akumulasi): ");
                                int waktu = scan.nextInt();
                                Waktu.add(waktu);
                            } else if (pilih == 3) { //Kulkas
                                Watt.add(kulkas[no-1]);
                                System.out.print("Jumlah Kulkas : ");
                                int jumlah = scan.nextInt();
                                Jumlah.add(jumlah);
                                System.out.print("Lama Pemakaian (Akumulasi): ");
                                int waktu = scan.nextInt();
                                Waktu.add(waktu);
                            } else if (pilih == 4) { //AC
                                Watt.add(AC[no-1]);
                                System.out.print("Jumlah AC : ");
                                int jumlah = scan.nextInt();
                                Jumlah.add(jumlah);
                                System.out.print("Lama Pemakaian (Akumulasi): ");
                                int waktu = scan.nextInt();
                                Waktu.add(waktu);
                            } else if (pilih == 5) { //Setrika
                                Watt.add(Setrika[no-1]);
                                System.out.print("Jumlah Setrika : ");
                                int jumlah = scan.nextInt();
                                Jumlah.add(jumlah);
                                System.out.print("Lama Pemakaian (Akumulasi): ");
                                int waktu = scan.nextInt();
                                Waktu.add(waktu);
                            } else if (pilih == 6) { //Mecin Cuci
                                Watt.add(mcuci[no-1]);
                                System.out.print("Jumlah Mesin Cuci : ");
                                int jumlah = scan.nextInt();
                                Jumlah.add(jumlah);
                                System.out.print("Lama Pemakaian (Akumulasi): ");
                                int waktu = scan.nextInt();
                                Waktu.add(waktu);
                            } else if (pilih == 7) { //Kipas Angin
                                Watt.add(kangin[no-1]);
                                System.out.print("Jumlah Kipas Angin : ");
                                int jumlah = scan.nextInt();
                                Jumlah.add(jumlah);
                                System.out.print("Lama Pemakaian (Akumulasi): ");
                                int waktu = scan.nextInt();
                                Waktu.add(waktu);
                            }

                            System.out.println("Tambahkan barang (Y/n)? ");
                            yn = scan.next();
                            
                            System.out.println();
                            
                        } while (yn.equalsIgnoreCase("Y"));
                        
                    } else if (menu1 == 6) {
                        break;
                    }
                } while (confirm.equalsIgnoreCase("y"));
            } else if (menu == 2) {
                gate.contact();
                confirm = scan.next() + scan.nextLine();
            } else if (menu == 3) {
                System.out.println("Bye-bye");
                break;
            }
        } while (true || confirm.equalsIgnoreCase("Y"));
    }

    public void mainmenu() { //menu awal
        for (int i = 0; i < 25; i++) {
            System.out.println("");
        }
        System.out.println("DenCalc (Denkidai Calculator)"
                + "\nPenghitung Biaya Tagihan Listrik (By Syamsuddin & Averill)");
        System.out.println("=====================");
        System.out.println(" Menu:");
        System.out.println(" 1. Hitung");
        System.out.println(" 2. Bantuan");
        System.out.println(" 3. Keluar");
        System.out.println("=====================");
        System.out.print("Pilih menu (1-3): ");
    }

    public void menuhitung(String gol_temp, String lis_temp, double bia_temp) { //menu bagian hitung
        System.out.println("");
        System.out.println("=====================");
        System.out.println(gol_temp + " | " + lis_temp + " VA | " + "Rp. " + bia_temp + "/KWh");
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
        System.out.print("Pilih menu (1-7): ");
    }

    public void jenisBarang(String barang[]) { //menu jenis barang pada saat menambahkan barang
        System.out.println("");
        System.out.println("=====================");
        System.out.println("    Jenis Barang");
        System.out.println("=====================");
        System.out.println("1. Lampu");
        System.out.println("2. Rice Cooker");
        System.out.println("3. Kulkas");
        System.out.println("4. AC");
        System.out.println("5. Setrika");
        System.out.println("6. Mesin Cuci");
        System.out.println("7. Kipas Angin");
        System.out.println("=====================");
        System.out.print("Pilih menu (1-7): ");
    }

    public void daftarBarang(int pilih, int lampu[], int rcook[], int kulkas[], int AC[], int Setrika[], int mcuci[], int kangin[]) {
        if (pilih == 1) {
            System.out.println("Lampu : ");
            for (int i = 0; i < lampu.length; i++) {
                System.out.println((i + 1) + ". " + lampu[i] + " Watt");
            }
        } else if (pilih == 2) {
            System.out.println("Rice Cooker : ");
            for (int i = 0; i < rcook.length; i++) {
                System.out.println((i + 1) + ". " + rcook[i] + " Watt");
            }
        } else if (pilih == 3) {
            System.out.println("Kulkas : ");
            for (int i = 0; i < kulkas.length; i++) {
                System.out.println((i + 1) + ". " + kulkas[i] + " Watt");
            }
        } else if (pilih == 4) {
            System.out.println("AC : ");
            for (int i = 0; i < AC.length; i++) {
                System.out.println((i + 1) + ". " + AC[i] + " Watt");
            }
        } else if (pilih == 5) {
            System.out.println("Setrika : ");
            for (int i = 0; i < Setrika.length; i++) {
                System.out.println((i + 1) + ". " + Setrika[i] + " Watt");
            }
        } else if (pilih == 6) {
            System.out.println("Mesin Cuci : ");
            for (int i = 0; i < mcuci.length; i++) {
                System.out.println((i + 1) + ". " + mcuci[i] + " Watt");
            }
        } else if (pilih == 7) {
            System.out.println("Kipas Angin : ");
            for (int i = 0; i < kangin.length; i++) {
                System.out.println((i + 1) + ". " + kangin[i] + " Watt");
            }
        }
    }

    public void rumus(ArrayList Watt, ArrayList Jumlah, ArrayList Waktu){
        
    }
    
    public void contact() {
        System.out.println("Contact Us : "
                + "\n- e-mail  \t: "
                + "\n- WhatsApp\t:"
                + "\n- LINE    \t:");
        System.out.print("Back (Y/n)? ");
    }
}
