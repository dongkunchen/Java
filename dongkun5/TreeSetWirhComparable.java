package dongkun5;

import java.util.TreeSet;


public class TreeSetWirhComparable {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
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
