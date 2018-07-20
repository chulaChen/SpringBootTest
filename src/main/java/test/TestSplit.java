package test;

import org.junit.Test;

/**
 * User: cz
 * Date: 2018/1/5
 * Time: 15:47
 */
public class TestSplit {

    @Test
    public void split(){
        String str = "";
        System.out.println("test".equals(""));
        System.out.println(str.equals(""));
        String str1 = "a,b,,";
        String[] arr = str1.split(",");
        System.out.println(arr.length);
        for(String st:arr){
            System.out.println(st);
        }
    }

}
