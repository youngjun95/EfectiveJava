package org.example.Item26;

import java.util.*;

public class Item26 {


    public static void main(String[] args) {
        //Collection 이란 타입을 활용하여 stemp라는 객체만 넣을것이다.
        Collection stemp = new ArrayList<>();

        // stemp 라는 곳에 Stemp 객체와 Coin객체 모두가 들어가게 된다.
        Stemp stemp1 = new Stemp();
        Stemp stemp2 = new Stemp();
        stemp.add(stemp1);
        //stemp.add(new Coin());
        stemp.add(stemp2);

        for(Iterator index = stemp.iterator(); index.hasNext();) {
            Stemp i = (Stemp) index.next();
            System.out.println(i.toString());
        }

        Set<?> set = new HashSet<>();
        /*set.add("stst");
        set.add(12312);*/
        set.add(null);
    }
}
