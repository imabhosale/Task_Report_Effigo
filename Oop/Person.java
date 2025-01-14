package Oop;

import java.util.Arrays;

public class Person {
    private String name;
    private String [] passport;
    private String nationality;
    private String dOB;
    private int seatNo;

    public String getName() {
        return this.name;
    }

    public void setPassport(String name,String nationality,String dOB) {
        this.name=name;
        this.nationality=nationality;
        this.dOB=dOB;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String[] getPassport() {
       return Arrays.copyOf(passport,passport.length);
       
    }

    public void setPassport() {
        String str[]=new String[]{name,nationality,dOB};
        this.passport=Arrays.copyOf(str,str.length);
    }
    

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDOB() {
        return this.dOB;
    }

    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    public int getSeatNo() {
        return this.seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public Person(String name,String nationality,String dOB,int seatNo){
        this.name=name;
        this.nationality=nationality;
        this.dOB=dOB;
        this.seatNo=seatNo;
        this.passport=new String[3];
    }

    public boolean applyPassport(){
        int n  =(int) (Math.random()*2);
        return n==1; 
    }
  
}
