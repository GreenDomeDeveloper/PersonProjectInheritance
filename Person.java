public class Person {
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

}
