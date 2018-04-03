package duomiao;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

public class CollectionStu {
	
   public static void main(String[] args){
	   ArrayDeque ad  = new ArrayDeque();
	   ad.add("ss");
	   ad.add("xx");
	   ad.add("yy");
	   ad.push("bb");
	   ad.push("aa");
	   ad.add("xx");
	   ad.remove();
	   ad.pop();//删除栈顶元素
	   /*ad.removeFirstOccurrence("yy");*/
	 /*  System.out.println(ad.element());*/
	   Iterator iterator = ad.iterator();
	   while(iterator.hasNext()){
		   System.err.println(iterator.next().toString());
	   }
	 /*  for(Object e:ad){
	   System.err.println(e.toString());
	   }*/
   }
}
