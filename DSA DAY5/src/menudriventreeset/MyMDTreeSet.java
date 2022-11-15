package menudriventreeset;

import java.util.Scanner;

public class MyMDTreeSet {

	public static void main(String[] args) {
		
		

		
		Scanner Sc =new Scanner(System.in);
		MyTreeTest MTT =new MyTreeTest();
		int choice =0;
		
		
		do {
			
			System.out.println("1.Insert the Element");
			System.out.println("2.Delete An element");
			System.out.println("3. InOrder Traversal");
			System.out.println("4. PreOrder Traversal");
			System.out.println("5. PostOrder Traversal");
			System.out.println("6. Exit");
			System.out.println("Enter choice : ");
			
			choice = Sc.nextInt();
			
			
			switch(choice){
			             case 1 :
			            	 MTT.Insert();break;
			            	 
			             case 3: 
			            	 MTT.Inorder(MTT.root);break;
			            	 
			             case 6 : break;
			}
			
		}
		while(choice!=6);
		

	}
	
	
}
class MyTreeTest{
	
	ChemicalElements root =null;
	ChemicalElements temp;
	
	
void Insert() {
	Create();
	if (root==null) {
	       root=temp;
	       }
	else {
		Search(root);
	}
	
	
}

void Create() {
	
	System.out.println("Enter the automic number of an element");
	Scanner scan =new Scanner (System.in);
	
	int tempAutomicNumber = scan.nextInt();
	
	temp =new ChemicalElements();
	
	temp.AtomicNum=tempAutomicNumber;
	
	
	temp.left =null;
	temp.Right=null;
	
	
		
}

void Search(ChemicalElements CE){
	
	if((temp.AtomicNum > CE.AtomicNum)  &&  CE.Right==null) {
	     CE.Right =temp;
	}else
	if((temp.AtomicNum > CE.AtomicNum)  &&  CE.Right!=null) {
		Search(CE.Right);
	}
	else if((temp.AtomicNum < CE.AtomicNum)  && CE.left==null) {
		CE.left =temp;
	}else if((temp.AtomicNum < CE.AtomicNum)  && CE.left!=null) {
		Search(CE.left);
	}
}

void Inorder(ChemicalElements ce) {
	if(root == null) {
		System.out.println("Tree is empty nothing to show");
		return;
	}
	if(ce.left!=null)
		Inorder(ce.left);
		
		System.out.println("DATA  :  "+ce);
		
	if(ce.Right!=null)
		Inorder(ce.Right);
}
}


