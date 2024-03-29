public class DemoQueue   
{  
  /* Member variable declaration */  
  private int maxSize;  
  private int[] queueArray;  
  private int front;  
  private int rear;  
  private int currentSize;  
  /* Constructor */  
  public DemoQueue(int size)  
  {  
    this.maxSize = size;  
    this.queueArray = new int[size];  
    front = 0;  
    rear = -1;  
    currentSize = 0;  
  }  
  /* Queue:Insert Operation */  
  public void insert(int item)  
  {  
    /* Checks whether the queue is full or not */  
    if(isQueueFull())  
    {  
      System.out.println("Queue is full!");  
      return;  
    }else{
        if(rear == maxSize - 1) // 5-1=4 
        {  
           rear = -1;  
        } 
        queueArray[++rear] = item;  // rear=4
        currentSize++;  
        System.out.println("Item added to queue: " + item);  
    }
   
    /* increment rear then insert element to queue */  
   
  }  
  /* Queue:Delete Operation */    
  public int delete()  
  {  
    /* Checks whether the queue is empty or not */  
    if(isQueueEmpty())  
    {  
      throw new RuntimeException("Queue is empty");  
    }  
    /* retrieve queue element then increment */  
    int temp = queueArray[front++];  // front=0 => front=5
    if(front == maxSize)  
    {  
      front = 0;  
    }  
    currentSize--;  
    return temp;  
  }  
  /* Queue:Peek Operation */      
  public int peek()  
  {  
    return queueArray[front];  
  }  
  /* Queue:isFull Operation */   
  public boolean isQueueFull()  
  {  
    return (maxSize == currentSize);  
  }      
  /* Queue:isEmpty Operation */   
  public boolean isQueueEmpty()  
{  
    return (currentSize == 0);  
  }  
  /* Driver Code */  
  public static void main(String[] args)   
  {  
    DemoQueue queue = new DemoQueue(5);  
    queue.insert(2);  
    queue.insert(3);  
    queue.insert(4);
    queue.insert(5);
    queue.insert(6);
    queue.insert(7);
    System.out.println("Item deleted from queue: " + queue.delete());  
    System.out.println("Item deleted from queue: " + queue.delete());  
    System.out.println("Item deleted from queue: " + queue.delete());  
    System.out.println("Item deleted from queue: " + queue.delete()); 
    System.out.println("Item deleted from queue: " + queue.delete());  
 //   System.out.println("Item deleted from queue: " + queue.delete()); 
    queue.insert(5);      
    System.out.println("Item deleted from queue: " + queue.delete());      
  }  
}  