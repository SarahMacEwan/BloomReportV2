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
    void testGetBlossomState0(){
       assertEquals(false, ft.getBlossomState());
    }
	
	@Test
    void testGetBlossomState1(){
       assertTrue(false==ft.getBlossomState());
    }
	
	@Test
    void testGetBlossomState2(){
       assertFalse(true==ft.getBlossomState());
    }

	@Test
    void testSetBlossomState(){
		boolean state=true;
		ft.setBlossomState(state, new BloomReport());
		assertEquals(state, ft.getBlossomState());
    }
	
}//FloweringTreeTest
