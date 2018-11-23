import java.util.ArrayList;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class TreeBlossomReport implements BloomReport{

    private ArrayList<BloomObserver> observers;

    private ArrayList<Bloomable> floweringTreeList;

    public TreeBlossomReport(){
    	observers=new ArrayList<>();
    	floweringTreeList= new ArrayList<>();
    }
    
    public void addReportItems(Bloomable ... trees){
        for(Bloomable tree: trees){
        	
            floweringTreeList.add(tree);
            tree.addReporter(this);
        }
    }//addFloweringTrees
    
    public void removeReportItem(Bloomable toRemove){
        floweringTreeList.remove(toRemove);
        toRemove.removeReporter(this);
    }//removeFloweringTrees

    public void addSubscriber(BloomObserver newSubscriber){
    	if(observers.indexOf(newSubscriber)==-1) 
        	observers.add(newSubscriber);
    }//addSubscriber

    public void removeSubscriber(BloomObserver unsub){
    		observers.remove(unsub);
    }//removeSubscriber

    public void notifySubscribers(){
        ArrayList<Bloomable> blooming = new ArrayList<Bloomable>();
        for(BloomObserver sub: observers){
            for(Bloomable tree: floweringTreeList){
                if(tree.getBloomState()) {
                    blooming.add(tree);
                }
            }
            sub.update(blooming);
        }
    }//notifySubscribers
    
    
    
    //Additional Methods for Testing
    public boolean isSubscriber(BloomObserver obs) {
    		return observers.indexOf(obs)!=-1;
    }//isSubscriber
    
    public boolean inFloweringTreeList(FloweringTree f) {
    	return floweringTreeList.indexOf(f)!=-1;
    }//inFloweringTreeList


}//BloomReport
