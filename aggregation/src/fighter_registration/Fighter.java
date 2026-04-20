package fighter_registration;

public class Fighter implements FighterInterface{
    private String name;
    private String country;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int wins;
    private int losses;
    private int draws;

    //constructor 
    public Fighter(String name, String country, int age, double height, double weight, int wins,
                   int losses, int draws) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    //getters 
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String getCategory() {
        return category;
    }
    public int getWins() {
        return wins;
    }
    public int getLosses() {
        return losses;
    }
    public int getDraws() {
        return draws;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }
    public void setCategory() {
        if (this.weight < 52.2){
            System.out.println("invalid weight");
        }
        else if (this.weight <= 70.3 ){
            this.category = "lightweight";
        }
        else if (this.weight <= 83.9){
            this.category = "midweight";
        }
        else if (this.weight <= 120.2){
            this.category = "heavyweight";
        }
        else{
            System.out.println("invalid weight");
        }
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public void setLosses(int losses) {
        this.losses = losses;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }

    //Interface methods
    @Override
    public void presentation() {
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Name: %s \nCountry: %s \nAge: %d \nHeight: %.2fm \nWeight: %.1fKG \nCategory: %s \nWins: %d \nLosses: %d \nDraws: %d",
                                this.getName(), this.getCountry(), this.getAge(), this.getHeight(), this.getWeight(), this.getCategory(), this.getWins(), 
                                this.getLosses(), this.getDraws());
    }

    @Override
    public void status() {
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Name: %s \nCategory: %s \nWins: %d \nLosses: %d \nDraws: %d \n",
                          this.getName(), this.getCategory(), this.getWins(), this.getLosses(), this.getDraws());

    }

    @Override
    public void winFight() {
        this.setWins(this.getWins() + 1);
    }

    @Override
    public void loseFight() {
        this.setLosses(getLosses() + 1);
    }

    @Override
    public void drawFight() {
        this.setDraws(getDraws() + 1);
    }
    
}
