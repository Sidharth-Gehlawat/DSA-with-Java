class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class JavaClassObject {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Sidharth";
        s1.age = 20;

        s1.display();
        System.out.println("Thanks for using my program");
    }
}
