public class DList {

	protected int size; //number of elements
	protected DNode header, trailer; //sentinels
	
	//Constructor
	public DList(){
		size = 0;
		header = new DNode(null, null, null);/*Create header*/
		trailer = new DNode(null, header, null); /*Create Trailer*/
		header.setNext(trailer); /*Let header and trailer point to each other*/
	}
	//Return the number of elements in the list
	public int size(){
		return size;
	}
	//Return whether the list is empty
	public boolean isEmpty(){
		return (size == 0);
	}
	//Return the first node of the list
	public DNode getFirst() throws IllegalStateException{
		if (isEmpty()) throw new IllegalStateException("List is Empty!");
		return header.getNext();
	}
	//Return the last node of the list
	public DNode getLast() throws IllegalStateException{
		if (isEmpty()) throw new IllegalStateException("List is Empty!");
		return trailer.getPrev();
	}
	//Return the node before the given node v. An error occurs if v is the header
	public DNode getPrev(DNode v) throws IllegalStateException{
		if (v == header) throw new IllegalStateException("Cannot move back past the header of the list!");
		return v.getPrev();
	}
	//Return the node after the given node v. An error occurs if v is the trailer
	public DNode getNext(DNode v) throws IllegalStateException{
		if (v == trailer) throw new IllegalStateException("Cannot move forward past the trailer of the list!");
		return v.getNext();
	}
	
	//Insert a given node z before the given node v. An error occurs if v is the header
	public void addBefore(DNode v, DNode z) throws IllegalArgumentException{
		DNode u = getPrev(v); //may throw an exception
		z.setPrev(u);
		z.setNext(v);
		v.setPrev(z);
		u.setNext(z);
		size++;
	}
	//Insert a given node z after the given node v. An error occurs if v is the trailer
	public void addAfter(DNode v, DNode z){
		DNode w = getNext(v);
		z.setPrev(v);
		z.setNext(w);
		w.setPrev(z);
		v.setNext(z);
		size++;
	}
	//Insert given node at the head of list
	public void addFirst(DNode v){
		addAfter(header, v);
	}
	//Insert given node at the tail of the list
	public void addLast(DNode v){
		addBefore(trailer, v);
	}
	//Remove given node v from the list. An error occurs if v is the header or trailer
	public void remove(DNode v){
		DNode u = getPrev(v); //may throw exception
		DNode w = getNext(v); //may throw exception
		u.setNext(w);
		w.setPrev(u);
		v.setNext(null);
		v.setPrev(null);
		size--;
	}
	
	//Returns whether a given node has a previous node	
	public boolean hasPrev(DNode v){
		return v!= header;
	}
	//Returns whether a given node has a next node 	
	public boolean hasNext(DNode v){
		return v!= trailer;
	}
	
	public String toString(){
		String s = "[";
		DNode v = header.getNext();
		while(v!=trailer){
			s += v.getElement();
			v = v.getNext();
			if (v!=trailer)
				s += ",";
		}
		s += "]";
		return s;
		}
}
	
