package com.dyk.test.lambda;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @Title: ImageBase64Utils
 * @Package com.dyk.test.lambda
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/22 17:07
 */
public class ImageBase64Utils {

    public static void main(String[] args) {
        String base64ByImgUrl = getBase64ByImgUrl("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=java%20%E6%80%8E%E4%B9%88%E8%8E%B7%E5%8F%96%E8%BF%9C%E7%A8%8B%E5%9B%BE%E7%89%87%E7%9A%84base64&step_word=&hs=0&pn=1&spn=0&di=7214885350303334401&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1390118846%2C1789148661&os=1530051682%2C1281746274&simid=1390118846%2C1789148661&adpicid=0&lpn=0&ln=1132&fr=&fmq=1684746710745_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fimg-blog.csdnimg.cn%2Fimg_convert%2Fa35734ec19a86fb1d17ce5cb3966fb51.png&fromurl=ippr_z2C%24qAzdH3FAzdH3Fks52_z%26e3Bvf1g_z%26e3BgjpAzdH3Fs75fp71jgpAzdH3Fw6ptvsjAzdH3F1jpwtsfAzdH3F88n0bmbll&gsm=1e&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&dyTabStr=MCw0LDEsNiw1LDMsNyw4LDIsOQ%3D%3D");
        System.out.println(base64ByImgUrl);
    }
    public static String getBase64ByImgUrl(String url){
        String suffix = url.substring(url.lastIndexOf(".") + 1);
        try {
            URL urls = new URL(url);
            ByteArrayOutputStream  baos = new ByteArrayOutputStream();
            Image image = Toolkit.getDefaultToolkit().getImage(urls);
            BufferedImage  biOut = toBufferedImage(image);
            ImageIO.write(biOut, suffix, baos);
            String base64Str = Base64Util.encode(baos.toByteArray());
            return base64Str;
        } catch (Exception e) {
            return "";
        }

    }

    public static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }
        // This code ensures that all the pixels in the image are loaded
        image = new ImageIcon(image).getImage();
        BufferedImage bimage = null;
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        try {
            int transparency = Transparency.OPAQUE;
            GraphicsDevice gs = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gs.getDefaultConfiguration();
            bimage = gc.createCompatibleImage(image.getWidth(null),
                    image.getHeight(null), transparency);
        } catch (HeadlessException e) {
            // The system does not have a screen
        }
        if (bimage == null) {
            // Create a buffered image using the default color model
            int type = BufferedImage.TYPE_INT_RGB;
            bimage = new BufferedImage(image.getWidth(null),
                    image.getHeight(null), type);
        }
        // Copy image to buffered image
        Graphics g = bimage.createGraphics();
        // Paint the image onto the buffered image
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return bimage;
    }
    /**
     * 通过图片的url获取图片的base64字符串
     * @param imgUrl    图片url
     * @return    返回图片base64的字符串
     */
    public static String image2Base64(String imgUrl) {

        URL url = null;

        InputStream is = null;

        ByteArrayOutputStream outStream = null;

        HttpURLConnection httpUrl = null;

        try{

            url = new URL(imgUrl);

            httpUrl = (HttpURLConnection) url.openConnection();

            httpUrl.connect();

            httpUrl.getInputStream();

            is = httpUrl.getInputStream();



            outStream = new ByteArrayOutputStream();

            //创建一个Buffer字符串

            byte[] buffer = new byte[1024];

            //每次读取的字符串长度，如果为-1，代表全部读取完毕

            int len = 0;

            //使用一个输入流从buffer里把数据读取出来

            while( (len=is.read(buffer)) != -1 ){

                //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度

                outStream.write(buffer, 0, len);

            }

            // 对字节数组Base64编码

            return Base64Util.encode(outStream.toByteArray());

        }catch (Exception e) {

            e.printStackTrace();

        }

        finally{

            if(is != null)

            {

                try {

                    is.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

            if(outStream != null)

            {

                try {

                    outStream.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

            if(httpUrl != null)

            {

                httpUrl.disconnect();

            }

        }

        return imgUrl;

    }
}
