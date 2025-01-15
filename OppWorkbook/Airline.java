package OppWorkbook;
public class Airline  { 
    Person[] people; //array that stores Person objects...

    public Airline() {
       this.people = new Person[11];
    }

    public Person getPerson(int index){
        Person copy=new Person(people[index]);
        return copy;
    }

    public void setPerson(Person person){
        int index = person.getSeatNumber() - 1; // Convert seat number to zero-based index
    if (index >= 0 && index < this.people.length) { // Ensure index is valid
        this.people[index] = new Person(person); // Assign the deep copy to the specific seat
    } else {
        throw new IllegalArgumentException("Invalid seat number: " + person.getSeatNumber());
    }
    }
    
}
