package dongkun5;


public class BasketballPlayer extends Player{

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("籃球運動員學習如何運球和投籃");
    }

    @Override
    public void study() {
        System.out.println("籃球運動員吃牛肉喝牛奶");
    }
}
