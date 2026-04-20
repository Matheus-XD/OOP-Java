package fighter_registration;


public class Main {
    public static void main(String[] args) {

        Fighter fighter[] = new Fighter[5];
        Fight fight = new Fight();

        fighter[0] = new Fighter("Pretty Boy","France", 31, 1.75f, 68.9f, 11, 2, 1);
        fighter[1] = new Fighter("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        fighter[2] = new Fighter("SnapShadow", "USA", 35, 165, 80.9, 12, 2, 1);
        fighter[3] = new Fighter("DeadCode", "Australia", 28, 1.93f, 81.6f, 12, 0, 2);

      
        fighter[3].status();
        fighter[2].status();
        

        fight.ScheduleFight(fighter[3], fighter[2]);
        fight.fight(fighter[3], fighter[2]);
        
        fighter[3].status();
        fighter[2].status();
    }
}
