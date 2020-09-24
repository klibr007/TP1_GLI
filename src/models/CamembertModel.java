package models;

import java.util.ArrayList;

public class CamembertModel extends CamembertModelAdapter{
	
	private String titleGraph;
	private String unit;
	private String description;
	private ArrayList<PieModel> items = new ArrayList<PieModel>();
	
	public CamembertModel(String t, String u, String desc) {
		this.titleGraph = t;
		this.unit = u;
		this.description = desc;
	}
	
	public void addItem(PieModel i) {
		items.add(i);
	}
	
	public void removeItem(int i) {
		items.remove(i);
	}

	@Override
	public int size() {
		
		return items.size();
	}

	@Override
	public int getValues(int i) {
		
		return this.items.get(i).getValue();
	}

	@Override
	public int total() {
		
		int sum = 0;
		for(PieModel p : this.items) {
			sum += p.getValue();
		}
		return sum;
	}

	@Override
	public String getTitle(int i) {
	
		return this.items.get(i).getTitle();
	}
	
	@Override
	public String getTitle() {
	
		return this.titleGraph;
	}

	@Override
	public String getUnit() {
		
		return this.unit;
	}

	@Override
	public String getDescription() {
		
		return this.description;
	}
	
	@Override
	public String getDescription(int i) {
		
		return this.items.get(i).getDescription();
	}

	

	

}
