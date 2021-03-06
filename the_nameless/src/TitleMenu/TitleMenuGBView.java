package TitleMenu;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import Settings.SettingsModel;

public class TitleMenuGBView extends JPanel 
{
	//settings
	SettingsModel userSets = new SettingsModel();
	//Game Board
	TitleMenuGBModel board = new TitleMenuGBModel();
	public void paintComponent( Graphics g )
	{
	  int i, j, startX, startY, radius, w1, w2, h1, h2, rw1, rw2, rh1, rh2, rad1;
	  int gridWidth = userSets.getGridWidth();
	  int gridHeight = userSets.getGridHeight();
	  if (userSets.getRatio() == 0) {
		  w1 = (userSets.getWindowWidth() / 10);
		  w2 = (userSets.getWindowWidth() / 40);
		  h1 = (userSets.getWindowHeight() / 8);
		  h2 = (userSets.getWindowHeight() / 60);
		  rad1 = (userSets.getWindowHeight() / 10);
		  rw1 = (userSets.getWindowWidth() / 2);
		  rw2 = (userSets.getWindowWidth() / 8);
		  rh1 = (userSets.getWindowHeight() / 2);
		  rh2 = (userSets.getWindowHeight() / 5);
	  }
	  else if (userSets.getRatio() == 1) {
		  w1 = (userSets.getWindowWidth() / 8);
		  w2 = (userSets.getWindowWidth() / 30);
		  h1 = (userSets.getWindowHeight() / 9);
		  h2 = (userSets.getWindowHeight() / 40);
		  rad1 = (userSets.getWindowHeight() / 9);
		  rw1 = (userSets.getWindowWidth() / 2);
		  rw2 = (userSets.getWindowWidth() / 14);
		  rh1 = (userSets.getWindowHeight() / 2);
		  rh2 = (userSets.getWindowHeight() / 4);
	  }
	  else {
		  w1 = (userSets.getWindowWidth() / 6);
		  w2 = (userSets.getWindowWidth() / 40);
		  h1 = (userSets.getWindowHeight() / 8);
		  h2 = (userSets.getWindowHeight() / 60);
		  rad1 = (userSets.getWindowHeight() / 10);
		  rw1 = (userSets.getWindowWidth() / 2);
		  rw2 = (userSets.getWindowWidth() / 8);
		  rh1 = (userSets.getWindowHeight() / 2);
		  rh2 = (userSets.getWindowHeight() / 5);
	  }
	  radius = rad1;
	  startX = w1 + w2;
	  startY = h1 + h2;
      super.paintComponent( g );

      this.setBackground( Color.WHITE);

      //Level:1 - This is the square
      g.setColor( Color.YELLOW );
      g.fillRect(w1, h1, (rw1 + rw2), (rh1 + rh2) );
      

      //Level:2 - White cirlces to complete board
      g.setColor( Color.WHITE);
      for(i=0; i<gridWidth; i++){
    	  for(j=0; j<gridHeight; j++){
    		  if (board.getGrid(i, j) == 0)
    		  {
    			  g.setColor(Color.WHITE);
    		  }
    		  else if (board.getGrid(i, j) == 1)
    		  {
    			  g.setColor(Color.BLACK);
    		  }
    		  else if (board.getGrid(i, j) == 2)
    		  {
    			  g.setColor(Color.RED);
    		  }
    		  g.fillOval(startX + ((radius + 7) * i), startY + ((radius + 7) * j), radius, radius);
    	  }
      }
      
	}
}