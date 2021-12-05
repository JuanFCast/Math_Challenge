package model;

import java.io.IOException;

public class MathChallenge {

	private Exercise exercise;
	private Player challenger;
	private Timer timer;
	private ScoreBoard scoreboard;
	
	public MathChallenge(String name) {
		challenger = new Player(name);
		scoreboard = new ScoreBoard();
	}
	
	public void addPlayer() {
		scoreboard.addChallenger(challenger);
	}
	
	public void exportPlayers() throws IOException {
		scoreboard.saveData();
	}
	
	public String getExercise() {
		return exercise.getExercise();
	}
	
	public String getAnswer() {
		return exercise.getAnswer();
	}
	
	public String[] getFakeAnswer() {
		return exercise.getFakeAnswers();
	}
	
	public void setExercise(Exercise ex) {
		exercise = ex;
	}
	
	public String getNameOperator() {
		return exercise.getNameOperator();
	}
	
	public Player getChallenger() {
		return challenger;
	}
	
	public long getScore() {
		return challenger.getScore();
	}
	
	public void setTimer(Timer t) {
		timer = t;
	}
	
	public Timer getTimer() {
		return timer;
	}
	
	public String getTime() {
		return timer.time();
	}
	
	public boolean timeIsOver() {
		return timer.timeIsOver();
	}
	
	public void start() throws InterruptedException {
		timer.startTimer();
	}
	
}
