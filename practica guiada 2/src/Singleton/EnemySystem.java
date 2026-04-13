public class EnemySystem {
    GameConfig gameConfig;

    public EnemySystem() {
        this.gameConfig = GameConfig.getInstance();
    }

    public void showEnemySpeed(){
        System.out.println("Velocidad del enemigo: " + gameConfig.getEnemySpeed());
    }
}
