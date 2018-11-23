import java.util.ArrayList;
/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public abstract class TreeBlossomObserver implements BloomObserver {

	private ArrayList<Bloomable> treesInBloom;
	
	public TreeBlossomObserver() {}
	
	@Override
    public void update(ArrayList<Bloomable> currentlyInBloom) {
    	treesInBloom = currentlyInBloom;	
    }//update

    @Override
    public void subscribe(BloomReport report) {
        report.addSubscriber(this);
    }//subscribe

    @Override
    public void unsubscribe(BloomReport report) {
        report.removeSubscriber(this);
    }//removeSubscriber

    //Additional Method for Testing
    public ArrayList<Bloomable> getTreesInBloom(){
        return treesInBloom;
    }//getTreesInBloom
	
}
