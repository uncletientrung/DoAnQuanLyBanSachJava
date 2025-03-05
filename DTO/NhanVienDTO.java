import java.util.Date;
import java.util.Objects;

public class NhanVienDTO{
    private String manv;
    private String honv;
    private String tennv;
    private String gioitinh;
    private String sdt;
    private int trangthai;
    private Date ngaysinh;
    private Date ngayvaolam;

    public NhanVienDTO(){}

    public NhanVienDTO(String manv,String honv,String tennv, String gioitinh, String sdt, int trangthai, Date ngaysinh, Date ngayvaolam){
        this.manv=manv;
        this.honv=honv;
        this.tennv=tennv;
        this.gioitinh=gioitinh;
        this.sdt=sdt;
        this.trangthai=trangthai;
        this.ngaysinh=ngaysinh;
        this.ngayvaolam=ngayvaolam;
    }

    public String getManv() {
        return manv;
    }
    public String getHonv() {
        return honv;
    }
    public String getTennv() {
        return tennv;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public Date getNgaysinh() {
        return ngaysinh;
    }
    public Date getNgayvaolam() {
        return ngayvaolam;
    }
    public String getSdt() {
        return sdt;
    }
    public int getTrangthai() {
        return trangthai;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public void setHonv(String honv) {
        this.honv = honv;
    }
    public void setTennv(String tennv) {
        this.tennv = tennv;
    }
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public void setNgayvaolam(Date ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override 
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+Objects.hash(manv);
        result=prime*result+Objects.hash(honv);
        result=prime*result+Objects.hash(tennv);
        result=prime*result+Objects.hash(gioitinh);
        result=prime*result+Objects.hash(sdt);
        result=prime*result+trangthai;
        result=prime*result+Objects.hash(ngaysinh);
        result=prime*result+Objects.hash(ngayvaolam);
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
        final NhanVienDTO other=(NhanVienDTO) obj;
        if(this.manv !=other.manv){
            return false;
        }
        if(this.honv !=other.honv){
            return false;
        }
        if(this.tennv !=other.tennv){
            return false;
        }
        if(this.gioitinh !=other.gioitinh){
            return false;
        }
        if(this.sdt !=other.sdt){
            return false;
        }
        if(this.trangthai !=other.trangthai){
            return false;
        }
        if(this.ngaysinh !=other.ngaysinh){
            return false;
        }
        if(this.ngayvaolam !=other.ngayvaolam){
            return false;
        }
        return true;
    }

    @Override 
    public String toString(){
        return "NhanVienDTO{ " + "manv=" + manv + ", hoten=" + honv + " " + tennv + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh +", SDT="+sdt +", ngayvaolam= "+ngayvaolam+", trangthai="+trangthai+'}';
    }
    public int getColumnCount() {
        return getClass().getDeclaredFields().length;
    }
}