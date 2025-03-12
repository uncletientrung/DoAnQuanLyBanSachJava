package DTO;
import java.util.Date;
import java.util.Objects;

public class KhachHangDTO {
    private String makh;
    private String hokh;
    private String tenkh;
    private String gioitinh;
    private Date ngaysinh;
    private String sdt;
    
    public KhachHangDTO(){}
    public KhachHangDTO(String makh,String hokh, String tenkh,String gioitinh,Date ngaysinh,String sdt){
        this.makh=makh;
        this.hokh=hokh;
        this.tenkh=tenkh;
        this.gioitinh=gioitinh;
        this.ngaysinh=ngaysinh;
        this.sdt=sdt;
    }

    public String getMakh() {
        return makh;
    }
    public String getHokh() {
        return hokh;
    }
    public String getTenkh() {
        return tenkh;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public Date getNgaysinh() {
        return ngaysinh;
    }
    public String getSdt() {
        return sdt;
    }
    public void setMakh(String makh) {
        this.makh = makh;
    }
    public void setHokh(String hokh) {
        this.hokh = hokh;
    }
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    @Override
    public int hashCode(){
        final int prime=37;
        int result=3;
        result=prime*result+Objects.hashCode(makh);
        result=prime*result+Objects.hashCode(hokh);
        result=prime*result+Objects.hashCode(tenkh);
        result=prime*result+Objects.hashCode(sdt);
        result=prime*result+Objects.hashCode(ngaysinh);
        result=prime*result+Objects.hashCode(gioitinh);
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
        if(getClass()!=obj.getClass()){
                    return false;
                }
        final KhachHangDTO other=(KhachHangDTO) obj;
        if(this.makh!=other.makh){
            return false;
        }
        if(this.hokh!=other.hokh){
            return false;
        }
        if(this.tenkh!=other.tenkh){
            return false;
        }
        if(this.sdt!=other.sdt){
            return false;
        }
        if(this.ngaysinh!=other.ngaysinh){
            return false;
        }
        if(this.gioitinh!=other.gioitinh){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "KhachHangDTO{ makh="+makh+", hoten="+hokh+" "+tenkh+", gioitinh="+gioitinh+", sdt= "+sdt+", ngaysinh="+ngaysinh+"}";
    }

    
}