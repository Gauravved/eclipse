
public class Menu {
	private String starter[] = { "Tomato Soup         ", "Paneer Chilli         ", "Paneer 65         ",
			"Manchurian         ", "Veg kebab         " };
	private int starterPrice[] = { 70, 100, 110, 120, 90 };
	private String panner[] = { "Paneer Butter Masala", "Mutter Paneer      ", "Paneer Pasanda     ",
			"Palak Paneer     ", "Shahi Paneer      " };
	private int pannerPrice[] = { 180, 160, 220, 200, 230 };
	private String roti[] = { "Tandoor Roti          ", "Butter Roti            ", "Chapati             ",
			"Naan            ", "Butter Naan         ", "Jowar Roti      " };
	private int rotiPrice[] = { 25, 30, 20, 35, 40, 25 };
	private String rice[] = { "Plain Rice             ", "Steam Rice      ", "Jeera Rice        ",
			"Veg Pulav           ", "Daal Khichadi      " };
	private int ricePrice[] = { 100, 120, 150, 190, 120 };
	private String normalVegi[] = { "Veg Kolhapuri       ", "Dal Fry            ", "Dal Tadka          ",
			"Shev Bhaaji          ", "Kofta Curry        ", "Veg Bhuna Masala" };
	private int normalVegiPrice[] = { 180, 120, 140, 110, 140, 180 };
	private String nonVeg[] = { "Butter Chicken        ", "Chicken Curry         ", "Dum Chicken         ",
			"Fish Curry         " };
	private int nonVegPrice[] = { 150, 180, 190, 200 };
	private String desert[] = { "Ice-cream         ", "Gulabjamun         ", "Raas Malai         ",
			"Raasgulla         ", "Jalebi            ", "Basundi             " };
	private int desertPrice[] = { 40, 50, 60, 45, 50, 70 };
	private int orderQty[] = new int[50];
	private String order[] = new String[50];
	private int orderprice[] = new int[50];
	private int orderp[]=new int [50];
	private float total, cgst, sgst, final_tot;

	public Menu(int orderQty[], String[] order, int[] orderprice,int[] orderp, float total, float cgst, float sgst,
			float final_tot) {
		this.orderQty = orderQty;
		this.order = order;
		this.orderprice = orderprice;
		this.orderp=orderp;
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.final_tot = final_tot;
	}

	public int[] getOrderp() {
		return orderp;
	}

	public void setOrderp(int[] orderp) {
		this.orderp = orderp;
	}

	public int[] getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int[] orderQty) {
		this.orderQty = orderQty;
	}

	public String[] getStarter() {
		return starter;
	}

	public void setStarter(String[] starter) {
		this.starter = starter;
	}

	public int[] getStarterPrice() {
		return starterPrice;
	}

	public void setStarterPrice(int[] starterPrice) {
		this.starterPrice = starterPrice;
	}

	public String[] getPanner() {
		return panner;
	}

	public void setPanner(String[] panner) {
		this.panner = panner;
	}

	public int[] getPannerPrice() {
		return pannerPrice;
	}

	public void setPannerPrice(int[] pannerPrice) {
		this.pannerPrice = pannerPrice;
	}

	public String[] getRoti() {
		return roti;
	}

	public void setRoti(String[] roti) {
		this.roti = roti;
	}

	public int[] getRotiPrice() {
		return rotiPrice;
	}

	public void setRotiPrice(int[] rotiPrice) {
		this.rotiPrice = rotiPrice;
	}

	public String[] getRice() {
		return rice;
	}

	public void setRice(String[] rice) {
		this.rice = rice;
	}

	public int[] getRicePrice() {
		return ricePrice;
	}

	public void setRicePrice(int[] ricePrice) {
		this.ricePrice = ricePrice;
	}

	public String[] getNormalVegi() {
		return normalVegi;
	}

	public void setNormalVegi(String[] normalVegi) {
		this.normalVegi = normalVegi;
	}

	public int[] getNormalVegiPrice() {
		return normalVegiPrice;
	}

	public void setNormalVegiPrice(int[] normalVegiPrice) {
		this.normalVegiPrice = normalVegiPrice;
	}

	public String[] getNonVeg() {
		return nonVeg;
	}

	public void setNonVeg(String[] nonVeg) {
		this.nonVeg = nonVeg;
	}

	public int[] getNonVegPrice() {
		return nonVegPrice;
	}

	public void setNonVegPrice(int[] nonVegPrice) {
		this.nonVegPrice = nonVegPrice;
	}

	public String[] getDesert() {
		return desert;
	}

	public void setDesert(String[] desert) {
		this.desert = desert;
	}

	public int[] getDesertPrice() {
		return desertPrice;
	}

	public void setDesertPrice(int[] desertPrice) {
		this.desertPrice = desertPrice;
	}

	public String[] getOrder() {
		return order;
	}

	public void setOrder(String[] order) {
		this.order = order;
	}

	public int[] getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(int[] orderprice) {
		this.orderprice = orderprice;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getCgst() {
		return cgst;
	}

	public void setCgst(float cgst) {
		this.cgst = cgst;
	}

	public float getSgst() {
		return sgst;
	}

	public void setSgst(float sgst) {
		this.sgst = sgst;
	}

	public float getFinal_tot() {
		return final_tot;
	}

	public void setFinal_tot(float final_tot) {
		this.final_tot = final_tot;
	}

	public Menu() {

	}
}