package com.controller;

import com.model.Pair;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataOperation {
    static File f=new File("D:\\CODING\\JAVA PROGRAMMING\\IAS_Hackthon\\src\\Database.txt");

    public int put(int key,String value) throws IOException {
        try{
        RandomAccessFile rf=new RandomAccessFile(f,"rw");
        String a=rf.readLine();
        int count=1;
        String line="";
        while(count!=key-1){
            line=rf.readLine();
            count++;
        }
        rf.writeBytes(key+","+value);
        rf.close();}
        catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    public String get(int x) throws IOException {
        String value= Files.readAllLines(Paths.get("D:\\CODING\\JAVA PROGRAMMING\\IAS_Hackthon\\src\\Database.txt")).get(x-1);
        if(value.equals("")){
            return "Key is not present";
        }
        String []val=value.split(",");
        return val[1];

    }

    public void load(File f) throws IOException {
        String line="";
        String splitBy=",";
        BufferedReader br = new BufferedReader(new FileReader(f));
        while((line = br.readLine()) != null) {
            if(line.equals("")){
                continue;
            }
            String[] p = line.split(splitBy);
            System.out.println(p[0]+","+p[1]);
        }
    }

    public String scanMax(int start,int end) throws IOException {
        String ans="";
        for(int i=start;i<=end;i++) {
            String val = get(i);
            if (val.compareTo(ans) > 0) {
                ans = val;
            }
        }
        return ans;
    }
//    public static void main(String[] args) throws IOException {
//        DataOperation dop=new DataOperation();
//        File fl=new File("D:\\CODING\\JAVA PROGRAMMING\\IAS_Hackthon\\src\\Database.txt");
//        dop.load(fl);
////        dop.put(23,"Muktaaaa");
////        System.out.println(dop.scanMax(566,16));
//    }
}
