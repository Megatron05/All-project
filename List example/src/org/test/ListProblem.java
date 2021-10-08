package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListProblem {
public static void main(String[] args) {
List<Object> li = new ArrayList<>();
li.add("java");
li.add("java");
li.add("Java");
Set<Object> s = new TreeSet<>();
s.addAll(li);
System.out.println(s);









}}