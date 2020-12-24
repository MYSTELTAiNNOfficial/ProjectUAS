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
 */

/**
 *
 * @author Syamsuddin & Averill
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main gate = new Main(); //penghubung method
        Scanner scan = new Scanner(System.in);

        String golongan[][] = new String[7][3];
        golongan[0][0] = "R-1/TR";
        golongan[0][1] = "450";
        golongan[0][2] = "165";
        golongan[1][0] = "R-1/TR";
        golongan[1][1] = "900";
        golongan[1][2] = "274";
        golongan[2][0] = "R-1M/TR";
        golongan[2][1] = "900";
        golongan[2][2] = "1352";
        golongan[3][0] = "R-1/TR";
        golongan[3][1] = "1300";
        golongan[3][2] = "1444,70";
        golongan[4][0] = "R-1/TR";
        golongan[4][1] = "2200";
        golongan[4][2] = "1444,70";
        golongan[5][0] = "R-2/TR";
        golongan[5][1] = "5500";
        golongan[5][2] = "1444,70";
        golongan[6][0] = "R-3/TR";
        golongan[6][1] = ">5501";
        golongan[6][2] = "1444,70";
        String barang[] = {"Lampu", "Rice Cooker", "Kulkas", "AC", "Setrika", "Mesin Cuci"}; //[] pertama = tipe,
        do {
            gate.mainmenu(); //panggil menu
            int menu = scan.nextInt();

            if (menu == 1) {
                do {
                    gate.menuhitung();
                    int menu1 = scan.nextInt();
                    if (menu1 == 1) {
                        /*
                        array golongan
                        harusnya pake 2D
                        bagian [] pertama diisi nomor
                        bagian [] kedua diisi tipe [0], tegangannya berapa [1], dan
                                              harga per kilowatt nya berapa [2]
                         */
                    } else if (menu1 == 2) {

                    }
                } while (true);
            } else if (menu == 2) {

            } else if (menu == 3) {
                System.out.println("Bye-bye");
                break;
            }
        } while (true);
    }

    public void mainmenu() { //menu awal
        System.out.println("Penghitung biaya listrik (By Syamsuddin & Averill)");
        System.out.println("");
        System.out.println("================");
        System.out.println("Menu:");
        System.out.println("1. Hitung");
        System.out.println("2. Bantuan");
        System.out.println("3. Keluar");
        System.out.println("================");
        System.out.print("Pilih menu: ");
    }

    public void menuhitung() { //menu bagian hitung
        System.out.println("");
        System.out.println("====================");
        System.out.println("    HITUNG BIAYA    ");
        System.out.println("====================");
        System.out.println("1. Pilih Kategori Listrik");
        System.out.println("2. Tambahkan barang");
        System.out.println("3. Update data barang");
        System.out.println("4. Hapus barang");
        System.out.println("5. Hitung total biaya");
        System.out.println("6. Exit");
        System.out.println("====================");
        System.out.print("Pilih menu: ");
    }
}
