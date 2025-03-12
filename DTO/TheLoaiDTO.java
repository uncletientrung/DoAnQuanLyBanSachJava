package DTO;
import java.util.Objects;

public class TheLoaiDTO {
    private String matheloai;
    private String tentheloai;
    public TheLoaiDTO(){}
    public TheLoaiDTO(String matheloai,String tentheloai){
        this.matheloai=matheloai;
        this.tentheloai=tentheloai;
    }
    public String getMatheloai() {
        return matheloai;
    }
    public String getTentheloai() {
        return tentheloai;
    }
    public void setMatheloai(String matheloai) {
        this.matheloai = matheloai;
    }
    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }
    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=prime*result+Objects.hash(matheloai);
        result=prime*result+Objects.hash(tentheloai);
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
        final TheLoaiDTO other=(TheLoaiDTO) obj;
        if(this.matheloai!=other.matheloai){
            return false;
        }
        if(this.tentheloai!=other.tentheloai){
            return false;
        }
        return true;
    }

    @Override 
    public String toString(){
        return "TheoLoaiDTO{ "+"matheloai="+matheloai+", tentheloai="+tentheloai+"}";
    }
}
