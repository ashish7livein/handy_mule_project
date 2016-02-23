package com.ashish.application;

import java.util.HashSet;
import java.util.Set;

public class SetIntersection {

    public static void main (String args[]) {
        Set<String> set1 = new HashSet<String>();
        set1.add("Ashish");
        set1.add("Amith");
        set1.add("Ashok");
        set1.add("Abhi");
        Set<String> set2 = new HashSet<String>();
        set2.add("Ashish");
        set2.add("Amith");
        set2.add("Sravya");
       
        set2.retainAll(set1);
        for (String str : set2) {
            System.out.println(str);
        }
        
    }
}
