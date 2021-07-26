package dongkun6;

import dongkun5.Student;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetWithComparator {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num =  s1.getAge()-s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",21);
        Student s3 = new Student("wangwu",22);
        Student s4 = new Student("zhaoliu",19);
        Student s5 = new Student("chaichu",18);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student s:ts){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
