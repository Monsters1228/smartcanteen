package com.zsc.common.util;

import org.apache.commons.codec.binary.Base64;

import java.io.*;

/**
 * @author Monsters
 * @date 2022/4/14 9:17 下午
 */
public class Base64Utils {
    /**
     * 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
     *
     * @param imgPath
     * @return
     */
    public static String GetImageStr(String imgPath) {
        // 待处理的图片
        String imgFile = imgPath;
        InputStream in = null;
        byte[] data = null;
        // 返回Base64编码过的字节数组字符串
        String encode = null;
        // 对字节数组Base64编码
        Base64 encoder = new Base64();
        try {
            // 读取图片字节数组
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            encode = encoder.encodeToString(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return encode;
    }

    /**
     * base64字符串转化成图片
     *
     * @param imgData     图片编码
     * @param imgFilePath 存放到本地路径
     * @return
     * @throws IOException
     */
    @SuppressWarnings("finally")
    public static boolean GenerateImage(String imgData, String imgFilePath) throws IOException {
        // 图像数据为空
        if (imgData == null)
        {
            return false;
        }
        Base64 decoder = new Base64();
        OutputStream out = null;
        try {
            out = new FileOutputStream(imgFilePath);
            // Base64解码
            byte[] b = decoder.decode(imgData);
            for (int i = 0; i < b.length; ++i) {
                // 调整异常数据
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            out.write(b);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
            return true;
        }
    }
}
