Class Main {
public void dfs() {
		// DFS using Stack data structure
		Stack stack = new Stack();
		stack.push(this.rootNode);
		rootNode.visited=true; //mark pushed node as visited
		printNode(rootNode);
		while(!stack.isEmpty()) { //confirm there is no underflow
			Node node = (Node)s.peek();
			Node child = getUnvisitedChildNode(n);
			if(child != null) {
				child.visited = true;
				printNode(child);
				s.push(child);
			}
			else {
				s.pop();
			}
		}
		// Clear visited property of nodes
		clearNodes();
	}
}

	public void bfs()
	{
		// BFS using Queue data structure
		Queue queue = new LinkedList();
		queue.add(this.rootNode);
		printNode(this.rootNode);
		rootNode.visited = true;  //mark pushed node as visited
		while(!queue.isEmpty()) {  //confirm there is no underflow
			Node node = (Node)queue.remove();
			Node child=null;
			while((child=getUnvisitedChildNode(node))!=null) {
				child.visited=true;
				printNode(child);
				queue.add(child);
			}
		}
		// Clear visited property of nodes
		clearNodes();
	}

Class Node {
   Char data;
   Public Node(char c) {
      this.data=c;
}
