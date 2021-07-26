package dongkun4;


public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        j = new Dog();
        j.jump();

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        a = new Cat("花花", 5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Dog("小黃", 3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.jump();
        c.eat();
    }
}
