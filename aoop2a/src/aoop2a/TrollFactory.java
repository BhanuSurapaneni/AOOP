package aoop2a;

public class TrollFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Troll();
    }
}