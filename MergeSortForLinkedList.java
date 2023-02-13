static Node mergeSort(Node head)
{
  Node temp=head;
  int c=0;
  while(temp!=null){
    c++;
    temp=temp.next;
  }
  temp=head;
  int arr[]=new int[c];
  Node cur=null;
  Node tail=null;
  for(int i=0;i<c;i++){
    arr[i]=temp.data;
    temp=temp.next;
  }
  Arrays.sort(arr);
  for(int i=0;i<c;i++){
    Node t=new Node(arr[i]);
    if(cur==null){
      cur=t;
      tail=t;
    }
    else{
      tail.next=t;
      tail=t;
    }
      return cur;
  }
    
}


// Anther Approach.
static Node mergeSort(Node head)
    {
        if(head==null){
            return head;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(arr);
        Node cur=new Node(arr.get(0));
        Node ans=cur;
        for(int i=1;i<arr.size();i++){
            cur.next=new Node(arr.get(i));
            cur=cur.next;
        }
        cur.next=null;
        return ans;
    }
}
