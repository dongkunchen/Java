package dongkun7;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        Socket s = new Socket(InetAddress.getByName("192.168.1.101"),10000);
        Socket s = new Socket("192.168.1.101",10000);

        //獲取輸出流
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我來了".getBytes());

        os.close();

    }
}
