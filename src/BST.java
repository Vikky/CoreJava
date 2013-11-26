
public class BST {

	Tree tree=new Tree();
	public static void main(String[] args) {
		
		
		BST obj=new BST();
		
		for(int i=0; i<10 ;i++){
			obj.tree.add(obj.tree, (int)(Math.random()*100) );
		}
		
		//tree.inorder(tree);
		
		
	}
		
}





