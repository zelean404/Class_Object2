package TgsObject;

public class Mahasiswa {
    
    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp_semester;

    //setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    
    //getter
    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public int getSemester() {
        return semester;
    }

    
    //custom
    public int getSpp() {
        if(getAngkatan() > 17){
            spp = 15000000;
        }
        else if(getAngkatan() < 17){
            spp = 12000000;
        }
        return spp;
    }
    
    public int getBayar_spp_semester() {
        bayar_spp_semester = getSpp() * getSemester();
        return bayar_spp_semester;
    }
    
    
    
    
}
