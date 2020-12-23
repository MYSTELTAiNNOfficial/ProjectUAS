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

        String golongan[][][] = {{{}}};
        String barang[] = {"Lampu", "Rice Cooker", "Kulkas", "AC", "Setrika", "Mesin Cuci"}; //[] pertama = tipe,
        do {
            gate.menu(); //panggil menu
            int menu = scan.nextInt();

            if (menu == 1) {
                do {
                    gate.menuhitung();
                    int menu1 = scan.nextInt();
                    if (menu1 == 1) {
                        /*
                        array golongan
                        harusnya pake 3D
                        bagian [] pertama diisi tipe
                        bagian [] kedua diisi tegangannya berapa
                        bagian [] ketiga diisi harga per kilowatt nya berapa
                        */
                    } else if (menu1 == 2) {
                        
                    }
                } while (true);
            }

        } while (true);
    }

    public void menu() { //menu awal
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
