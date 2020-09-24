package models;

public interface ICamembertModel {

	 public int size();
	 public int getValues(int i);
	 public int total();
	 public String getTitle();
	 public String getTitle(int i);
	 public String getUnit();
	 public String getDescription();
	 public String getDescription(int i);
	 public void addItem(PieModel i);
	 public void removeItem(int i);
}
