package DTO;
import java.util.Objects;
public class NhaXuatBanDTO {
    private String manxb;
    private String tennxb;
    private String diachinxb;
    private String sdt;
    private String email;

    public NhaXuatBanDTO(){}
    public NhaXuatBanDTO(String manxb,String tennxb,String diachinxb, String sdt, String email){
        this.manxb=manxb;
        this.tennxb=tennxb;
        this.diachinxb=diachinxb;
        this.sdt=sdt;
        this.email=email;
    }
    public String getManxb() {
        return manxb;
    }
    public String getTennxb() {
        return tennxb;
    }
    public String getDiachinxb() {
        return diachinxb;
    }
    public String getEmail() {
        return email;
    }
    public String getSdt() {
        return sdt;
    }
    public void setManxb(String manxb) {
        this.manxb = manxb;
    }
    public void setDiachinxb(String diachinxb) {
        this.diachinxb = diachinxb;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }
    @Override
    public int hashCode() {
        final int prime=53;
        int result=3;
        result=prime*result+Objects.hashCode(manxb);
        result=prime*result+Objects.hashCode(tennxb);
        result=prime*result+Objects.hashCode(sdt);
        result=prime*result+Objects.hashCode(email);
        result=prime*result+Objects.hashCode(diachinxb);
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
        final NhaXuatBanDTO other=(NhaXuatBanDTO) obj;
        if(this.manxb!=other.manxb){
            return false;
        }
        if(this.tennxb!=other.tennxb){
            return false;
        }
        if(this.sdt!=other.sdt){
            return false;
        }
        if(this.diachinxb!=other.diachinxb){
            return false;
        }
        if(this.email!=other.email){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "NhanXuatBanDTO{ manxb="+manxb+", tennxb="+tennxb+", sdt="+sdt+", diachinxb="+diachinxb+", email="+email +"}";
    }
}
