public class ListNode{
  private String data;
  private ListNode next;

  public ListNode(String d){ }		// Default next should be null
  
  public ListNode(String d, ListNode n){ }
 
  public String toString(){ } 		// Return the string of the data 

  public String getData(){ } 		// Return the data
 
  public ListNode next(){ } 		// Return the next node
 
  public String setData(String newdata){ } 	// Replace data, with newdata, return the original data.
 
  public void setNext(ListNode n){ }	// Replace ListNode next
}
