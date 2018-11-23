
public interface BloomReport{
	
	void addReportItems(Bloomable ...bloomables);
	
	void addSubscriber(BloomObserver blossomObserver);
	
	void removeSubscriber(BloomObserver blossomObserver);
	
	void notifySubscribers();
}
