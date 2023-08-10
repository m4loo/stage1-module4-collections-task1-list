package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newArrayList = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.size()>2&&(i+1)%3==0) {
                newArrayList.add(sourceList.get(i));
                newArrayList.add(sourceList.get(i));
            }
        }
        return newArrayList;
    }
}
