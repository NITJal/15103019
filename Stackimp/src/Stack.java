
public class Stack {

	static int MAXM=100;
	static int A[]=new int[MAXM];
	static int top=-1;

	public void Push(int info)
		{
		   top++;
		   A[top]=info;
		}
		public int pop()
		{
			return A[top--];
		}
		public int IsFull()
		{
			if(top==MAXM)
				return 1;
			else
				return 0;
		}
		public int IsEmpty()
		{
			if(top==-1)
				return 1;
			else
				return 0;
		}
        public int Peak()
        {
        	return A[top];
        }
        public void Display()
        {
        	int i=top;
        	for(i=top;i>=0;i--)
        		System.out.println(A[i]);
        }


	public static void main(String[] args) {
		
		Stack st=new Stack();
		st.Push(3);
		st.Push(4);
		st.Push(6);
		st.Display();
		st.pop();
		st.Display();
	}
}