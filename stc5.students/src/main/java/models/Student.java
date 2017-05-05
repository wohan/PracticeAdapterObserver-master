package models;

import java.io.Serializable;

/**
 * Created by PoGo on 19.04.2017.
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer age;
    private Integer groupId;

    public Student(Integer id, String name, Integer age, Integer groupId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.groupId = groupId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", groupId=" + groupId +
                '}';
    }
}
