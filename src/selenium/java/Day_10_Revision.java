package selenium.java;

public class Day_10_Revision {

	public static void main(String[] args) {

		Human h1 = new Human(); // Obj 1 // allocate space in memory
		h1.gender = "Female";
		h1.name = "Pooja";
		h1.gender();
		h1.name();

		Human h2 = new Human(); // Obj 2
		h2.gender = "Male";
		
		
		Human h3 = new Human(); // Obj 2
		h2.gender = "Male";
		h2.gender="Female";
		h2.name = "Pankaj";
		
		Human h4 = new Human(); // Obj 2
		h4.gender = "Male";
		h4.name = "Pankaj";
		h4.isMarried= false;
		h4.maritialStatus();
		
		
		BuyProduct bp = new BuyProduct();
		bp.custName="Rahul";
		bp.prodName="Laptop";
		bp.qty=1;
		bp.state="Uttar Pradesh";
		bp.price=40000;
		bp.buyProduct();
		
		BuyProduct bp1 = new BuyProduct();
		bp1.custName="Yojna";
		bp1.prodName="TV";
		bp1.qty=1;
		bp1.state="";
		bp1.city="Gurugram";
		bp1.price=40000;
		bp1.buyProduct1();
	}

}
