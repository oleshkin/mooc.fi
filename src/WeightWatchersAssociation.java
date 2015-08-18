
import java.util.ArrayList;

public class WeightWatchersAssociation {
    
    private double lowestWeightIndex;
    private String name;
    private ArrayList<Person> members;
    
    public WeightWatchersAssociation(String name, double indexLimit) {
        this.lowestWeightIndex = indexLimit;
        this.name = name;
        this.members = new ArrayList<Person>();
    }
    
    public WeightWatchersAssociation(double indexLimit) {
        this(null, indexLimit);
    }
    
    public Person personWithHighestWeightIndex() {
        // if members list is empty, return null reference
        if (this.members.isEmpty()) {
            return null;
        }
        
        Person heaviestSoFar = this.members.get(0);
        
        for (Person person : this.members) {
            if (person.bodyMassIndex() > heaviestSoFar.bodyMassIndex()) {
                heaviestSoFar = person;
            }
        }
        return heaviestSoFar;
    }
    
    public boolean isAccepted(Person person) {
        if (person.bodyMassIndex() < this.lowestWeightIndex) {
            return false;
        }
        return true;
    }
    
    public void addAsMember(Person person) {
        if (!isAccepted(person)) {
            return;
        }
        
        this.members.add(person);
    }
    
    public String toString() {
        String membersAsString = "";

        for ( Person member : this.members ) {
            membersAsString += "  " + member.getName() + "\n";
        }

        return "Weightwatchers association " + this.name + " members: \n" + membersAsString;
    }
    
}
