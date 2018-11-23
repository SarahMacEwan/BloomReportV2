/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TreeBlossomReportTest {

	   public static TreeBlossomReport report;
	   public static FloweringTree  frank;
	   public static FloweringTree  bms;
	   public static FloweringTree crab;
	   public static BloomObserver observer1, observer2;
	  
	   @BeforeAll
	   public static void setUp() {
		  frank = new FloweringTree("Franklin");
		  bms = new FloweringTree("BlueMist");
		  crab = new FloweringTree("Crabapple");		
		  report = new TreeBlossomReport();	
		  report.addReportItems(frank, bms);
		  observer1=new Bumblebee();
		  observer2=new Dragonfly();
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
	   void addFloweringTrees(){
			report.addReportItems(crab);
			assertTrue(report.inFloweringTreeList(crab));
	   }
		
		@Test
	    void testRemoveFloweringTrees(){
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
		void notifySubscribers(){
		  
		 }
}//BloomReportTest
