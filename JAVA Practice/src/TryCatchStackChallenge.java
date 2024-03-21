
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}
class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is Full";
    }
}

class Stack{

    int size ,top=-1;
    int stack[];

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int value) throws StackOverFlow
    {
        if(top==size-1) throw new StackOverFlow();
        top++;
        stack[top]=value;
    }

    public void pop() throws StackUnderFlow
    {
        if(top==-1) throw new StackUnderFlow();
        top--;
    }

}



public class TryCatchStackChallenge {
    public static void main(String[] args) throws Exception {

        Stack st = new Stack(5);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);





    }
}
