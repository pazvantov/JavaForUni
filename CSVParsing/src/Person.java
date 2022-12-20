public class Person {
    String name;
    int age;
    int IQ;

    public Person(String name, int age, int IQ) {
        this.name = name;
        this.age = age;
        this.IQ = IQ;
    }

    public void Print() {
        System.out.print(name + " " + age + " " + IQ + '\n');
    }
}
