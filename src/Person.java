public class Person {
    
    private String name;
    private int age;
    private int weight;
    private int height;
   
    
    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    }
    
    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex();
    }
    
    public void becomeOlder() {
        this.age++;
    }
    
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    
    public void setWeight(int newWeight) {
        this.weight = newWeight;
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
    
    public double bodyMassIndex() {
        double heightDividedByHundred = this.height / 100;
        return this.weight / (heightDividedByHundred * heightDividedByHundred);
    }
    
    
}
