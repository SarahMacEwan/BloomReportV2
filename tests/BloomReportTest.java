import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BloomReportTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	public void sendUpdates(){
	        ArrayList<FloweringTrees> blooming = new ArrayList<FloweringTrees>();
	        for(Observer sub: observerList){
	            for(FloweringTrees tree: floweringTreeList){
	                if(tree.getBlossomState()) {
	                    blooming.add(tree);
	                }
	            }
	            sub.updates(blooming);
	        }
	
	   }
	@Test
    public void addFloweringTrees(FloweringTrees ... trees){
        for(FloweringTrees tree: trees){
            floweringTreeList.add(tree);
        }
    }
	@Test
    public void addSubscribers(Observer newSubscriber){
        observerList.add(newSubscriber);
    }
	@Test
    public void unsubscribe(Observer unsub){
        observerList.remove(unsub);
    }
	@Test
	    public void extinctPlant(FloweringTrees extTree){
	        floweringTreeList.remove(extTree);
	    }

}
