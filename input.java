
package uts_oop;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 20103319_MarhainiHidayati
 */
public class input {
    public void input(){
    ArrayList<String> masuk= new ArrayList<String>();
        Scanner input = new Scanner(System.in);
       int n = 0;

        do{
        System.out.println("\n\n==============Masukan Data Pengunjung==============");
        System.out.println("Tampilkan Data Pengunjung");
        System.out.println("Isi Data Pengunjung");
        System.out.println("Keluar");
        System.out.println("#####################################################");
        System.out.print("Pilih menu :");
        n = input.nextInt();


            if(n==1){
            System.out.println("Isi Data Pengunjung Kebun Binatang");
            System.out.print("\n\nMasukan Nama    :");
            String nama=input.next();
            masuk.add(nama);
            }

            else if (n==2){
            System.out.println("Isi Alamat pengunjung");
            System.out.print("\n\nMasukan Alamat   :");
            String alamat=input.next();
            masuk.add(alamat);
            }

            else if (n==3){
            System.out.println("----------------------");
            System.out.println("Data pengunjung\n"+masuk);
            System.out.println("Jumlah Pengunjung :"+masuk.size());

            System.out.println("=======Terima Kasih======");
            }

            else if (n==4){
            System.out.println("\n\nOpsi Tidak Terdaftar silahkan pilih 1,2,3");
            }

       }while(n!=3);    
}
}
