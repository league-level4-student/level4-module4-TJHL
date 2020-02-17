
public class readyMadeCake extends Cake{

	private int quantitiy;
	public readyMadeCake(String n, double r, int q) {
		super(n, r);
		quantitiy = q;

	}

	public double calcPrice() {
		return rate*quantitiy;
	}
	
	public int getQuantity(){
		return quantitiy;
	}

}