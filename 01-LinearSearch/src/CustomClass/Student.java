package CustomClass;

import java.util.Objects;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    //自定义类比较需重写equals方法
    @Override
    public boolean equals(Object student) {
        if (this == student) return true;
        if (student == null || this.getClass() != student.getClass()) return false;

        Student another = (Student)student;
        return this.name.equals(another.name);
    }


}
