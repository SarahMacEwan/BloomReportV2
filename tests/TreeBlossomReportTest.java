/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TreeBlossomReportTest {

	   public static TreeBlossomReport report;
	   public static FloweringTree  frank, blueMist,crab,cherry;
	   public static BloomObserver observer1, observer2,observer3;
	  
	   @BeforeAll
	   public static void setUp() {
		  frank = new FloweringTree("Franklin");
		  blueMist = new FloweringTree("BlueMist");
		  crab = new FloweringTree("Crabapple");
		  cherry = new FloweringTree("Cherry");
		  report = new TreeBlossomReport();	
		  report.addReportItems(frank, blueMist);
		  observer1=new Bumblebee();
		  observer2=new Dragonfly();
		  observer3=new Bumblebee();
	   }
	   
	   @Test
	   void testIsSubscriber() {
		  assertFalse(report.isSubscriber(observer1));
	   }
	   
	   @Test
	   void testInFloweringTreeList0() {
		   assertTrue(report.inFloweringTreeList(frank));
	   }
	   
	   @Test
	   void testInFloweringTreeList1() {
		   assertFalse(report.inFloweringTreeList(crab));
	   }
	   
		@Test
	   void addReportItems(){
			report.addReportItems(crab);
			assertTrue(report.inFloweringTreeList(crab));
	   }
		
		@Test
	    void testRemoveReportItem(){
			report.removeReportItem(crab);
			assertFalse(report.inFloweringTreeList(crab));
	    }
	
		@Test
	    void testAddSubscriber(){
			report.addSubscriber(observer2);
			assertTrue(report.isSubscriber(observer2));
	    }
		
		@Test
	    void testRemoveSubscriber(){
			report.removeSubscriber(observer2);
			assertFalse(report.isSubscriber(observer2));
	    }
		
		@Test
		void testNotifySubscribers(){
			report.addReportItems(cherry);
			report.addSubscriber(observer3);
			cherry.setBloomState(true);
			frank.setBloomState(true);
			ArrayList<Bloomable> treesInBloom=new ArrayList<>();
			treesInBloom.add(cherry);
			treesInBloom.add(frank);
			report.notifySubscribers();
			assertTrue(treesInBloom.containsAll(observer3.getTreesInBloom()));
		}
}//BloomReportTest
