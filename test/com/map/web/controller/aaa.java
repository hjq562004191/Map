package com.map.web.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class aaa {
    public static void main(String[] args) {
        URL url = null;URL url1 = null;URL url2 = null;URL url3 = null;URL url4 = null;URL url5 = null;
        try {
            url1 = new URL("https://blog.csdn.net/sinat_41905822/article/details/88427394");
            url2 = new URL("https://blog.csdn.net/sinat_41905822/article/details/88427220");
            url3 = new URL("https://blog.csdn.net/sinat_41905822/article/details/88427394");
            url4 = new URL("https://blog.csdn.net/sinat_41905822/article/details/88427394");
            url5 = new URL("https://blog.csdn.net/sinat_41905822/article/details/88427394");
            url = new URL("https://blog.csdn.net/sinat_41905822/article/details/88427394");

//            URLConnection urlcon = url.openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
