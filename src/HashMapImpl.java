import java.util.HashMap;

public class HashMapImpl {

	/**
	 * @param args
	 * @author vikky.agrawal
	 */
	
	private String prop;
	
	HashMapImpl(String prop){
		this.prop=prop;		
	}
	
	
	public String getProp() {
		return prop;
	}


	public void setProp(String prop) {
		this.prop = prop;
	}


	
	
	@Override
	public int hashCode(){
		String p=this.getProp();
		char c[]=p.toCharArray();
		int  num=0;
		try{
			for(char a:c){
				int i=(int)a;
				num+=i;
			}			
		}catch(Exception e){
			num=0;			
		}
		return num;
	}
	
	@Override
	public boolean equals(Object o){
		
		if(o instanceof HashMapImpl){
			if(((HashMapImpl) o).getProp().equals(this.getProp())){
				return true;
			}else{
				return false;
			}
		}		
		return false;
	}
	
}




