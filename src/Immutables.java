import java.util.Date;


public final class Immutables {

	/**
	 * @param args
	 */
	private Date date;
	
	Immutables(){
			
	}
	
	public Date getDate(){
		Date d= new Date(this.date.getTime());
		return d;
	}
	
	public static void main(String[] args) {
			
	}

}
