package Interface;

public class stuobject {
    public String name;
    public Integer age;
    public boolean sex; //男生t 女生f
    public String classs;

    public stuobject(String name, Integer age, boolean sex, String classs) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.classs = classs;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + sex + "\t" + classs;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}
