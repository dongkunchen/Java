package dongkun5;


public class BasketballCoach extends Coach{

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("籃球教練教運球和投籃");
    }

    @Override
    public void eat() {
        System.out.println("籃球教練吃羊肉喝羊奶");
    }
}
