package dongkun2;


public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Dog("小黃", 3);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}
