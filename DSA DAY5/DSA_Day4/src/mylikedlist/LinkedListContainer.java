package mylikedlist;

import java.util.Iterator;

public class LinkedListContainer {

		public static void main(String[] args) {


	          Kite K1= new Kite("Red" , "Rushi",90,true);
	          Kite K2= new Kite("yellow" , "yash",100,true);
	          Kite K3= new Kite("Black" , "Sanjay",70,true);
	          Kite K4= new Kite("White" , "Sumit",150,true);
	          Kite K5= new Kite("Blue" , "Akash",120,true);
	          Kite K6= new Kite("pink" , "Gaurav",200,true);
	          
	          MyLinkedList ML = new MyLinkedList();
	          
	          ML.Show();
	          
	          ML.Add(K1);
	          ML.Add(K2);
	          ML.Add(K3);
	          ML.Add(K4);
	         // ML.Add(K6);
	          
	         ML.Show();
	         System.out.println("-----------------------------------------------");
	         ML.SearchForLength(150);
	         
	         

	         System.out.println("-----Search by name-------------------");
	         ML.SearchByOwner("Sumit");
	                 
	      
	         
		     System.out.println("-------------------------------------------------");
			       
	        ML.AddAtBegining(K5);
	         ML.Show();
	         
	         System.out.println("-----Search by name-------------------");
	         ML.SearchByOwner("Sumit");
	         

	         System.out.println("--------Delete------------------------");
	         
		     //   ML.DeleteByLength(120);
		         
		       //  ML.Show();
		         
		         System.out.println("------Modifying Length-------------");
		        
		       //  ML.ModifyLength(K3, 500);
	            // ML.Show();
	       
	         System.out.println("------Delete Kite-------------------");
	         
	      //   ML.DeleteKite(K3);
	        // ML.Show();
              
	         System.out.println("------Inserting kite---------");
	         
	         
	         ML.Show();
	         System.out.println("------------------------------");
	           ML.InsertBeforeKite(K4, K6); 
	           System.out.println("--------------------------");
	           ML.Show();
	}
}
class MyLinkedList{
	
	Kite Start;
	Kite ptr;
	Kite prv;
	
void Add(Kite newKite) {
		if(Start==null) {
			System.out.println("Adding new node +++++++");
			
			Start=newKite;
		Start.next=null ;   // (This is by default null ist ok if we dont write this line)
		}
			else {
				System.out.println("Adding the internal nodes");
				ptr=Start;
				while(ptr!=null) {
					
					System.out.println("Searching");
					prv = ptr;
				    ptr= ptr.next;    // ptr is getting null here
				}
				prv.next=newKite;
				newKite =null;   //		(This is by default null ist ok if we dont write this line)		
					
				}
				
			}
	
void Show() {
		if(Start == null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("list is not emplty");
			ptr=Start;
			while(ptr!=null) {
				System.out.println("DATa : "+ptr);
				ptr=ptr.next;
			}
			}
	}
	
void SearchForLength(int LengthOfString) {
		 boolean found = false; 
		if (Start == null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not Empty ........Searching For Length");
			ptr=Start;
			while (ptr!=null) {
				if(ptr.hight == LengthOfString) {
					System.out.println("Found  kite for length =  "+LengthOfString +" : "+ptr);
					found = true;
					break;
				}
			
				ptr=ptr.next;
			}
			if(found!= true) {
				System.out.println("Kite is not available for lenth : "+LengthOfString);
			}
			   
			//ptr=ptr.next;
		}
	}
//}
	
void SearchByOwner(String NewName) {
		boolean found=false; 
		if(Start==null) {
			System.out.println("list is Empty");
		}
		else {
			System.out.println(" Searching by name in list");
		    ptr=Start;
			while(ptr!=null)  {
				if(ptr.owner == NewName) {
					System.out.println("Kite found for owner : "+NewName +"Is  : "+ptr);
					found=true;
					
					break;
				}
				ptr=ptr.next;
			}
				if(found!=true) {
					System.out.println("Kite not found for Name : "+NewName);
				}	
			}	
		}
	
	
void AddAtBegining(Kite TopKite) {
		if(Start==null) {
			System.out.println("List is empty");
			System.out.println("Adding At first");
			Start=TopKite;
			TopKite.next=null;
		}
		else {
			System.out.println("List is not Empty Adding Kite on Top");
			//ptr=Start;
			//while(ptr!=null) {
				
			TopKite.next=Start;
			Start= TopKite;
			}
		}

void DeleteByLength(int Lengthtodelete) {
	   
	   if (Start==null) {
		   System.out.println("List is alredy Empty");
		   }
	  
	   else {
		   System.out.println("Searching kite of length  :   "+Lengthtodelete+" for Deleting");
		   ptr=Start;
		   
		   while(ptr!=null) {
			   
			 
			   if(Start.hight == Lengthtodelete) {
				   prv=Start;
				   
				   Start.next=null;
				   
			   }
			   
			   if(ptr.hight == Lengthtodelete) {
				   System.out.println("Deleting the  kite of length   :  "+Lengthtodelete+"   :   "+ptr);
				   prv.next=ptr.next;
				
			   }
			  
			  
	          prv=ptr;
			ptr=ptr.next;
		   }   
	   
}
}


void ModifyLength(Kite K ,int LengthToModify) {
	if(Start==null) {
		System.out.println("List is empty Nothing is there to update");
	}
	else {
		System.out.println("");
		ptr=Start;
		while(ptr!=null) {
			if(ptr == K  ) {
				System.out.println("Modifying the length of Kite  : "+ptr+" .....To lenth   "+LengthToModify);
			   ptr.hight = LengthToModify;
			   
			  System.out.println("Modified Kite is   :   "+ptr);
			   
			}
			ptr=ptr.next;
		}
	}
	
}







void DeleteKite(Kite Kt) {
	   boolean found =false;
	   if (Start==null) {
		   System.out.println("List is alredy Empty");
		   }
	   else {
		   System.out.println("Searching kite of length  :   "+Kt+" for Deleting");
		   ptr=Start;
		   while(ptr!=null) {
			   
			   if(ptr.next == Kt) {
				   System.out.println("Deleting the  kite of length   :  "+Kt+"   :   "+ptr);
				   found = true;
				   break;
				
			   }
	           prv=ptr;
			ptr=ptr.next;
		   }   
		   if(found == true) {
			   prv.next=ptr.next.next;
			   
		   }
	   }
}


void InsertBeforeKite (Kite k ,Kite KitetoInsert) {
	boolean found = false;
	
	if (Start == null) {
		System.out.println("List is empty .....Cant Insert The kite");
		
	}
	else if(Start==k) {
		AddAtBegining(KitetoInsert);
	}
	else {
	ptr=Start;
	  while(ptr!=null) {
		  
		  if (ptr==k) {
			  System.out.println("Imserting Kite ");
			  
			  found =true;
			  break;
			 
		  }
		  prv=ptr;
		  ptr=ptr.next;
	  }
	if(found==true) {
		 prv.next=KitetoInsert;
		KitetoInsert.next=ptr;
		System.out.println("Kite Adeed before kite");
	}
	else if (found!= true) {
		System.out.println("Kite not found");
	}
	}
}

}
		 
				   
			
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   /*
		   
			   //delkite.next=null;
			   //ptr=delkite.next;
			   }
		   //ptr=ptr.next.next;
			  // if(found!=true)
			 //  {
				  //ptr.next=null;
				  
			   
			   //delkite.next=null;
			   //ptr=delkite.next;
		  // }
	   }
	
            
	      }

			
		
		
	
	

*/