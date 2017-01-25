
public class MeatSeller extends Thread {
	
	int sellItem=0;
	String[] productsArray = {"banan", "apple", "anannas", "berries", "orange"};
	
	public String takeProduct() {
		
		String productToSell = null;
		if ( sellItem < productsArray.length ) {
			productToSell = productsArray[sellItem];
			sellItem++;
		} else {
			System.out.println("no products, sorry.");
			productToSell=null;
		}
		return productToSell;
	}

	@Override
	public synchronized void run() {
		try {
			selProduct();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selProduct() throws Exception  {
		String pr = takeProduct();
		
		if ( pr != null ) {
			System.out.println(String.format("I'm packing %s product.", pr));
			Thread.sleep(5000);
			System.out.println(String.format("Sell %s completed! Ready for next client.", pr));
		}
	}
}
