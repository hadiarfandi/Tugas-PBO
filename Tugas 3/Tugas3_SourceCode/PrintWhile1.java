/*
Nim : 13020220150
Nama : Arfandi Hadi Kusuma
Hari/Tanggal : Selasa, 13 Maret 2024
Waktu Pengerjaan : 12:22
*/


import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {

  /**
   * @param args
   */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus : */
	int N;
	int i = 1;
	Scanner masukan=new Scanner(System.in);
	/* Program */

	System.out.print ("Nilai N >0 = "); 
	N = masukan.nextInt();
	System.out.print ("Print i dengan WHILE (ringkas): \n"); 
	while (i <= N){
		System.out.println (i++); 
	} /* (i > N)*/
    }
}