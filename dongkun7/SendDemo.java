package dongkun7;

import java.io.IOException;
import java.net.*;


public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "hello,udp,我來了".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.1.101");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.101"),10086);

        ds.send(dp);

        ds.close();
    }
}
