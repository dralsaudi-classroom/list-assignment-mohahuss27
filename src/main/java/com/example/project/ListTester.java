package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {

    	if(list.empty())
    		return;
    	
    	T[] tmp = (T[]) new Object[n];
    	
    	list.findFirst();
    	
    	//Cut
    	for (int i = 0; i < n; i++) {
    		tmp[i] = list.retrieve();
    		list.remove();
    	}
    	
    	//Go to last
    	while(!list.last())
    		list.findNext();
    	
    	//Paste
    	for (int i = 0; i < n; i++) {
			list.insert(tmp[i]);
		}
    	
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
        // Write the method reverseCopy, user of DoubleLinkedList, which copies the elements
        // of l1 to l2 in reverse order. The list l1 must not change. Assume that l2 is empty.
        // The method signature is public static <T> void reverseCopy(DoubleLinkedList<T> l1,
        // DoubleLinkedList<T> l2).
        // Example 4.1. If l1 : A ↔ B ↔ C ↔ D, then calling reverseCopy(l1, l2) results in
        // l2 : D ↔ C ↔ B ↔ A.
    	
    	if(l1.empty())
    		return;
    	
    	//Go to last
    	while(!l1.last())
    		l1.findNext();
    	
    	//Copying
    	while(!l1.first()) {
    		l2.insert(l1.retrieve());
    		l1.findPrevious();
    	}
    	
    	//Last element
    	l2.insert(l1.retrieve());
    	
    }
}
