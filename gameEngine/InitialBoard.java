package gameEngine;

import java.util.ArrayList;
import java.util.List;

import editMe.Player;


public class InitialBoard {
	
	int width;
	int height;
	List<ArrayList> objList = new ArrayList<ArrayList>();
	
	public InitialBoard() {
		
			width = 5;
			height = 5;
			
			Food food = new Food();
			createObject(4, 4, food);
			
			Enemy enemy1 = new Enemy();
			createObject(0, 0, enemy1);
			
			//Enemy enemy2 = new Enemy();
			//createObject(1, 0, enemy2);
			
			Enemy enemy3 = new Enemy();
			createObject(2, 0, enemy3);
			
			//Enemy enemy4 = new Enemy();
			//createObject(0, 1, enemy4);
			
			//Enemy enemy5 = new Enemy();
			//createObject(2, 1, enemy5);
			
			Enemy enemy6 = new Enemy();
			createObject(0, 2, enemy6);
			
			Enemy enemy7 = new Enemy();
			createObject(2, 2, enemy7);
			/*
			NothingSpace nothingX1Y0 = new NothingSpace();
			createObject(1, 0, nothingX1Y0);
			
			NothingSpace nothingX2Y0 = new NothingSpace();
			createObject(2, 0, nothingX2Y0);
			
			NothingSpace nothingX1Y1 = new NothingSpace();
			createObject(1, 1, nothingX1Y1);
			
			NothingSpace nothingX2Y1 = new NothingSpace();
			createObject(2, 1, nothingX2Y1);
			*/
			BoardObject player = new Player();
			createObject(1, 1, player);
	}
	
	void createObject(int x, int y, Object obj) {
		ArrayList list = new ArrayList();
		list.add(x);
		list.add(y);
		list.add(obj);
		objList.add(list);
	}
	
	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}
	
	List<ArrayList> getObjList() {
		return objList;
	}
}
