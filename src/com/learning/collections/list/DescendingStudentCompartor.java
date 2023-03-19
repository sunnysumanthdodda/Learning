package com.learning.collections.list;

import java.util.Comparator;

class DescendingStudentCompartor implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getId(), s1.getId());
    }
}
