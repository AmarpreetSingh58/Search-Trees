package searchtrees;
import java.util.Random;

public class Test_Analysis_Random {
	
	public static int[] genRandomIntArray() {
		int num = 100000;
		int []arr = new int[num];
		Random r = new Random();
		
		for(int i =0; i<num;i++)
			arr[i] = r.nextInt(num)+1;
		
		return arr;
	}
	
	public static void runBST(int []insertInput,int []searchInput, int []deleteInput, int len) {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<>( );
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=0;i<len;i++)
			t.insert(insertInput[i]);
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<len;i++) {
		if(t.contains(searchInput[i])) {
			
		}
		}
		
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for( int i=0;i<len;i++)
	     {
	         t.remove(deleteInput[i]);
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	
	public static void runAVL(int []insertInput,int []searchInput, int []deleteInput, int len) {
		
		AVLTree<Integer> t = new AVLTree<>( );
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=0;i<len;i++) {
			t.insert(insertInput[i]);
			t.checkBalance();
		}
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<len;i++){
		if(t.contains(searchInput[i])) {}
		}
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for( int i=0;i<len;i++)
	     {
	         t.remove(deleteInput[i]);
	         t.checkBalance();
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	
	public static void runRBBST(int []insertInput,int []searchInput, int []deleteInput, int len) {
		
		RedBlackBST<Integer, Integer> t = new RedBlackBST<Integer, Integer>();
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=1;i<len;i++) {
			t.put(i,insertInput[i]);
		}
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<len;i++){
		if(t.get(searchInput[i]) == null) {}
			//System.out.println("Key not found");
		}
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for(int i=0;i<len;i++)
	     {
	         t.delete(deleteInput[i]);
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	
	
	public static void runSplay(int []insertInput,int []searchInput, int []deleteInput, int len) {
		
		SplayTree<Integer> t = new SplayTree<Integer>( );
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=1;i<len;i++)
			t.insert(insertInput[i]);
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<len;i++){
		if(t.contains(searchInput[i])) {}
		}
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for( int i=0;i<len;i++)
	     {
	         t.remove(deleteInput[i]);
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100000;
		int []input_in = genRandomIntArray();
		int []input_search = genRandomIntArray();
		int []input_delete = genRandomIntArray();
		
		System.out.println("Running BST");
		runBST(input_in,input_search,input_delete,num);
		System.out.println("\n\nRunning AVL");
		runAVL(input_in,input_search,input_delete,num);
		System.out.println("Running Red Black BST");
		runRBBST(input_in,input_search,input_delete,num);
		System.out.println("\n\nRunning Splay");
		runSplay(input_in,input_search,input_delete,num);

	}

}
