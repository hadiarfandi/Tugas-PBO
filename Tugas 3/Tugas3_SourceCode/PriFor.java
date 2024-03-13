/*
Nim : 13020220150
Nama : Arfandi Hadi Kusuma
Hari/Tanggal : Rabu, 13 Maret 2024
Waktu Pengerjaan : 00:27
*/

import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {

   /**
    * @param args
    */
   public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	int i,N; 
	Scanner masukan=new Scanner(System.in);
	/* Program */
	/* program */

	System.out.print ("Baca N, print 1 s/d N "); 
	System.out.print ("N = ");

	N=masukan.nextInt();

	for (i = 1; i <= N; i++){
	System.out.println (i); };
	System.out.println ("Akhir program \n"); 
   }
}