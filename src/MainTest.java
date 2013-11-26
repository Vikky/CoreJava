
public class MainTest{
	Object a[][];
	
	MainTest(){
		this.a=new Object[21][2];
	}
	
	public void put(HashMapImpl key, Object val){
		int length=a.length;
		int hash=key.hashCode()%length;
		
		if((a[hash][0]==null)){
			a[hash][0]=key;
			a[hash][1]=val;
		}else{
			if((a[hash][0].equals(key))){
				if(! ((a[hash][1]).equals(val)) ){
					a[hash][1]=val;
				}
				else{
					//collision resolution 					
				}
			}			
		}		
	}
	
	public Object get(HashMapImpl key){
		int length=a.length;
		int hash=key.hashCode()%length;
		
		if( (a[hash][0]).equals(key) ){
			return a[hash][1];
		}else{
			// resolve collision and iterate through, check key using eqauls and return val;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		HashMapImpl obj=new HashMapImpl("ABC");
		HashMapImpl obj1=new HashMapImpl("CBA");
		HashMapImpl obj2=new HashMapImpl("BCD");
		
		System.out.println(obj.equals("ABC"));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
	}
	
}
