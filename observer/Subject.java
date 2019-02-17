package design.pattern.observer;


public interface Subject {

	public void registerObserver(Observer o);
	public void setStatus(String s);
	public String getStatus();
	public void removeObserver(Observer observer);
	
	
	
	
}