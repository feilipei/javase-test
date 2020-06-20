package com.feilipei;

import java.util.LinkedHashSet;

/**
 * @author jcf
 * @date 2020/6/20 - 21:58
 */
public class LinkHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("world");
        for(String s: linkedHashSet){
            System.out.println(s);
        }
    }
}
