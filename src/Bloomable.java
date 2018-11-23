/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public interface Bloomable{

	public void addReporter(BloomReport newReport);
	
	public void removeReporter(BloomReport toRemove);
	
    public String getName();

    public boolean getBloomState();
    
    public void setBloomState(boolean bState);
}
