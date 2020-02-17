import java.util.Random;

public class CakeLauncher {
	
	
	public static void main(String[] args) {
		Cake[] bake = new Cake[20];
		Random r = new Random();
		for (int i = 0; i < bake.length; i++) {
			if(r.nextBoolean()) {
				
				int quantity = r.nextInt(5)+1;
				bake[i] = new readyMadeCake(""+i, 3 , quantity);
			}
			else {
				double weight = r.nextDouble()*4;
				bake[i] = new orderCake(""+i, 4 , weight);
			}
		}
		//3: Display the total price for all types of cakes;
		for (int i = 0; i < bake.length; i++) {
			System.out.println(bake[i].calcPrice());
		}
		//4: Display the total price and the quantity sold for ready made cakes
		double totalPrice = 0;
		int totalQuantity = 0;
		for (int i = 0; i < bake.length; i++) {
			if(bake[i] instanceof readyMadeCake) {
				totalPrice = totalPrice + bake[i].calcPrice();
				totalQuantity = totalQuantity + bake[i].getQuantity();
			}
		}
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Total Quantity: " + totalQuantity);
		//5: Display the information for the cake that has been sold for the highest price
		double highestPrice = 0;
		for (int i = 0; i < bake.length; i++) {
			if(highestPrice<bake[i].calcPrice()) {
				highestPrice = bake[i].calcPrice();
			}
		}
		System.out.println("Highest Priced Cake: "+ highestPrice);
	}

}