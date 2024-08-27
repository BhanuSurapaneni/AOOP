package aoop2a;

//GameState.java
public class GameState {
 private static GameState instance;
 private int currentLevel;
 private int score;

 private GameState() {
     currentLevel = 1;
     score = 0;
 }

 public static GameState getInstance() {
     if (instance == null) {
         instance = new GameState();
     }
     return instance;
 }

 public int getCurrentLevel() {
     return currentLevel;
 }

 public void setCurrentLevel(int currentLevel) {
     this.currentLevel = currentLevel;
 }

 public int getScore() {
     return score;
 }

 public void addScore(int points) {
     this.score += points;
 }
}
