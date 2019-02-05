package org.andestech.learning.rfb19.g3;


import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class App
{
    public static void main( String[] args ) throws IOException {

        //linked list
        LinkedList<String> linkedList =
                new LinkedList<>();


        linkedList.add("Book1");
        linkedList.add("Book2"); linkedList.add("Book3");

        linkedList.add(1,"Book4");

        // time test

        LinkedList<Integer> linkedList1 =
                new LinkedList<>();
       // int M=10_000_000;
        int M=1_000_000;

        long dt,t;

        t= System.currentTimeMillis();
        for(int i=0; i<M; i++)
            linkedList1.add(new Random().nextInt());
        dt = System.currentTimeMillis()-t;
        System.out.println("dt add all data(link): " + dt + "ms");

        t= System.currentTimeMillis();

        int data = linkedList1.get(5863098);
        dt = System.currentTimeMillis()-t;
        System.out.println("dt get data(link): " + dt + "ms");

//-------------------------------------
        ArrayList<Integer> arrayList =
        new ArrayList<>(10000);

        t= System.currentTimeMillis();
        for(int i=0; i<M; i++)
            arrayList.add(new Random().nextInt());
        dt = System.currentTimeMillis()-t;
        System.out.println("dt add all data(arr): " + dt + "ms");

        t= System.currentTimeMillis();

        data = arrayList.get(5863098);
        dt = System.currentTimeMillis()-t;
        System.out.println("dt get data(arr): " + dt + "ms");

       System.in.read();


    }
}
