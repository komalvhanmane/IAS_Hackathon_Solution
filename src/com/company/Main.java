package com.company;

import com.controller.DataOperation;
import com.model.Pair;

import javax.print.attribute.standard.SheetCollate;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        DataOperation dop=new DataOperation();
        dop.put(9,"abc");
//        dop.put(24, "Shreya");
//        dop.put(23,"Komalika\n");

//        System.out.println(dop.get(9));
//        System.out.println(dop.get(986165));
//        dop.put(11362,"Date");
//
//        dop.load(new File("D:\\CODING\\JAVA PROGRAMMING\\IAS_Hackthon\\src\\Database.txt"));
//        System.out.println(dop.get(11362));
        System.out.println(dop.get(9));
        dop.put(9,"cdb");
        System.out.println(dop.get(9));
    }
}
