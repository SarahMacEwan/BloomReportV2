/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public interface BloomReport{
	
	void addReportItems(Bloomable ...bloomables);
	
	void removeReportItem(Bloomable toRemove);
	
	void addSubscriber(BloomObserver blossomObserver);
	
	void removeSubscriber(BloomObserver blossomObserver);
	
	void notifySubscribers();
	
}//BloomReport
