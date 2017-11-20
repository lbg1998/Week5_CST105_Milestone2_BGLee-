/** Program: NFLPlayer
* File: NFLPlayer.java
* Author: Byung Gil Lee
* Date: November 19, 2017
* It is my own work.
**/
public class NFLPlayer {
	
	private int id;
    private String name;
    private String teamName;
	private int score;

	public void NFLplayer() {}
	public void NFLplayer(int id, String name, String teamName, int score) {
	this.id = id;
	 this.name = name;
	this.teamName = teamName;
	 this.score = score;
	 }
	 public int getId() {
	 return id;
	 }
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	 this.name = name;
	 }
	 public String getTeamName() {
	 return teamName;
	 }
	 public void setTeamName(String teamName) {
	 this.teamName = teamName;
	 }
	public int getScore() {
	return score;
	}
	public void setScore(int score) {
	 this.score = score;
	 }
	}