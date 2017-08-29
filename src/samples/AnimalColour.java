package samples;

public class AnimalColour {
	
		String colour="white";  
		
		}  
		class Cat extends AnimalColour{  
			
		String colour="black";  
		void printColour(){  
		System.out.println(colour);//prints color of cat class  
		System.out.println(super.colour);//prints color of Animal class  
		}  
		} 
		