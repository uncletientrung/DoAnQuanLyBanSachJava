package DTO;
import java.util.Date;
import java.util.Objects;

public class KhachHangDTO {
    private int makh;
    private String hokh;
    private String tenkh;
    private Date ngaysinh;
    private String sdt;
    
    public KhachHangDTO() {}

    public KhachHangDTO(int makh, String hokh, String tenkh, Date ngaysinh, String sdt) {
        this.makh = makh;
        this.hokh = hokh;
        this.tenkh = tenkh;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
    }

    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public String getHokh() {
        return hokh;
    }

    public void setHokh(String hokh) {
        this.hokh = hokh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }


    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(makh, hokh, tenkh, ngaysinh, sdt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final KhachHangDTO other = (KhachHangDTO) obj;
        return this.makh == other.makh &&
               Objects.equals(this.hokh, other.hokh) &&
               Objects.equals(this.tenkh, other.tenkh) &&
               Objects.equals(this.ngaysinh, other.ngaysinh) &&
               Objects.equals(this.sdt, other.sdt);
    }

    @Override
    public String toString() {
        return "KhachHangDTO{" +
                "makh=" + makh +
                ", hoten='" + hokh + " " + tenkh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", ngaysinh=" + ngaysinh +
                '}';
    }
}
