import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FloweringTreeTest {
	
	public static BloomReport report1, report2;
	public static FloweringTree ft=new FloweringTree("Franklin");
	
	@BeforeAll
	public static void setUp() {
		report1=new TreeBlossomReport();
		report2=new TreeBlossomReport();
	}
	
	@Test
	void testNumReports() {
		assertEquals(0,ft.numReports());
	}
	
	@Test
	void testAddReport0(){
		boolean before=ft.hasRefToReport(report1);
		ft.addReport(report1);
		boolean after=ft.hasRefToReport(report1);
		assertTrue(before==false && after==true);	
	}
	@Test
	void testAddReport1() {
		boolean before=ft.hasRefToReport(report1);
		int sizeBefore=ft.numReports();
		ft.addReport(report1);
		boolean after=ft.hasRefToReport(report1);
		int sizeAfter=ft.numReports();
		assertTrue(before==true && after==true && sizeBefore==sizeAfter);
	}
	
	@Test
	void testAddReport2() {
		boolean before=ft.hasRefToReport(null);
		int sizeBefore=ft.numReports();
		ft.addReport(null);
		boolean after=ft.hasRefToReport(null);
		int sizeAfter=ft.numReports();
		assertTrue(before==false && after==false && sizeBefore==sizeAfter);
	}
	
	@Test
	void testRemoveReport(){
		boolean before=ft.hasRefToReport(report1);
		ft.removeReport(report1);
		boolean after=ft.hasRefToReport(report1);
		assertTrue(before==true && after==false);	
	}
	
	
	@Test
    void testGetName0(){
       assertEquals("Franklin",ft.getName());
    }
	
	@Test
    void testGetName1(){
       assertFalse("Mark"==ft.getName());
    }
	
	@Test
    void testGetName2(){
       assertFalse(null==ft.getName());
    }
	
	@Test
    void testGetBloomState0(){
       assertEquals(false, ft.getBloomState());
    }
	
	@Test
    void testGetBloomState1(){
       assertTrue(false==ft.getBloomState());
    }
	
	@Test
    void testGetBloomState2(){
       assertFalse(true==ft.getBloomState());
    }

	@Test
    void testSetBloomState0(){
		boolean state=true;
		ft.setBloomState(state);
		assertEquals(state, ft.getBloomState());
    }
	
	@Test
    void testSetBloomState1(){
		boolean state=false;
		ft.setBloomState(state);
		assertFalse(true==ft.getBloomState());
    }
	
}//FloweringTreeTest
