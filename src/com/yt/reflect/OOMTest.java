package com.yt.reflect;

/**
 * @Author : Tong.Yang11@geely.com
 * @Date : 2019/06/11 14:37
 * @Description : TODO
 */
public class OOMTest {


    public static void main(String[] args) {
        int _1m = 1024 * 1024;
        byte[] data = new byte[_1m];
        // 将data置为null即让它成为垃圾
        data = null;
        // 通知垃圾回收器回收垃圾
        System.gc();

    }

}
