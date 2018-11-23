import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class BumblebeeTest extends TestCase{

    public Bumblebee mireille = new Bumblebee();
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
    public void testUpdate(){
        mireille.update(treeList);
        ArrayList<FloweringTrees> bTrees = mireille.getTreesInBloom();
        assertEquals(treeList, bTrees);
    }

    @Test
    public void testSubscribe(){
    	mireille.subscribe(report);
    	assertTrue(report.isSubscriber(mireille));
    }

    @Test
    public void testUnsubscribe(){
    	mireille.unsubscribe(report);
    	assertFalse(report.isSubscriber(mireille));
    }

    @Test
    public void testGetTreesInBloom(){
    	
    }

}