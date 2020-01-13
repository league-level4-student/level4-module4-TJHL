package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EncapsulateDataTest {
	
	EncapsulateTheData tester = new EncapsulateTheData();
	
//	assertEquals(A,tester.QQQQQQQQ);
	
	@Test
	public void testItemsRecived() {
		tester.setItemsReceived(4);
		assertEquals(4,tester.getItemsReceived());
		tester.setItemsReceived(0);
		assertEquals(0,tester.getItemsReceived());
		tester.setItemsReceived(-4);
		assertEquals(0,tester.getItemsReceived());
	}
	
	@Test
	public void testDegreesTurned() {
		tester.setDegreesTurned(3);
		assertEquals(3,tester.getDegreesTurned());
		tester.setDegreesTurned(720);
		assertEquals(0,tester.getDegreesTurned());
		tester.setDegreesTurned(-25);
		assertEquals(335,tester.getDegreesTurned());
	}
	
	@Test
	public void testNomenClature() {
		tester.setNomenclature("");
		assertEquals(" ",tester.getNomenclature());
		tester.setNomenclature("you better not");
		assertEquals("you better not",tester.getNomenclature());
		
	}
	
	@Test
	public void testMemberObj() {
		tester.setMemberObj(new Object());
		assertEquals(new Object(),tester.getMemberObj());
		tester.setMemberObj("gfhgfghfhgf");
		assertEquals(new Object(),tester.getMemberObj());
	}
}
