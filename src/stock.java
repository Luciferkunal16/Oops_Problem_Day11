package Line_Conversion;

public class stock {
	String shareName;
	int numOfShare;
	int sharePrice;
	
	
	public stock(String sName,int nOfShare, int sPrice) {
		shareName=sName;
		numOfShare=nOfShare;
		sharePrice=sPrice;
		
	}
	public int valueOfStock() {
		return numOfShare*sharePrice;
	}
	
	public String toString() {
		return "Total Share Value of stock "+shareName+" is "+numOfShare*sharePrice;
	}
	

}
