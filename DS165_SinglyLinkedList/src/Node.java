public class Node {
	
	private String element;
	private Node next;
	
	public Node(String e, Node n){ //Create a node with given element and next node
		element = e;
		next = n;
	}
	
	public String getElement(){
		return element;
	}
	
	public Node getNext(){
		return next;
	}
	
	//Modifier Methods
	public void setElement(String newElem){ //Set the element of this node
		element = newElem;
	}
	
	public void setNext(Node newNext){ //Set the next node of this node
		next = newNext;
	}
	
	
}
