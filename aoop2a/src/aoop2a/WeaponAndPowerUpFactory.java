package aoop2a;

public class WeaponAndPowerUpFactory implements AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword(); // Change to Bow() for different weapon
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthPotion(); // Change to ManaPotion() for different power-up
    }
}