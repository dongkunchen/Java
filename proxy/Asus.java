package tw.dongkun.proxy;


public class Asus implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("花了"+money+"三萬元買一台電腦");
        return "桌上電腦";
    }

    @Override
    public void show() {
        System.out.println("展示電腦");
    }
}
