/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/
/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 * 
 * public static void main(String[] args) {
 * Scanner s = new Scanner(System.in);
 * 
 * Dequeue dq = new Dequeue(10);
 * 
 * while(true){
 * int choice = s.nextInt(),input;
 * switch (choice) {
 * case 1:
 * input = s.nextInt();
 * dq.insertFront(input);
 * break;
 * case 2:
 * input = s.nextInt();
 * dq.insertRear(input);
 * break;
 * case 3:
 * dq.deleteFront();
 * break;
 * case 4:
 * dq.deleteRear();
 * break;
 * case 5:
 * System.out.println(dq.getFront());
 * break;
 * case 6:
 * System.out.println(dq.getRear());
 * break;
 * default:
 * return ;
 * }
 * }
 * }
 ******************/

public class Dequeue
{
	private int[] data;
	private int firstIndex;
	private int nextIndex;
	private int size;
	private int capacity;

	public Dequeue(int x) {
		data = new int[10];
		firstIndex = -1;
		nextIndex = 0;
		size = 0;
		capacity = x;
	}

	public void insertFront(int element) {
		if (size == capacity) {
			System.out.println(-1);
			return;
		}
		if (size == 0) {
			firstIndex = 0;
			nextIndex = 1;
		} else {
			firstIndex = (((firstIndex - 1) % capacity + capacity) % capacity);
		}
		data[firstIndex] = element;
		size++;
	}

	public void insertRear(int element) {
		if (size == capacity) {
			System.out.println(-1);
			return;
		}
		data[nextIndex] = element;
		nextIndex = (nextIndex + 1) % capacity;
		if (firstIndex == -1) {
			firstIndex = 0;
		}
		size++;
	}

	public void deleteFront() {
		if (size == 0) {
			System.out.println(-1);
			return;
		}
		firstIndex = (firstIndex + 1) % capacity;
		size--;
		if (size == 0) {
			firstIndex = -1;
			nextIndex = 0;
		}
	}

	public void deleteRear() {
		if (size == 0) {
			System.out.println(-1);
			return;
		}
		nextIndex = ((nextIndex - 1) % capacity + capacity) % capacity;
		size--;
		if (size == 0) {
			nextIndex = 0;
			firstIndex = -1;
		}
	}

	public int getFront() {
		if (size == 0) {
			return -1;
		}
		return data[firstIndex];
	}

	public int getRear() {
		if (size == 0) {
			return -1;
		}
		return data[(((nextIndex - 1) % capacity + capacity) % capacity)];
	}
}
