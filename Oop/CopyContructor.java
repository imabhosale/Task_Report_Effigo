package Oop;
//workbook7.4
public class CopyContructor {
    private String nameOfPerson;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber; 

    public CopyContructor(String nameOfPerson, String nationlity,String dateOfBirth, int seatNumber){
        this.nameOfPerson=nameOfPerson;
        this.nationality=nationlity;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;
    }

    //copy constructor
    public CopyContructor(CopyContructor source){
        this.nameOfPerson=source.nameOfPerson;
        this.dateOfBirth=source.dateOfBirth;
        this.nationality=source.nationality;
        this.seatNumber=source.seatNumber;
    }


  
    

    /**
     * @return String return the nameOfPerson
     */
    public String getNameOfPerson() {
        return nameOfPerson;
    }

    /**
     * @param nameOfPerson the nameOfPerson to set
     */
    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    /**
     * @return String return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return String return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return String return the seatNumber
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * @param seatNumber the seatNumber to set
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public static void main(String[] args) {
        CopyContructor c1=new CopyContructor("Rayan Slim", "Canadian", "01/01/1111", 5);

        System.out.println("Name: " + c1.nameOfPerson + "\n" +
        "Nationality: " + c1.getNationality() + "\n" + 
        "Date of Birth: " + c1.getDateOfBirth() + "\n" + 
        "Seat Number: " + c1.getSeatNumber() + "\n");

        CopyContructor twin=new CopyContructor(c1);
        //change the values in newly created object and see whether its change in original or not
        twin.setNameOfPerson("Abhishek Bhosale");

        System.out.println("Name: " + c1.nameOfPerson + "\n" +
        "Nationality: " + c1.getNationality() + "\n" + 
        "Date of Birth: " + c1.getDateOfBirth() + "\n" + 
        "Seat Number: " + c1.getSeatNumber() + "\n");

        System.out.println("Name: " + twin.nameOfPerson + "\n" +
        "Nationality: " + twin.getNationality() + "\n" + 
        "Date of Birth: " + twin.getDateOfBirth() + "\n" + 
        "Seat Number: " + twin.getSeatNumber() + "\n");
    }

}
