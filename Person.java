public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(){ //default constructor
        name = "John Doe";
        age = 42;
    }

    public Person(String newName, int newAge){ // parameterized constructor
        name = newName;
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void hasBirthday(){
        age++;
    }

    @Override
    public String toString(){
        return "My name is "+name+" and I am "+age+ " years old.";
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}
