/**
* ListElement.java
/**

public class ListElement {
	private ListElement next;
	private int data;
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
	}
	
	public void setData (int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
}

/**
* LinkedList.java
/**
/**
 * 
 * @param data
 * an integer being stored in the node
 * @return
 * none
 *
 */


public class LinkedList extends ListElement {
 
	private ListElement head;
	private int size;
	
	public LinkedList ()
	{
		this.head = null;
		this.size = 0;
	}
	
	public void addELement(ListElement le)
	{
		ListElement val;
		if (le == null)
		{
			le = new ListElement()
		}
	}
}

