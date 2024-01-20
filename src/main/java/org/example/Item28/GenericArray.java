package org.example.Item28;

import java.util.ArrayList;
import java.util.List;

public class GenericArray {

    public static void main(String[] args) {
        Object[] array = new Long[1];
        array[0] = "array";

        List<Object> list = new ArrayList<Object>();
        list.add("array");

        System.out.println(array.toString() + "+" + list);

    }
}
