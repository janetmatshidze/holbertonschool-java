public class CharacterGame {

    private int currentHealth;
    private String name;

    // Getters
    public int getCurrentHealth() {
        return currentHealth;
    }

        public String getName() {
        return name;
    }

    //Setters
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void setName(String name){
        this.name = name;
    }

    public void takeDamage(int damageAmount) {
        currentHealth -= damageAmount; // currentHealth = currentHealth - damageAmount; OR currentHealth = Math.max(0, currentHelth - damageAmount); - The Math.max method calculates the difference bretween two values.

     if(currentHealth < 0) {
        currentHealth = 0; // it becomes 0 because it cannot be negetive .
     }
}

    public void receiveHealing(int healingAmount) {
       currentHealth += healingAmount; // OR currentHealth = Math.max(100, currentHealth + healingAmount);

       if(currentHealth > 100){
        currentHealth = 100;
       }
    }



}