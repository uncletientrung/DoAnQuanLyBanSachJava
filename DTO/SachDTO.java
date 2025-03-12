package DTO;
import java.util.Objects;

public class SachDTO {
    private String masach;
    private String tensach;
    private String manxb;
    private String matacgia;
    private String matheloai;
    private int soluongton;
    private int namxuatban;
    private double dongia;
    public SachDTO(){}
    public SachDTO(String masach,String tenSach,String manxb,String matacgia,String matheloai,int soluongton,int namxuatban,Double dongia){
        this.masach=masach;
        this.tensach=tenSach;
        this.manxb=manxb;
        this.matheloai=matheloai;
        this.soluongton=soluongton;
        this.namxuatban=namxuatban;
        this.matacgia=matacgia;
        this.dongia=dongia;
    }
    public String getMasach() {
        return masach;
    }
    public String getTensach() {
        return tensach;
    }
    public String getManxb() {
        return manxb;
    }
    public double getDongia() {
        return dongia;
    }
    public String getMatacgia() {
        return matacgia;
    }
    public String getMatheloai() {
        return matheloai;
    }
    public int getNamxuatban() {
        return namxuatban;
    }
    public int getSoluongton() {
        return soluongton;
    }
    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public void setManxb(String manxb) {
        this.manxb = manxb;
    }
    public void setMasach(String masach) {
        this.masach = masach;
    }
    public void setMatacgia(String matacgia) {
        this.matacgia = matacgia;
    }
    public void setMatheloai(String matheloai) {
        this.matheloai = matheloai;
    }
    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }
    public void setSoluongton(int soluongton) {
        this.soluongton = soluongton;
    }
    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    @Override
    public int hashCode() {
        final int prime=57;
        int result=3;
        result=prime*result+Objects.hashCode(masach);
        result=prime*result+Objects.hashCode(tensach);
        result=prime*result+Objects.hashCode(matacgia);
        result=prime*result+Objects.hashCode(manxb);
        result=prime*result+Objects.hashCode(matheloai);
        result=prime*result+this.soluongton;
        result=prime*result+this.namxuatban;
        result=prime*result+Double.hashCode(dongia);
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass() !=obj.getClass()){
            return false;
        }
        final SachDTO other=(SachDTO) obj;
        if(this.masach!=other.masach){
            return false;
        }
        if(this.tensach!=other.tensach){
            return false;
        }
        if(this.manxb!=other.manxb){
            return false;
        }
        if(this.matacgia!=other.matacgia){
            return false;
        }
        if(this.matheloai!=other.matheloai){
            return false;
        }
        if(this.soluongton!=other.soluongton){
            return false;
        }
        if(this.dongia!=other.dongia){
            return false;
        }
        if(this.namxuatban!=other.namxuatban){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "SachDTO { masach="+masach+", tensach="+tensach+", matacgia="+matacgia+", manxb="+manxb+", namxuatban="+namxuatban+", matheloai="+matheloai+
                        ", soluongton="+soluongton+", dongia="+dongia+"}";
    }


}
