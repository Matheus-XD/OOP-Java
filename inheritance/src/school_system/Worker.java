package school_system;
public class Worker extends Person{
    private String sector;
    private boolean working;

    //Getters
    public String getSector() {
        return sector;
    }
    public boolean isWorking() {
        return working;
    }
    //Setters
    public void setSector(String sector) {
        this.sector = sector;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }

    //Business methods
    public void changeSector(String sector){
        this.sector = sector;
    }
    @Override
    public String toString() {
        return "Worker [sector=" + sector + ", working=" + working + "]";
    }
    
}
