package cn.smileyan.demo.web;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupStart {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://blog.csdn.net/smileyan9").get();
        String title = doc.title();
        System.out.println(title);
    }
}
