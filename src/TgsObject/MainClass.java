package TgsObject;
import java.io.*;

public class MainClass {

    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        Undika dika = new Undika();
        Mahasiswa mhs = new Mahasiswa();
        Karyawan kry = new Karyawan();
        try 
        {
            do{
                System.out.println("--- Pengecekan SPP dan Gaji Civitas Undika ---");
                System.out.println("-- Menu 1: Cek SPP Mahasiswa --");
                System.out.println("-- Menu 2: Cek Gaji Karyawan --");
                System.out.println("-- Menu 3: Keluar Aplikasi --");
                System.out.print("-- Silahkan Tentukan Pilihan Menu : ");
                int pilih = Integer.parseInt(br.readLine());
                
                switch(pilih){
                    case 1: //Menu 1: Cek SPP Mahasiswa
                        System.out.print("Input NIM : ");
                        mhs.setNim(br.readLine());
                        
                        System.out.print("Input Nama : ");
                        dika.setNama(br.readLine());
                        
                        System.out.print("Input Prodi : ");
                        mhs.setProdi(br.readLine());
                        
                        System.out.print("Input Angkatan : ");
                        mhs.setAngkatan(Integer.parseInt(br.readLine()));
                        
                        System.out.print("Input Semester : ");
                        mhs.setSemester(Integer.parseInt(br.readLine()));
                        
                        System.out.print("Input Alamat : ");
                        dika.setAlamat(br.readLine());
                        System.out.println("-------------------------------------");
                        System.out.println("");
                        
                        System.out.println("NIM : " + mhs.getNim());
                        System.out.println("Nama : " + dika.getNama());
                        System.out.println("Prodi : " + mhs.getProdi());
                        System.out.println("Angkatan : " + mhs.getAngkatan());
                        System.out.println("Semester: " + mhs.getSemester());
                        System.out.println("Alamat : " + dika.getAlamat());
                        System.out.println("SPP : " + mhs.getSpp());
                        System.out.println("Bayar SPP Sebesar :" + mhs.getBayar_spp_semester());
                        System.out.println("");
                    break;
                    
                    case 2: //Menu 2: Cek Gaji Karyawan
                        System.out.print("Input NIK : ");
                        kry.setNik(br.readLine());
                        
                        System.out.print("Input Nama : ");
                        dika.setNama(br.readLine());
                        
                        System.out.print("Input Bagian : ");
                        kry.setBagian(br.readLine());
                        
                        System.out.print("Input Kehadiran : ");
                        kry.setKehadiran(Integer.parseInt(br.readLine()));
                        
                        System.out.print("Input Gaji/hari : ");
                        kry.setGaji_per_hari(Integer.parseInt(br.readLine()));
                        
                        System.out.print("Input Alamat : ");
                        dika.setAlamat(br.readLine());
                        System.out.println("-------------------------------------");
                        System.out.println("");
                        
                        System.out.println("NIK : " + kry.getNik());
                        System.out.println("Nama : " + dika.getNama());
                        System.out.println("Alamat : " + dika.getAlamat());
                        System.out.println("Bagian : " + kry.getBagian());
                        System.out.println("Kehadiran : " + kry.getKehadiran());
                        System.out.println("Gaji/hari : " + kry.getGaji_per_hari());
                        System.out.println("Total Gaji : " + kry.getTotalGaji());
                    break;
                    
                    case 3:
                        System.exit(0);
                    break;
                }
            }while(true);
            
        } catch (Exception e) {
            System.out.println("Inputan Tidak Boleh Huruf Harus Angka !");
        }
    }
    
}
