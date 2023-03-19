package com.learning.collections.list;

import java.util.Comparator;

class AscendingStudentCompartor implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return String.CASE_INSENSITIVE_ORDER.compare(s1.getName(), s2.getName());
    }
}
