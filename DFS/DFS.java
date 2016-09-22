package practice;
import java.util.*;

public class DFS {

static ArrayList<Node> nodes = new ArrayList<Node>();

static class Node{
	int data;
	Boolean visited=false;
	
	Node(int data){
	this.data=data;	
	}
}

public ArrayList<Node> findNeighbours(int adjacencyMatrix[][], Node x){
	ArrayList<Node> neighbours = new ArrayList<Node>();
	int nodeIndex = -1;
	for(int i=0; i<nodes.size(); i++)
	{
	if(nodes.get(i).equals(x)){	
		nodeIndex=i;
		break;
	}
	}
	
	if(nodeIndex!=-1){
	for(int j=0; j<adjacencyMatrix[nodeIndex].length; j++)
	{
		if(adjacencyMatrix[nodeIndex][j]==1)
			neighbours.add(nodes.get(j));
	}
	}
	return neighbours;
}

public void dfsStack(int adjacency_matrix[][], Node node){
	Stack<Node> stack = new Stack<Node>();
	stack.add(node);
	node.visited=true;
	
	while(!stack.isEmpty()){
		Node element = stack.pop();
		System.out.print(element.data + "\t");
		ArrayList<Node> neighbours = new ArrayList<Node>();
		neighbours = findNeighbours(adjacency_matrix, element);
		
		for(int i=0; i<neighbours.size(); i++){
			Node n = neighbours.get(i);
			
			if(n!=null && !n.visited){
				stack.push(n);
				n.visited=true;
			}
		}
		
	} 
}

	public static void main(String[] args) {
		
		Node node40 =new Node(40); 
		Node node10 =new Node(10); 
		Node node20 =new Node(20); 
		Node node30 =new Node(30); 
		Node node60 =new Node(60); 
		Node node50 =new Node(50); 
		Node node70 =new Node(70); 
		nodes.add(node40); 
		nodes.add(node10); 
		nodes.add(node20); 
		nodes.add(node30); 
		nodes.add(node60); 
		nodes.add(node50); 
		nodes.add(node70); 
		
		int ad_matrix[][]={
			{0,1,1,0,0,0,0},
			{0,0,0,1,0,0,0},
			{0,1,0,1,1,1,0},
			{0,0,0,0,1,0,0},
			{0,0,0,0,0,0,1},
			{0,0,0,0,0,0,1},
			{0,0,0,0,0,0,0},
		};
		
		DFS dfs = new DFS();
		System.out.println("The DFS traversal of the graph using stack ");
		
		dfs.dfsStack(ad_matrix, node40);
		System.out.println();
		clearVisitedFlags();		
	}

	public static void clearVisitedFlags() { 
		for (int i = 0; i < nodes.size(); i++) 
		{ 
			nodes.get(i).visited=false; 
			} 
		}
	
}
