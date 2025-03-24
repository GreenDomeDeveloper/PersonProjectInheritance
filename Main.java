import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person("Mary Jones", 17);
        Student three = new Student();
        Student four = new Student("Carl Smith",42,3.5);
        ArrayList<Person> village = new ArrayList<Person>();
        System.out.println("Welcome to the Person Project");

        System.out.println("Testing Persons");
        System.out.println("Person one: "+one.getName());
        System.out.println("Person two: "+two.getName());
        

        System.out.println("\nTesting Students");
        System.out.println("Student one: "+three.getName()+" "+three.getAge()+" "+three.getGPA());
        System.out.println("Student two: "+four.getName()+" "+four.getAge()+" "+four.getGPA());
        
        System.out.println("\nTesting toString()");
        System.out.println(two);
        System.out.println(four);

        System.out.println("\nFinal testing");
        Person five = new Student("Kim Turner",50,4.0);
        System.out.println(five);

        System.out.println("\nTesting ArrayList");
        village.add(one);
        village.add(two);
        village.add(three);
        village.add(four);
        village.add(five);

        for (int i=0; i<village.size(); i++){
            System.out.println("Villager #"+(i+1)+": "+village.get(i)+"\n");
        }
    }
}