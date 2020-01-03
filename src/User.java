public class User {
    private Integer age;
    private Integer gongzi;

    public User() {
    }

    public User(Integer age, Integer gongzi) {
        this.age = age;
        this.gongzi = gongzi;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGongzi() {
        return gongzi;
    }

    public void setGongzi(Integer gongzi) {
        this.gongzi = gongzi;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", gongzi=" + gongzi +
                '}';
    }
}
