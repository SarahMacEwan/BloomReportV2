import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */

class TreeBlossomObserverTest {

	
	 	public static Dragonfly ursule;
	    public static TreeBlossomReport report;
		public static FloweringTree  franklin, blueMist, crabapple;
	    public static ArrayList<Bloomable> treeList;

	    private static void initializeTreeList(){
	        treeList = new ArrayList<Bloomable>();
	        treeList.add(franklin);
	        treeList.add(blueMist);
	        treeList.add(crabapple);
	    }
	
		@BeforeAll
		public static void setUp() {
			  ursule = new Dragonfly();
			  franklin = new FloweringTree("Franklin");
			  blueMist = new FloweringTree("BlueMist");
			  crabapple = new FloweringTree("Crabapple");		
			  report = new TreeBlossomReport();	
			  report.addReportItems(franklin, blueMist);
			  initializeTreeList();
		}
		
	    @Test
	    void testGetTreesInBloom0(){	
	    	assertEquals(null,ursule.getTreesInBloom());
	    }
	    
	    @Test
	    void testGetTreesInBloom1() {
	    	ursule.subscribe(report);
	    	assertEquals(null, ursule.getTreesInBloom());
	    }
	    
	    @Test
	    void testGetTreesInBloom2() {
	    	franklin.setBloomState(true);
	    	ArrayList<Bloomable> inBloom = new ArrayList<>();
	    	inBloom.add(franklin);
	    	assertTrue(inBloom.equals(ursule.getTreesInBloom()));
	    }
  
	    @Test
	    void testUpdate(){
	        ursule.update(treeList);
	        ArrayList<Bloomable> bTrees = ursule.getTreesInBloom();
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

	 

}
