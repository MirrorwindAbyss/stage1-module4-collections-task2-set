package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer element : sourceList) {
            if(element%2==0){
                int x = element;
                while(x%2==0){
                    hashSet.add(element);
                    x = x/2;
                }
            }
            hashSet.add(element);
            hashSet.add(2*element);
        }
    return hashSet;
    }
}
