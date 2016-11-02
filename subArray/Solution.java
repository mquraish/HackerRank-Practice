public class Solution {

    public static List<Integer> bitPosition(int n){
    	List<Integer> position = new LinkedList<Integer>();
    	//check how many bits represent n
    	int temp = n;
    	int count =0;
    	while(temp>0){
    		count++;
    		temp = temp>>1;
    	}

    	//check which bits are set and add them to list
    	int k=0;
    	while(k<=count){
    	if((n & 1<<k)!=0) {
    		position.add(k);
    	}
    	k++;
   	}

    	return position;

 }

    public static List<List<Integer>> subArray (int[] a){
    	List<List<Integer>> sub = new LinkedList<List<Integer>>();

    	int x=0;
    	for(int i=0; i<Math.pow(2,a.length); i++){
    		List<Integer> temp = new LinkedList<Integer>();
    		for(int j=0; j<bitPosition(x).size(); j++){

    			temp.add(a[bitPosition(x).remove(j)]);
    		}
    		sub.add(temp);
    		x++;
    	}
    	return sub;
    }
	}
