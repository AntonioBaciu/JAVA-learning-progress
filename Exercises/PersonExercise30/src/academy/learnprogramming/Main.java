package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person();
	    person.setFirstName("Antonio");
	    person.setLastName("Baciu");
	    person.setAge(-24);
        System.out.println(person.getAge());

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());
    }
}
