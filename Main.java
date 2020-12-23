/*
 * Copyright (C) 2020 MYSTELTAiNN
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
 * @author MYSTELTAiNN
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String golongan[][][] = {
            {{"R-1/TR", "R-2/TR"},{"test"},{"help"}},
            {{"lel", "Test"}},
            {{"test","123"}}
        };
        String barang[] = {"Lampu", "Rice Cooker", "Kulkas", "AC", "e", "e"}; //[] pertama = tipe,
        System.out.printf(golongan[0][1][0]);
    }
}
