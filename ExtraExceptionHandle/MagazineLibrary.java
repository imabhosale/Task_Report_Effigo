package ExtraExceptionHandle;

import java.util.ArrayList;

public class MagazineLibrary {
     private ArrayList<Magazine> magazines;
     public MagazineLibrary(){
        this.magazines=new ArrayList<>();
     }

    public Magazine getMagazine(int index){
        Magazine copy=new Magazine(magazines.get(index));
        return copy;
    }


    public void setMagazine(Magazine magazine,int index){
        Magazine copy= new Magazine(magazine);
        this.magazines.set(index, copy);
    }

    public void addMagazine(Magazine newMagazine){
        Magazine newcopy=new Magazine(newMagazine);
        this.magazines.add(newcopy);
    }
}
