package gameEngine;

import editMe.Player;
import javafx.scene.paint.Color;

public class Enemy implements BoardObject, EnemyInterface {
	
	Color color;
	String shape;
	EnemyView info;
	
	// Put enemy "memory" here
	Direction currDir;

	public Enemy() {
		color = Color.rgb(153, 0, 153);
		shape = "circle";
		currDir = new Stay();
	}
	
	
	public void initializeEnemyView(Controller controller, Player player) {
		info = new EnemyView(controller, this, player);
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(int r, int g, int b) {
		color = Color.rgb(r, g, b);
	}
	
	public String getShape() {
		return shape;
	}
	
	public Direction move() {
		if(info.getMyX() == 0) {
			if(info.getMyY() == 0) {
				currDir = new Right();
			}
			else {
				currDir = new Up();
			}
		}
		else if(info.getMyX() == 1) {
			if(info.getMyY() == 0) {
				currDir = new Right();
			}
			else {
				currDir = new Left();
			}
		}
		else if(info.getMyX() == 2){
			if(info.getMyY() == 2) {
				currDir = new Left();
			}
			else{
				currDir = new Down();
			}
		}
		return currDir;
	}
	
	public String onCollision() {
		return "enemy";
	}
	
	public String toString() {
		return "enemy";
	}
}
