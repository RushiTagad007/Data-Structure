package DoubleLinkList;

public class KITE {
	
	String colour;
	String owner ;
	int hight;
    boolean flaying;
    
   public  KITE next;
    public  KITE prev;
    
    
	public KITE() {
	
	}

	public KITE(String colour, String owner, int hight, boolean flaying) {
		super();
		this.colour = colour;
		this.owner = owner;
		this.hight = hight;
		this.flaying = flaying;
		
		
	}

	@Override
	public String toString() {
		return "Kite [colour=" + colour + ", owner=" + owner + ", hight=" + hight + ", flaying=" + flaying + "]";
	}


//
//	public static void main(String[] args) {
//		
//          Kite K1= new Kite("Red" , "Rushi",90,true);
//          Kite K2= new Kite("yellow" , "yash",100,true);
//          Kite K3= new Kite("Black" , "Sanjay",70,true);
//          Kite K4= new Kite("White" , "Sumit",150,true);
//          
//          
//          System.out.println("Kite K1  : "+K1);
//          System.out.println("Kite K2  : "+K2);
//          System.out.println("Kite K3  : "+K3);
//          System.out.println("Kite K4  : "+K4);
          

}

