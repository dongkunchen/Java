package dongkun7;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("192.168.1.101");
        InetAddress address = InetAddress.getByName("DESKTOP-031MTMM");

        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println("主機名: " + name);
        System.out.println("ip: " + ip);

    }
}
