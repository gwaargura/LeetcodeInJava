package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeTinyURL {
    private List<Integer> list = new ArrayList<>();
    public String encode(String longUrl) {
        String encodeTail = "";
        String head = "";
        for(int i = 12; i < longUrl.length(); i++) {
            head = longUrl.substring(0, i);
            if(head.contains(".com")){
                encodeTail = longUrl.substring(i);
                list.add(i);
                break;
            }
        }
        String tail = "";
        for(int i = 0; i < encodeTail.length(); i++) {
            if(encodeTail.charAt(i) != '/'){
                int j = encodeTail.charAt(i) - 42;
                tail = tail + j;
                list.add(j);
            }
            else{
                tail = tail + "/";
            }
        }
        return head + tail;
    }
    public String decode(String shortUrl) {
        int index = 1;
        for(int i = list.get(0); i < shortUrl.length(); i++){
            if(shortUrl.charAt(i) != '/'){
                int j = list.get(index);
                shortUrl.replace(shortUrl.charAt(i), (char)j);
                index++;
            }
        }
        return shortUrl;
    }
    public static void main(String[] args) {
        EncodeAndDecodeTinyURL e = new EncodeAndDecodeTinyURL();
        System.out.println(e.encode("https://leetcode.com/problems/tinyurl"));
        System.out.println(e.decode(e.encode("https://leetcode.com/problems/tinyurl")));
    }
}
