package controllers;

import views.ICamembertView;

public interface IController {

	public void setSelected(boolean s);
	public void setSelectedPie(int i);
	public void selectPie(int i);
	public void deSelect();
	public void nextPie();
	public void previousPie();
	public int getSelectedPie();
	public boolean isSelected();
	public ICamembertView getView();
}
