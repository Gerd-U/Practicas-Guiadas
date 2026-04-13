public class GameConfig {

    private static GameConfig instance;
    private String difficulty;
    private int lives;
    private double enemySpeed;

    //constructor privado
    private GameConfig() { }

    //sets y gets
    public static GameConfig getInstance() {
        if (instance == null) {

            instance = new GameConfig();
        }
        return instance;
    }

    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }

    public double getEnemySpeed() {
        return enemySpeed;
    }
    public void setEnemySpeed(double enemySpeed) {
        this.enemySpeed = enemySpeed;
    }
    
    //metodo
    public void showConfig(){
        System.out.println("Dificultad: " + difficulty);
        System.out.println("Vidas: " + lives);
        System.out.println("Velocidad de los enemigos: " + enemySpeed);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    

    

    
    
}