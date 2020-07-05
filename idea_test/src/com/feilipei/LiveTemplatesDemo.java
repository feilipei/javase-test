package com.feilipei;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jcf
 * @date 2020/7/5 - 22:56
 */
public class LiveTemplatesDemo {
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("sout");
        //模板三：fori：可生成for循环
        for (int i = 0; i < 4; i++) {

        }
        List<String> list = new ArrayList<String>();
        //模板四：list.for : 可生成集合 list 的 for 循环
        for (String s : list) {
            System.out.println();
        }
        //模板五：ifn 可生成 if(xxx = null)
        if (list == null) {
        }


    }
}
