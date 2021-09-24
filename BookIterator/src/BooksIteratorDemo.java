
public class BooksIteratorDemo {

	public static void main(String[] args) {
	  BookStation bookStation = new BookStation();

	  
	  System.out.println("Book names and authors \n");
	  
	  
	      for(Iterator iter = bookStation.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Book Name - author : " + name);
	      } 	
	   }
	
	
	
}
