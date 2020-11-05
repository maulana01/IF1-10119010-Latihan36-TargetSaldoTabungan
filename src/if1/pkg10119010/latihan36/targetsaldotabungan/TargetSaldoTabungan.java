/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan36.targetsaldotabungan;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan target
 *                     saldo tabungan dengan konsep OOP
 */
public class TargetSaldoTabungan {
    
    private static Double bunga, jmlBunga;
    private static int targetSaldo, lama, saldoAwal;
    
    private static double hitungBunga(double bunga, int saldo) {
        jmlBunga = (bunga / 100) * saldo;
        return jmlBunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo, int targetSaldo) {
        lama = 1;
        while(saldo < targetSaldo) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+lama+" Rp. %,d%n", saldo);
            lama++;
        }
    }
    
}
