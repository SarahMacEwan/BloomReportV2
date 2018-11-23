import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FloweringTreeTest {

	FloweringTree ft=new FloweringTree("Franklin");
	
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
