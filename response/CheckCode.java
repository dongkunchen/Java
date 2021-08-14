package tw.dongkun.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @auther dongkun-chen
 * 字節流應用
 */

@WebServlet("/checkCode")
public class CheckCode extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int width = 100;
        int height = 50;

        //1.創建一個對象,在內存中圖片(驗證碼圖片對象)
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //2.美化圖片(默認黑色100X50矩形)
        //2.1填充背景色
        Graphics g = image.getGraphics();//創畫筆對象
        g.setColor(Color.GRAY);
        g.fillRect(0,0,width,height);
        //2.2畫邊框
        g.setColor(Color.WHITE);
        g.drawRect(0,0,width-1,height-1);
        //2.3寫驗證碼
        //也可去除0 1跟小寫o l避免混淆
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMOPQRSTUBWXYZ";
        Random ran = new Random();
        //設置顏色字體大小
        g.setColor(Color.ORANGE);
        g.setFont(new Font("宋體",Font.PLAIN,20));
        for (int i = 1; i <= 6; i++) {
            //生成隨機
            int index = ran.nextInt(str.length());
            //獲取隨機字符
            char ch = str.charAt(index);
            g.drawString(ch+" ",width/7*i,height/2);
        }
        //2.4畫干擾線
        g.setColor(Color.CYAN);

        //隨機生成座標點
        for (int i = 0; i < 10; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            g.drawLine(x1,y1,x2,y2);
        }

        //3.將圖片輸出到頁面展示
        ImageIO.write(image,"jpg",resp.getOutputStream());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
