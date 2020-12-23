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

        int menu;
        String golongan[][][] = {{{}}};
        String daftar[] = {"Lampu", "Rice Cooker", "Kulkas", "AC", "Setrika", "Mesin Cuci"}; //[] pertama = tipe,

        gate.menu(); //panggil menu
        menu = scan.nextInt();
        switch (menu) {
            case 1:
                gate.hitung(daftar);

        }

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

    public void hitung(String[] daftar) {
        Scanner scan = new Scanner(System.in);
        int pilih, bulan;
        String ulang = "";
        double dataBarang [][] = {{}};     //Array ini untuk mengisi data jumlah dan lama pemakaian   
        
        do {
            System.out.println("===============");
            for (int i = 0; i < daftar.length; i++) {
                System.out.println(i + ". " + daftar[i]);
            }
            System.out.println("===============");
            System.out.print("Pilih Barang : ");
            pilih = scan.nextInt();
            switch (pilih){
                case 1:
                    
            }
            System.out.print("Pilih lagi? (Y/n)");
            ulang = scan.next() + scan.nextLine();
            if (!ulang.equalsIgnoreCase("Y")) break;
        }while (ulang.equalsIgnoreCase("Y"));
        
        
        System.out.println("================");
        System.out.println("1. Bulanan");
        System.out.println("2. Tahunan");
        System.out.println("================");
        System.out.print("Pilih : ");
        pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("==========");
                System.out.print("Masukkan Bulan (1-12): ");
                bulan = scan.nextInt();
                if (bulan == 2) {

                } else if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) {

                } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {

                }
        }
    }
    
    public double dayaRumah(){
        double biaya;
        System.out.println("======================");
        System.out.println("Pilih Daya Rumah : ");
        System.out.println("1. 0 – 450 VA"
                + "\n2. 451 – 900 VA (Subsidi)"
                + "\n3. 451 – 900 VA (Non-Subsidi)"
                + "\n4. 901 - 2200 VA");
        System.out.println("======================");
        System.out.print("Pilih : ");
        
        
        
        return biaya;
    }
    
}
