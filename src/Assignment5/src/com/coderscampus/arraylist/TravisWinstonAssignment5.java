package Assignment5.src.com.coderscampus.arraylist;

public class TravisWinstonAssignment5 {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		//Edit i<"HERE" to try different size lists
		for (int i=0; i<50; i++) {
			myCustomList.add("customItem: " + i);
		}
		
		//Read back how many items are in there
		System.out.println("Custom Size = " + myCustomList.getSize());
		
		//Read all the elements
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}
	}
}
