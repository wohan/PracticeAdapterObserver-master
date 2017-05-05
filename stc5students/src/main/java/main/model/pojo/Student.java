package main.model.pojo;

/**
 *
 */
public class Student {

    private long id;
    private String name;
    private int age;
    private Group group;
    private long groupId;

    public Student() {

    }

    public Student(long id, String name, int age, Group group, long groupId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.group = group;
        this.groupId = groupId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
