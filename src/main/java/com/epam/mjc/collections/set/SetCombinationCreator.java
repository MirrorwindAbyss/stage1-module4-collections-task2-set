package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> s = new HashSet<>(firstSet);
        s.retainAll(secondSet);
        s.retainAll(thirdSet);
        Set<String> temp = new HashSet<>(thirdSet);
        temp.removeAll(firstSet);
        temp.removeAll(secondSet);
        s.addAll(temp);
        return s;
    }
}
