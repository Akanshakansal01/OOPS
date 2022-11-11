package oops;

public class Person {

    int age;
    String name;
    static int count = 0;

    public void Intro_yourSelf() {

        System.out.println("My Name is " + this.name + " and age is " + this.age);

    }

    public void SayHey(String name) {

        System.out.println(new StringBuilder().append(name).append(" Say Hey ").append(this.name).toString());

    }

    public static void fun() {
        System.out.println("I am in Fun");
    }
    static {
        System.out.println("In Static ");
    }
}
