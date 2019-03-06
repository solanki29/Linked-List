class LinkedList<D> implements List<D>
{
    ListObject<D> head, tail, element;
    Integer size;
    
    LinkedList()
    {
    tail=head=element=null;
    size=0;
    }
    
    
    public void add(D v)
    {
        if (head==null)
        {
        ListObject<D> ob=new ListObject<D>(v);
        head=tail=ob;
        size++;
        }
        
        else
        {
        ListObject<D> ob=new ListObject<D>(v);
        tail.next=ob;
        tail=ob;
        size++;
        }
    }

    public void add(D v, Integer pos)
    {
            try
			{
				if (pos<1 || pos>size)
				{
				BoundsException obj=new BoundsException();
				throw obj;
				}
			}
			
			catch(BoundsException x)
			{
			x.printError();
			return;
			}
			
		ListObject<D> before=new ListObject<D>(v);
        before.next=head;
		int i=1;
		while(i < pos-1)
		before.next=before.next.next;
		ListObject<D> New=new ListObject<D>(v);
		element.next=before.next;
		element=New;
		before.next=element;
		size++;	
    }

    public void traverse()
    {
    ListObject<D> ob=head;
        while(ob!=null)
        {
        System.out.println(ob.val);
        ob=ob.next;
        }   
    }

}
