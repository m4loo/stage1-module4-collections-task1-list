package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }

    class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            int formulaDiff = formula(a) - formula(b);
            if (formulaDiff != 0) {
                return formulaDiff;
            } else {
                return a.compareTo(b);
            }
        }

        public int formula(String a) {
            int number = Integer.parseInt(a);
            return (int) (5 * Math.pow(number, 2) + 3);
        }
    }
}
