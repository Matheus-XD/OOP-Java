package school_system;
public abstract class Person {
    protected String name;
    protected int age;
    protected String sex;


    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    //Business methods
    public void haveBirthday(){
        setAge(age + 1);
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }

    
    
   
}
