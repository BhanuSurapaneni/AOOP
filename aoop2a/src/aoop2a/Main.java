package aoop2a;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Singleton GameState
     GameState gameState = GameState.getInstance();
     System.out.println("Current Level: " + gameState.getCurrentLevel());

     // Factory Method for Enemies
     EnemyFactory enemyFactory = new GoblinFactory();
     Enemy enemy = enemyFactory.createEnemy();
     enemy.attack();

     // Abstract Factory for Weapons and Power-ups
     AbstractFactory factory = new WeaponAndPowerUpFactory();
     Weapon weapon = factory.createWeapon();
     PowerUp powerUp = factory.createPowerUp();

     weapon.use();
     powerUp.activate();
 }
}
