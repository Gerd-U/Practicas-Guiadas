public class Main {
    public static void main(String[] args) {
        GameConfig gameConfig = GameConfig.getInstance();
        EnemySystem enemySystem = new EnemySystem();
        PlayerSystem playerSystem = new PlayerSystem();

        gameConfig.setDifficulty("Facil");
        gameConfig.setLives(3);
        gameConfig.setEnemySpeed(2.5);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Configuracion global:");
        gameConfig.showConfig();

        System.out.println("---------------------------------------------------------------");

        System.out.println("Mostrar vidas:");
        playerSystem.showLives();

        System.out.println("---------------------------------------------------------------");

        System.out.println("Mostrar velocidad del enemigo:");
        enemySystem.showEnemySpeed();

        System.out.println("---------------------------------------------------------------");

    }
}
