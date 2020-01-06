package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncapsulateDataTest {

	public static void main(String[] args) {	
	}
	
	public void test() {
		EncapsulateTheData.setItemsReceived(-4);
		System.out.println(EncapsulateTheData.getItemsReceived());
	}
}
