package AbstractInerphase1;

public class Test {

	public static void main(String[] args) {
		HDFC hb= new HDFC();
		
		hb.credit();
		hb.debit();
		hb.loan();
		
		Bank b=new HDFC();
		b.credit();
		b.debit();
		b.loan();

	}

}
 