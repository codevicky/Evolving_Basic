
public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		numbers.addLast(30);
		System.out.println(numbers.node(1));
		System.out.println(numbers);
		
		
		LinkedList.ListIterator li = numbers.listIterator();
		while(li.hasNext()){
			/**
			 *next()�� �� ���� �� ���ٴ� ���� �� �տ� node�� �߰��Ѵٴ� ��.
			 *ListIterator.add function������ lastReturned==null�� ǥ�õȴ�.
			 **/
			if((int)li.next() == 10)
				li.add(20);
			//System.out.println(li.next());
		}
		
	System.out.println(numbers);
		
	}
}
