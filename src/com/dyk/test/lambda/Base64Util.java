package com.dyk.test.lambda;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Title: Base64Util
 * @Package com.dyk.test.lambda
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/22 17:08
 */
public class Base64Util {
    public static byte[] decode(String base64Str){
                 byte[] b = null;
                 BASE64Decoder decoder = new BASE64Decoder();
                 try {
                         b = decoder.decodeBuffer(replaceEnter(base64Str));
                     } catch (IOException e) {
                         e.printStackTrace();
                    }
                return b;
    }

    /**
     30      * 图片转字符串
     31      * @param image
     32      * @return
     33      */
     public static String encode(byte[] image){
         BASE64Encoder decoder = new BASE64Encoder();
         return replaceEnter(decoder.encode(image));
     }

     public static String encode(String uri){
         BASE64Encoder encoder = new BASE64Encoder();
         return replaceEnter(encoder.encode(uri.getBytes()));
     }


    /**
     45      *
     46      * @path    图片路径
     47      * @return
     48      */

    public static byte[] imageTobyte(String path){
                 byte[] data = null;
                 FileImageInputStream input = null;
                 try {
                         input = new FileImageInputStream(new File(path));
                         ByteArrayOutputStream output = new ByteArrayOutputStream();
                         byte[] buf = new byte[1024];
                         int numBytesRead = 0;
                         while((numBytesRead = input.read(buf)) != -1){
                                 output.write(buf, 0, numBytesRead);
                             }
                         data = output.toByteArray();
                         output.close();
                         input.close();

                     } catch (Exception e) {
                         e.printStackTrace();
                     }

                 return data;
             }


    public static String replaceEnter(String str){
                 String reg ="[\n-\r]";
                 Pattern p = Pattern.compile(reg);
                 Matcher m = p.matcher(str);
                 return m.replaceAll("");
             }

}
