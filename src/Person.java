public class Person {
    static int popular = 0;
    public final String gender;
    public final int age;

    public Person(String gender, int age) {
        this.gender = gender;
        this.age = age;
        popular++;
    }
    public static int getPopular() {
        return popular;
    }

    public static int Catastrophe() {
        do {
            popular--;
        } while (popular != 0);
        return popular;
    }
}

