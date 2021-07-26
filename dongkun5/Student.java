package dongkun5;


public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student s) {
//        return 0;
//        return 1;
//        return -1;
//        return -(this.age-s.age);
//        return this.age-s.age;
//        return s.age-this.age;
        int num = this.age - s.age;
//        return num;
        //年齡相同比較姓名
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }
}
