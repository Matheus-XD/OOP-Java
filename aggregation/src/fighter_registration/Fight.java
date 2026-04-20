package fighter_registration;
import java.util.Random;

public class Fight {
    private Fighter challenger;
    private Fighter challenged;
    private boolean approved;

    //Getters
    public Fighter getChallenger() {
        return challenger;
    }
    public Fighter getChallenged() {
        return challenged;
    }
    public boolean isApproved() {
        return approved;
    }

    //Setters
    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }
    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void ScheduleFight(Fighter challenger, Fighter challenged){
        if(challenger.getName() == challenged.getName() || challenger.getCategory() != challenged.getCategory()){
            setChallenger(null);
            setChallenged(null);
            setApproved(false );
            System.out.println("\n--------------------------------------------------");
            System.out.println("The fight can not be scheduled");    
           
        }
        else{
            setApproved(true);
            setChallenger(challenger);
            setChallenged(challenged);
            System.out.println("\n--------------------------------------------------");
            System.out.printf("fight between %s and %s has been scheduled", challenger.getName(), challenged.getName());
        }
    }

    public void fight(Fighter challenger, Fighter challenged){
        if (approved == true && this.challenger.equals(challenger) && this.challenged.equals(challenged)){
            System.out.println("\n--------------------------------------------------");
            System.out.println("Fight STARTS...");

            Random random = new Random();
            int winner = random.nextInt(3);
            switch (winner) {
                case 0:
                    challenger.drawFight();
                    challenged.drawFight();
                    System.out.println("the fight ended in a draw");
                    break;
                case 1:
                    challenger.winFight();
                    challenged.loseFight();
                     System.out.printf("%s wins", challenger.getName());
                    break;
                case 2:
                    challenger.loseFight();
                    challenger.winFight();
                     System.out.printf("%s wins", challenged.getName());
                    break;       
                default:
                    break;
            }
        }
        else{
            System.out.println("\n--------------------------------------------------");
            System.out.printf("The fight between %s and %s must be scheduled first", challenger.getName(), challenged.getName());
        }
    }

}
