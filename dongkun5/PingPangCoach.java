package dongkun5;


public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教練教發球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教練吃小白菜喝大米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教練說英語");
    }
}
