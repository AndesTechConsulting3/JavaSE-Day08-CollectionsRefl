package org.andestech.learning.rfb19.g3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppColl {

    public static void main(String[] args)
    {

        ArrayList<Integer> list =
                new ArrayList<>();

        list.add(1287);
        list.add(-12);
        list.add(12);
        list.add(-1);
        list.add(120);
        list.add(-162);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        //-----------------------------
        Collections.shuffle(list);
        System.out.println(list);

        // 1st method to sort
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("---------- 1st sort ---------");
        System.out.println(list);
        System.out.println("---------- 2nd sort ---------");
        list.sort(new MyCompare());
        System.out.println(list);
        System.out.println("---------- 3d sort ---------");

       // list.sort( (x,y)-> {return(x-y);}  );
        list.sort( (x1,y2)-> Math.abs(x1)- Math.abs(y2) );
        System.out.println(list);

       // TASK
       // sort invenotiries by numbers:
       // AA28673, AB23898, BN89234, KL23488






    }
}

class MyCompare implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}