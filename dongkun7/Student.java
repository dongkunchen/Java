package dongkun7;

import java.io.Serializable;


public class Student implements Serializable {
    //加上版本號可以防止修改時出錯
    private static final long serialVersionUID = 42L;
    private String name;
//    private int age;
    //transient修飾不參予序列化
    private transient int age;
    public Student(){
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}
