package lecture_34;

import lecture_34.Middle_of_linked_list.ListNode;

public class Merge_Sort_Linked_List {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		 
		class Solution {
		    public ListNode sortList(ListNode head) {
		    	
		    	if(head==null || head.next==null) {
		    		return head;
		    	}
		    	
		    	ListNode mid = middleNode(head);
		    	ListNode nexthalf = mid.next;
		    	mid.next=null;
		    	
		    	ListNode ans1=sortList(head);
		    	ListNode ans2=sortList(nexthalf);
		    	
		    	return mergeTwoLists(ans1,ans2);
		    	
		        
		    }
		    
		    public ListNode middleNode(ListNode head) {

		        ListNode slow =head;
		        ListNode fast= head;

		        while(fast.next!=null && fast.next.next!=null){   // first middle nikalna hai, bcoz second middle se break nhi hogi list sahi!                          
		            fast=fast.next.next;
		            slow=slow.next;
		        }
		        return slow;
		    }
					    
			public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
					    	ListNode dummy =new ListNode();
					    	ListNode temp = dummy;
					    	while(list1!=null && list2!=null) {
					    		if(list1.val < list2.val) {
					    			temp.next=list1;
					    			temp=temp.next;
					    			list1=list1.next;
					    		}
					    		else {
					    			temp.next=list2;
					    			temp=temp.next;
					    			list2=list2.next;
					    		}
					    	}
					    	if(list1==null) {
					    		temp.next=list2;
					    	}
					    	else {
					    		temp.next=list1;
					    	}
					    	return dummy.next;
					    }
		    
		}

}
