package com.company;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List list = new List();
       list.addByIndex(0, 1);
       list.addFirst(2);
       list.addFirst(3);
       list.printList();
       list.overwriteByIndex(1, 9);
       list.printList();



        //boolean result = s2.equals(s3);
        //System.out.println(s3.toString());
        //System.out.println(result);

    }


}
