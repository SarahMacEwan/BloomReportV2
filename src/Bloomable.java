/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public interface Bloomable{

	public void addReport(BloomReport newReport);
	
	public void removeReport(BloomReport toRemove);
	
    public String getName();

    public boolean getBloomState();
    
    public void setBloomState(boolean bState);
    
}//Bloomable
