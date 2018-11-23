import java.util.ArrayList;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class BloomReport{

    private ArrayList<Observer> observers;

    private ArrayList<FloweringTrees> floweringTreeList;

    public BloomReport(){
    	observers=new ArrayList<>();
    	floweringTreeList= new ArrayList<>();
    }
    
    public void addFloweringTrees(FloweringTrees ... trees){
        for(FloweringTrees tree: trees){
            floweringTreeList.add(tree);
        }
    }//addFloweringTrees
    
    public void removeFloweringTrees(FloweringTrees extTree){
        floweringTreeList.remove(extTree);
    }//removeFloweringTrees

    public void addSubscriber(Observer newSubscriber){
        observers.add(newSubscriber);
    }//addSubscriber

    public void removeSubscriber(Observer unsub){
        observers.remove(unsub);
    }//removeSubscriber

    public void notifySubscribers(){
        ArrayList<FloweringTrees> blooming = new ArrayList<FloweringTrees>();
        for(Observer sub: observers){
            for(FloweringTrees tree: floweringTreeList){
                if(tree.getBlossomState()) {
                    blooming.add(tree);
                }
            }
            sub.update(blooming);
        }
    }//notifySubscribers
    
    
    
    //Additional Methods for Testing
    public boolean isSubscriber(Observer obs) {
    		return observers.indexOf(obs)!=-1;
    }//isSubscriber
    public boolean inFloweringTreeList(FloweringTree f) {
    	return floweringTreeList.indexOf(f)!=-1;
    }
    public ArrayList<Observer> getFlowering() {
    	return observers;
    }

    

}//BloomReport
