package com.inflowsol.collection.Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,3,3,3,3);

        Iterator  iterator=l.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
      /* l.forEach(integer -> System.out.println(integer));
        Consumer<Integer> c=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        l.forEach(c);
        Consumer<Integer> cc=(Integer i)-> System.out.println(i);*/

    }

}