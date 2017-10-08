package task9_streamZip;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Iterator;
import java.util.Spliterator;

public class StreamZip {
	 public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
		 Iterator<T> firstIt = first.iterator();
		 Iterator<T> secondIt = second.iterator();
		 Iterator<T> It = new Iterator<T>() {
	            boolean isFirst = true;
	            public boolean hasNext(){
	                if(isFirst) return firstIt.hasNext();
	                return secondIt.hasNext();
	            }
	            public T next(){
	                if (isFirst){
	                    isFirst = false;
	                    return firstIt.next();
	                }
	                isFirst = true;
	                return secondIt.next();
	            }
	     };
	     boolean isParallel = first.isParallel() || second.isParallel();
	     Iterable<T> iterable = ()-> It;
	     Spliterator<T> spliterator = iterable.spliterator();
	     return StreamSupport.stream(spliterator, isParallel);
	 }
}
