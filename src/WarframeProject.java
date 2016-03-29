
import java.util.Scanner;
import java.util.Vector;

public class WarframeProject {
	
	static boolean isValidNumber(String rID) {
		//return true if characters are digits
        Boolean output = false;
        try{
            Integer.parseInt(rID);
            output = true;
        }
        catch(Exception ex){
            output = false;
        }
        return output;
	}
	
	public static void main(String[] args) {
		//instantiate variables and stuff
		Scanner scan = new Scanner(System.in);
		Vector<Frame> frames = new Vector<Frame>(); //Create the vector! Remember the scope!
		
		int choice = 0; //choice set to 0 so loop will start
				
		//create a menu.
		while(choice != 4){
			System.out.println("Enter choice and press \"ENTER\"\n"+
					"1: Add Warframe\n"+
					"2: Show Warframe Info\n"+
					"3: Remove Warframe\n"+
					"4: Exit");
			//Get Choice!
			choice = scan.nextInt();
			
			//Processing choice selection
			if(choice < 1 || choice > 4){
				System.out.println("Please re-read the menu options and select an appropriate value.");
			}			
			if(choice == 1) {
				System.out.println("Please Enter the Warframe name & type. (Note: Use _ in place of spaces in a name)");
				Frame newFrame = new Frame(scan.next(), scan.next());
				frames.addElement(newFrame); //put the frame in the Vector
				System.out.println(newFrame.showInfo()); //Show us your goodies, newFrame!
			}			
			if(choice == 2) {
				int totalElements = frames.size(); // checking to see if it's actually adding to the vector.
				System.out.println("Index size: " + frames.size()); //confirms we're getting somewhere.
				System.out.println("Showing warframe information:"); 
				for(int index=0; index<totalElements; index++){
					System.out.println(frames.get(index).showInfo()); //Show dat info!
				}
				System.out.println("");
			}
			if(choice == 3){
				System.out.println("Remove Warframe");
				System.out.println("Refer to Warframe Info to confirm ID");
				System.out.println("Please enter warframe ID you wish to remove:");
				int rID = scan.nextInt();
				frames.remove(rID); //I need to check for exceptions. Make sure people can't pull a Lunar and put a string into an int field.
				
				System.out.println("Results:");
				int totalElements = frames.size();
				for(int index=0; index<totalElements; index++){
					System.out.println(frames.get(index).showInfo()); //Show dat info!
				}
				System.out.println("");//linebreak! Makes for nicer formatting in the console.
				
			}
			if(choice == 4){
				System.out.println("Operation complete. Goodbye.");
			}
		
		}
		
		//win at life.
	}

}
