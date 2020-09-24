package views;

import controllers.IController;

public interface ICamembertView {
	
	public void setController(IController c);
	public void deSelect();
	public void nextPie();
	public void previousPie();
	public void selectPie(int i);
}
