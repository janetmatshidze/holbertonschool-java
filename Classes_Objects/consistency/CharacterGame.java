public class CharacterGame {

    private int currentHealth;
    private String name;
    private String status;
    
    // Constructor
    public CharacterGame(int currentHealth, String name){
       this.name = name;
       setCurrentHealth(currentHealth);
    }

    // Getters
    public int getCurrentHealth() {
        return currentHealth;
    }

        public String getName() {
        return name;
    }

    public String getStatus(){
        return status;
    }

    //Setters
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;

        if(currentHealth > 0) {
            status = "alive";
        }
        else {
            status = "dead";
        }
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            return;
    }
         this.name = name;
    }

    public void takeDamage(int damageAmount) {
      int newHealth = currentHealth - damageAmount;

      if(newHealth < 0) {
        newHealth = 0; // it becomes 0 because it cannot be negetive .
     }
     setCurrentHealth(newHealth);
}

    public void receiveHealing(int healingAmount) {
     int newHealth = currentHealth + healingAmount;

       if(newHealth > 100){
        newHealth = 100; // cannot exceed 100%
       }
       setCurrentHealth(newHealth);
    }
}

   



