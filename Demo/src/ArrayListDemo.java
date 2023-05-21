import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(10);
		al.add("String");
		//System.out.println(al.size());
		
		//for(int i=0;i< al.size(); i++) {
		//System.out.println(al.get(i));
		//}

		//for(Object obj:al) {
		//	System.out.println(obj);}
		Iterator itr =al.iterator();
	while(itr.hasNext()) {System.out.println(itr.next());
		
	}}}