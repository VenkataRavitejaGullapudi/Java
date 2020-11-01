package com.java.day9;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> names = new ArrayList();
        names.add("Thor");
        names.add("Valkyrie");
        names.add("Loki");
        for(String name:names){
            System.out.println(name);
        }
        names.add(1,"Ravi");
        System.out.println();
        for(String name:names){
            System.out.println(name);
        }
        names.remove("Thor"); // by value
        names. remove(0); // by index

        // Iterators
        Iterator iterator = names.iterator();
        // Has next returns true if there is a next element
        // else false
        while(iterator.hasNext()){
            // If has next element then get the element.
            System.out.println(iterator.next());
        }


        // Hash Table
        //Creating Hashtable with Key is of String type and value is of string type.
        Hashtable<String,String> hashtable = new Hashtable();
        hashtable.put("Name1","Ravi");
        hashtable.put("Name2","Iron Man");
        hashtable.put("Name3","Thor");
        System.out.println("---Storing in Hash table--");
        // To get hash value
        System.out.println(hashtable.get("Name1"));
        // To remove a element


        for (Map.Entry entry: hashtable.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        hashtable.remove("Name3");

        for (Map.Entry entry: hashtable.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
