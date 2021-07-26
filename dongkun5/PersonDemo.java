package dongkun5;


public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王五");
        ppp.setAge(30);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("---------");

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("趙六");
        bp.setAge(20);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();

    }
}
