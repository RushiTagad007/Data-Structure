package DoublyCircularLL;

import DoubleLinkList.KITE;

public class DcircularLL {

	public static void main(String[] args) {
		
		KITES K1= new KITES("Red" , "Rushi",90,true);
		KITES K2= new KITES("yellow" , "yash",100,true);
		KITES K3= new KITES("Black" , "Sanjay",70,true);
		KITES K4= new KITES("White" , "Sumit",150,true);
		KITES K5= new KITES("Blue" , "Akash",120,true);
		KITES K6= new KITES("pink" , "Gaurav",200,true);
          
          
    	MyDoublyCircularLL MDCLL =new MyDoublyCircularLL();
    	
    	
    	MDCLL.show();
    	MDCLL.Addkite(K1);
    	MDCLL.Addkite(K2);
    	MDCLL.Addkite(K3);
    	MDCLL.Addkite(K4);
    	
    	MDCLL.show();
    	
    	
    	
	}
}
class MyDoublyCircularLL{
	
	KITES ptr =null;
	KITES Start =null;
void Addkite(KITES newKite) {
	
	if(Start==null) {
		System.out.println("List Is empty ......Adding this as a first node");
		
		Start=newKite;
		Start.prev=null;  //byDefault it is null
		Start.next=null;  //By defaulrt it will also be null
	
		System.out.println("Added First Kite");
	}
	else   
	 if(Start.next==null) {
		 System.out.println("Adding Kite At 2nd Position");
		 Start.next=newKite;
		 newKite.prev=Start;
		 newKite.next=Start;
		 Start.prev=newKite;
		 
		 System.out.println("Kite Added at 2nd position");
		 
	 }
	 else {
		 ptr=Start.next;
		 
		 while(ptr.next!=Start) {
			 
			 ptr=ptr.next;
			 
		 }
		 System.out.println("Adding Internal Kites");
		 ptr.next=newKite;
		 newKite.prev=ptr;
		 newKite.next=Start;
		 Start.prev=newKite;
		 
	 }
	 
	 
}
void show() {
	boolean found=false;
	if (Start==null) {
		System.out.println("List is empty");
	}
	if(Start!=null) {
		ptr= Start;
		while(ptr!=null) {
			System.out.println("KITE is  : "+ptr+ "PRV : "+ptr.prev +" Next : "+ptr.next);
			
			if(ptr.next==Start) {
				found =true;
				break;
			}
			ptr=ptr.next;
		}
	}
}
	
}


