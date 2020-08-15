package searchtrees;
import java.util.Random;
public class Test_Analysis {
	
	public static void runBST() {
		
		BinarySearchTree<Integer> t = new BinarySearchTree<>( );
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=1;i<=100000;i++)
		t.insert(i);
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		Random r = new Random();
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<=100000;i++){
		if(t.contains(r.nextInt(100000)+1)) {}
		else
			System.out.println("Key not found");
		}
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for( int i = 100000; i >0; i--)
	     {
	         t.remove( i );
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	
	public static void runAVL() {
		
		AVLTree<Integer> t = new AVLTree<>( );
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=1;i<=100000;i++) {
			t.insert(i);
			t.checkBalance();
		}
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		Random r = new Random();
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<=100000;i++){
		if(t.contains(r.nextInt(100000)+1)) {}
		else
			System.out.println("Key not found");
		}
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for( int i = 100000; i >0; i--)
	     {
	         t.remove( i );
	         t.checkBalance();
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	
	public static void runRBBST() {
		
		RedBlackBST<Integer, Integer> t = new RedBlackBST<Integer, Integer>();
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=1;i<=100000;i++) {
			t.put(i, i);
		}
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		Random r = new Random();
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<=100000;i++){
		if(t.get(r.nextInt(1000)+1) == null)
			System.out.println("Key not found");
		}
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for( int i = 100000; i >0; i--)
	     {
	         t.delete(i);
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	
	
	public static void runSplay() {
		
		SplayTree<Integer> t = new SplayTree<Integer>( );
		long start,end;
		
		System.out.println("Inserting.....");
		start = System.nanoTime();
		for(int i=1;i<=100000;i++)
		t.insert(i);
		end=System.nanoTime();
		
		System.out.println("Average Time for insertion : "+(end-start)/100000);
		
		Random r = new Random();
		
		System.out.println("Searching.....");
		start = System.nanoTime();
		for(int i =0; i<=100000;i++){
		if(t.contains(r.nextInt(100000)+1)) {}
		else
			System.out.println("Key not found");
		}
		end = System.nanoTime();
		
		System.out.println("Average Time for random search : "+(end-start)/100000);
		
		System.out.println("Deleting elements....");
		start = System.nanoTime();
		for( int i = 100000; i >0; i--)
	     {
	         t.remove( i );
	     }
		end = System.nanoTime();
		
		System.out.println("Average Time for deletion : "+(end-start)/100000);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Running Binary Search tree:");
		runBST();
		System.out.println("\n\n Running AVL Tree:");
		runAVL();
		System.out.println("\n\n Running Red Black BST:");
		runRBBST();
		System.out.println("\n\n Running Splay Tree:");
		runSplay();
			

	}

}
