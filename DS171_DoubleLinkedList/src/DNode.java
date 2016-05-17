public class DNode {
	
	protected String element; //String element stored by node
	protected DNode next, prev; //pointers to next and previous nodes
	
	//Constructor
	public DNode(String e, DNode n, DNode p){
		element = e;
		next = n;
		prev = p;
	}
	
	public String getElement(){
		return element;
	}
	
	public DNode getNext(){
		return next;
	}
	
	public DNode getPrev(){
		return prev;
	}
	
	public void setElement(String newElem){
		element = newElem;
	}
	
	public void setNext(DNode newNext){
		next = newNext;
	}
	
	public void setPrev(DNode newPrev){
		prev = newPrev;
	}
	
}
