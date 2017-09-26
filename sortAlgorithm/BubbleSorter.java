import java.util.Comparator;

public class BubbleSorter implements Sorter{
    @Override
    public <T extends Comparable<T>> void sort(T[] list){
        boolean swapped = false;
	int len = list.length;
	for(int i=1; i<len && swapped; i++){
	    swapped = false;
	    for(int j=0; j<len-i; i++){
	        if(list[j].compareTo(list[j+1])>0){
		    T temp = list[j];
		    list[j] = list[j+1];
		    list[j+1] = temp;
		    swapped = true;
		}
	    }
	}
    }
    @Override
    public <T> void sort(T[] list, Comparator<T> comp){
        boolean swapped = true;
	int len = list.length;
	for(int i=0; i<len; i++){
	    swapped = false;
	    for(int j=0; j<len-i; j++){
	    	if(comp.compare(list[j],list[j+1])>0){
		    T temp = list[j];
		    list[j] = list[j+1];
		    list[j+1] = temp;
		    swapped = true;
		}
	    }
	}
    }
}
