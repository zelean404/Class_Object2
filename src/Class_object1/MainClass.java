package Class_object1;

public class MainClass 
{

    public static void main(String[] args) 
    {
        /*untuk bisa mengakses kelas hewan, burung dan ikan perlu membuat 
          object (instance of class)
        */
        
        //akses suara, tipe, dan usia dari class Hewan
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        //akses method dari class Burung dan Ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        //cara isi dari suara, tipe, dan usia 
        burung.setTipe("Kakatua");
        burung.setSuara("Kuk.. kuk.. kuk..");
        burung.setUsia(1);
        
        ikan.setTipe("Lumba-lumba");
        ikan.setSuara("Blurp.. blurp.. blurp..");
        ikan.setUsia(0);
        
        
        //caraambil  dari setter (Hewan, ikan, dan burung)
        System.out.println("Aku "+ burung.getTipe() + 
                " Suaraku " + burung.getSuara() + 
                " Usiaku "+ burung.getUsia() + " . ");
        b.terbang(); 
        
        System.out.println("");
        
        System.out.println("Aku "+ ikan.getTipe() + 
                " Suaraku " + ikan.getSuara() + 
                " Usiaku "+ ikan.getUsia() + " . ");
        i.berenang();
    }
    
}
