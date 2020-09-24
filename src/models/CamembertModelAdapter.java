package models;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public abstract class CamembertModelAdapter extends Observable implements ICamembertModel{

	private ArrayList<PieModel> items = new ArrayList<PieModel>();
	
	public void addItem(PieModel i) {
		items.add(i);
	}
	
	public void removeItem(int i) {
		items.remove(i);
	}
	
	private void setChange(int action) {
		
	}
	
	private void updateObserver() {
		this.setChange(0);
		notifyObservers();
	}
	
}
