package controllers;

import models.ICamembertModel;
import views.ICamembertView;

public class CamembertController implements IController {
	ICamembertModel camembert;
	ICamembertView camembertView;
	boolean selected;
	int currentPie;
	
	
	
	
	

	public CamembertController(ICamembertModel camembert, ICamembertView camembertView) {
		super();
		this.camembert = camembert;
		this.camembertView = camembertView;
		selected = false;
		currentPie = 0;
	}

	@Override
	public void setSelected(boolean s) {
		// TODO Auto-generated method stub
		selected = s;
		
	}

	@Override
	public void setSelectedPie(int i) {
		// TODO Auto-generated method stub
		if(i >= 0 && i <= this.camembert.size()) {
			currentPie = i;
		}
		
	}

	@Override
	public void selectPie(int i) {
		// TODO Auto-generated method stub
		if(i >= 0 && i <= this.camembert.size()) {
			camembertView.selectPie(i);
			currentPie = i;
		}
		
	}

	@Override
	public void nextPie() {
		// TODO Auto-generated method stub
		if(currentPie+1 <= this.camembert.size()) {
			currentPie += 1;
		}
		
		
	}

	@Override
	public void previousPie() {
		// TODO Auto-generated method stub
		if(currentPie-1 >= 0) {
			currentPie -= 1;
		}
	}

	@Override
	public int getSelectedPie() {
		// TODO Auto-generated method stub
		return currentPie;
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return selected;
	}

	@Override
	public ICamembertView getView() {
		return camembertView;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deSelect() {
		// TODO Auto-generated method stub
		selected = false;
		
	}


}
