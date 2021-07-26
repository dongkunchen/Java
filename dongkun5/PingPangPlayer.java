package dongkun5;


public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球運動員學習如何發球和接球");
    }

    @Override
    public void study() {
        System.out.println("乒乓球運動員吃大白菜喝小米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球運動員說英語");
    }
}
