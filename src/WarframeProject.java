import java.util.Scanner;
import java.util.Vector;

class Frames {
	protected String name;
	protected String type;

	private static int count = 0;
	private int id;

	public Frames(String name, String type) {
		id = count;
		count++;
		this.name = name;
		this.type = type;
	}

	public String showInfo() {
		// System.out.println(id + ": " + name + " " + type); //This is a
		// inefficient way to do this.

		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name).append(" - ").append(type);
		return sb.toString();
	}

}

public class WarframeProject {
	public static void main(String[] args) {
		//instantiate variables and stuff
		Scanner scan = new Scanner(System.in);
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
				System.out.println("This is where we will end up adding warframe information!");
				Vector<Frames> frames = new Vector<Frames>();
				frames.addElement(new Frames(scan.next(), scan.next()));
				System.out.println();
			}			
			if(choice == 2) {
				System.out.println("Showing warframe information."); 
			}
			if(choice == 3){
				System.out.println("Remove warframe");
			}
			if(choice == 4){
				System.out.println("Operation complete. Goodbye.");
			}
		
		}
		
		//win at life.
	}

}
