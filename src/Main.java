public class Main {
    public static void main(String[] args) {

        Person person = new Person("Male", 18);
        Person person2 = new Person("Female", 34);
        Person person3 = new Person("Female", 41);

        System.out.println(Person.getPopular());

        Person person4 = new Person("Male", 1);

        System.out.println(Person.getPopular());

        System.out.println(Person.Catastrophe());
    }
}