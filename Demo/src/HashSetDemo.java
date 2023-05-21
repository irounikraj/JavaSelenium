import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hashsetdemo =new HashSet<Integer>();
		hashsetdemo.add(10);
		hashsetdemo.add(20);
		hashsetdemo.add(30);
		hashsetdemo.add(40);
		hashsetdemo.add(50);
		hashsetdemo.add(60);
		System.out.println(hashsetdemo);
		
		hashsetdemo.remove(60);
		System.out.println(hashsetdemo);
		
		Iterator itr =hashsetdemo.iterator();
		
	//while(itr.hasNext()) {System.out.println(itr.next());
			
	for(Integer intdemo:hashsetdemo)
	{System.out.println(intdemo);	}
		
	}

}
