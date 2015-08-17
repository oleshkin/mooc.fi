public class Person {
    private String name;
    private int age;
    
    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
    
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
    
    public void becomeOlder() {
        this.age++;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isAdult() {
        return this.age >= 18;
    }
    
    
}
