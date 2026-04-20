package animal;

public class Animal {
    private String breed;
    private int age;

    //getters
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    //setters
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void makenoise(){
        System.out.println("animals make noise!");
    }
    
}


