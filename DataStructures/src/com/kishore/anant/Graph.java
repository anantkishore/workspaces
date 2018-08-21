/**
 * 
 */
package com.kishore.anant;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author i351596
 *
 */
@SuppressWarnings("unchecked")
public class Graph {

	private int V;
	private LinkedList<Integer> adj[];
	boolean[] visited;

	/**
	 * 
	 */
	public Graph(int V) {
		
		this.visited = new boolean[V];

		this.V = V;
		adj = new LinkedList[V];

		for (int i = 0; i < V; i++) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			adj[i] = list;
		}

	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public void BFS(int s) {
		boolean[] visited = new boolean[this.V];

		Queue<Integer> queue = new LinkedList<>();

		queue.add(s);

		while (!queue.isEmpty()) {

			Integer v = queue.remove();

			visited[v] = true;

			System.out.println(v);

			for (Integer item : adj[v]) {
				if (!visited[item]) {
					queue.add(item);
				}
			}
		}

	}

	public void DFS(int s) {

		visited[s] = true;
		System.out.println(s);

		for (Integer item : adj[s]) {

			
			
			if (!visited[item])
			{
				DFS(item);
			}

		}

	}

	public static void main(String[] args) {

		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)" +"\n");

		g.DFS(2);
	}
}
