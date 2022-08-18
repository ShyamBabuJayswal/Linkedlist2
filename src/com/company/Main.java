//Linked list using inbuilt funtion
package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //add first
        list.addFirst("d");
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");


            //add last
            list.addLast("e");
            list.addLast("f");
            list.addLast("g");
            list.addLast("h");
            for (int j = 0; j< list.size(); j++) {
                System.out.println(list.get(j) + "");
            }
            //delete
        list.remove("a");
        for (int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i) + "");
        }

        }
    }
