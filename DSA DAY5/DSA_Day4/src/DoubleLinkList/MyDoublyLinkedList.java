package DoubleLinkList;

import mylikedlist.Kite;

public class MyDoublyLinkedList {

	    public static void main(String[] args) {

	    	KITE K1= new KITE("Red" , "Rushi",90,true);
	    	KITE K2= new KITE("yellow" , "yash",100,true);
	    	KITE K3= new KITE("Black" , "Sanjay",70,true);
	    	KITE K4= new KITE("White" , "Sumit",150,true);
	    	KITE K5= new KITE("Blue" , "Akash",120,true);
	    	KITE K6= new KITE("pink" , "Gaurav",200,true);
	          

	        DoublyLinkedList DLL =new DoublyLinkedList();
	          
	          DLL.show();
	          
	          System.out.println("\n-------ADDING KITES IN LIST  ---------");
	          DLL.Addkite(K1);
	          DLL.Addkite(K2);
	          DLL.Addkite(K3);
	          DLL.Addkite(K4);
	          System.out.println("\n-------------SHOWING ADDED LIST----------------");
	          DLL.show();
	       
	         System.out.println("\n-------------INSERTING NEW KITE-------------");
	         
	          DLL.InsertKite(K3, K5);
	          
	          System.out.println("\n::::::::::::   SHOWING INSERTED KITE   :::::::::::");
	          DLL.show();
	          
	          System.out.println("<<<<<<       Deleting the Kite     >>>>>>>>>");
	          
	          DLL.DeleteKite(K1);
	          
	          System.out.println( ":::::::      Showing list after delete Opration   ::::::::");
	          
	          DLL.show();
}
}
 class DoublyLinkedList{
	
	  KITE ptr =null;
	  KITE Start =null;
void Addkite(KITE newKite) {
	
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
		 newKite.next=null;
		 System.out.println("Kite Added at 2nd position");
		 
	 }
	 else {
		 ptr=Start.next;
		 
		 while(ptr.next!=null) {
			 ptr=ptr.next;
			 
		 }
		 System.out.println("Adding Internal Kites");
		 ptr.next=newKite;
		 newKite.prev=ptr;
		 newKite.next=null;
		 
	 }
	 
	 
}


void show() {
	
	if (Start==null) {
		System.out.println("List is empty");
	}
	if(Start!=null) {
		ptr= Start;
		while(ptr!=null) {
			System.out.println(ptr);
			ptr=ptr.next;
		}
	}
}


void InsertKite(KITE AddBeforeKite , KITE KiteToAdd) {
	  boolean Found =false;
	if(Start==null) {
		System.out.println("List is empty.....Cant Add kite");
	}
	else if(Start.next==null) {
		System.out.println("only one Kite present in List");
		KiteToAdd.next = Start;
		KiteToAdd.prev =null;
		Start.next=null;
		
	}
	else {
		ptr=Start;
		while (ptr!=null) {
			if(ptr==AddBeforeKite) {
				System.out.println("Found Given Kite  "+AddBeforeKite);
				  
				Found= true;
				break;
				
			}
			
			ptr=ptr.next;
		}
		
		if(Found==true) {
			System.out.println(" Inserting Kite "+KiteToAdd);
			KiteToAdd.prev=ptr.prev;
			KiteToAdd.prev.next=KiteToAdd;
			KiteToAdd.next=ptr;
			ptr.prev=KiteToAdd;
		}
		else if(Found!=true) {
			System.out.println("Cant find the given Kite");
		}
	}
}

void DeleteKite(KITE K) {
	boolean found = false;
	//ptr= Start;
    if (Start == null) {
    	System.out.println("List is empty ....no Kite available to delete");
    }
    else if (K.prev==null && K.next==null) {       //only one kite avilable in list
   // else if(ptr.prev==null) {
    	System.out .println("deleting only First Kite");
    	K=null;
    	
    }else if(K==Start ) {
    	System.out.println("Deleting First Kite");
    	
    	Start.next.prev=null;
    	Start.next =null;
    	
    	
    }
    else if(K.next==null && K.prev!=null) {
    	System.out.println("Deleting the Last Kite");
    	K.prev.next=null;
    	K.prev=null;
    	
    	
    }
  
    else {
    	ptr=Start.next;
    	while(ptr.next!=null) {
    		if(ptr==K ){
                System.out.println("Found Kite to Delete"+ptr);
                found = true;
                break;
    		}
    		ptr=ptr.next;
    	}
    	if(found==true) {
    		ptr.next.prev=ptr.prev;
    		ptr.prev.next=ptr.next;
    		ptr.prev=null;
    		ptr.next=null;
    	}
    	else if(found!= true) {
    		System.out.println("Kite not found for given owner ");
    	}
    }
}
  }

