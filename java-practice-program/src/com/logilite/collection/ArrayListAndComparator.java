package com.logilite.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollno;
    String name, address;
  
    // Constructor
    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
  
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}
  
class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
  
class Sortbyname implements Comparator<Student> {
    // Used for sorting in ascending order of
    // name
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}
  
// Driver class
class ArrayListAndComparator {
    public static void main(String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Darshan", "Canada"));
        ar.add(new Student(131, "Hardik", "USA"));
        ar.add(new Student(121, "Piyush", "Dubai"));
        ar.add(new Student(141, "Chintan", "NewZealand"));
  
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyroll());
  
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyname());
  
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}