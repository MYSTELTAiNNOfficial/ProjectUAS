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
        String barang[] = {"Lampu", "Rice Cooker", "Kulkas", "AC", "Setrika", "Mesin Cuci"}; //[] pertama = tipe,
        
        gate.menu(); //panggil menu
        menu = scan.nextInt();
    }
    
    public void menu (){ //menu awal
        System.out.println("Penghitung biaya listrik (By Syamsuddin & Averill)");
        System.out.println("");
        System.out.println("===============");
        System.out.println("Menu:");
        System.out.println("1. Hitung");
        System.out.println("2. Bantuan");
        System.out.println("3. Keluar");
        System.out.println("================");
        System.out.print("Pilih menu:");
    }
}
