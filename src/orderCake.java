
public class orderCake extends Cake {

	double weight;
	public orderCake(String n, double r, double w) {
		super(n, r);
		weight = w;
	}

	public double calcPrice() {
		return rate*weight;
	}

	public int getQuantity() {
		return -1;
	}
}