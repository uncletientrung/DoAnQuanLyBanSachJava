import java.util.Objects;

public class TacGiaDTO {
    private String matacgia;
    private String hotentacgia;
    
    public TacGiaDTO(){}
    public TacGiaDTO(String matacgia,String hotentacgia){
        this.matacgia=matacgia;
        this.hotentacgia=hotentacgia;
    }
    public String getMatacgia() {
        return matacgia;
    }
    public String getHotentacgia() {
        return hotentacgia;
    }
    public void setMatacgia(String matacgia) {
        this.matacgia = matacgia;
    }
    public void setHotentacgia(String hotentacgia) {
        this.hotentacgia = hotentacgia;
    }
    @Override
    public int hashCode() {
        final int prime=17;
        int result=1;
        result=prime*result+Objects.hashCode(matacgia);
        result=prime*result+Objects.hashCode(hotentacgia);
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
        final TacGiaDTO other=(TacGiaDTO) obj;
        if(this.matacgia!=other.matacgia){
            return false;
        }
        if(this.hotentacgia!=other.hotentacgia){
            return false;
        }
        return true;
    }

    @Override 
    public String toString(){
        return "TacGiaDTO{ "+"matacgia="+matacgia+", hotentacgia="+hotentacgia+"}";
    }
}
