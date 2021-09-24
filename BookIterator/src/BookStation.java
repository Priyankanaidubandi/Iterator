
public class BookStation implements BookContainer {
	
	 public String books[] = {"The Coalition Years - Pranab Mukherjee" , "Two Lives-Vikram Seth" ,"India 2020: A Vision for the New Millennium - APJ Abdul Kalam" };

	@Override
	public Iterator getIterator() {
		 
		return new BookIterator();
	}

	private class BookIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < books.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return books[index++];
	         }
	         return null;
	      }		
	   }
	
	
	
}
