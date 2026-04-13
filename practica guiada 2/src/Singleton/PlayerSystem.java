public class PlayerSystem {
    GameConfig gameConfig;

    public PlayerSystem() {
        this.gameConfig = GameConfig.getInstance();
    }

    public void showLives(){
        System.out.println("Vidas " + gameConfig.getLives());
    }
}
