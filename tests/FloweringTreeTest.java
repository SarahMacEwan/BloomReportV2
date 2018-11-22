import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FloweringTreeTest {

	FloweringTree ft=new FloweringTree("Franklin");
	
	@Test
    void testGetName(){
       assertEquals("Franklin",ft.getName());
    }
	@Test
    void testGetBlossomState(){
       assertEquals(false, ft.getBlossomState());
    }

	@Test
    void testSetBlossomState(){
		boolean state=true;
		ft.setBlossomState(state, new BloomReport());
		assertEquals(state, ft.getBlossomState());
    }
}//FloweringTreeTest
