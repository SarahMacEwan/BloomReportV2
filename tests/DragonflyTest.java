import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DragonflyTest {

	
	 	public Dragonfly ursule = new Dragonfly();
	    public BloomReport report = new BloomReport();
	    public FloweringTree frank = new FloweringTree("Franklin");
	    public FloweringTree bms = new FloweringTree("BlueMist");
	    public FloweringTree crab = new FloweringTree("Crabapple");
	    public ArrayList<FloweringTrees> treeList = initializeTreeList();

	    private ArrayList<FloweringTrees> initializeTreeList(){
	        ArrayList<FloweringTrees> treeList = new ArrayList<FloweringTrees>();
	        treeList.add(frank);
	        treeList.add(bms);
	        treeList.add(crab);
	        return treeList;
	    }

	    @Test
	    void testUpdate(){
	        ursule.update(treeList);
	        ArrayList<FloweringTrees> bTrees = ursule.getTreesInBloom();
	        assertEquals(treeList, bTrees);
	    }

	    @Test
	    void testSubscribe(){
	    	ursule.subscribe(report);
	    	assertTrue(report.isSubscriber(ursule));
	    }

	    @Test
	    void testUnsubscribe(){
	    	ursule.unsubscribe(report);
	    	assertFalse(report.isSubscriber(ursule));
	    }

	    @Test
	    void testGetTreesInBloom(){
	    	
	    }

}
