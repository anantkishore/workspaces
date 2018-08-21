/**
 * 
 */
package com.kishore.anant.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author anakisho
 *
 */
public class Graph {

	ArrayList<LinkedList<Integer>> list;

	/**
	 * 
	 */
	public Graph(int V) {

		list = new ArrayList<LinkedList<Integer>>();

		for (int i = 0; i < V; i++) {

			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.addFirst(i);
			list.add(linkedList);

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Graph graph = new Graph(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		// print the adjacency list representation of
		// the above graph
		graph.printGraph();

	}

	private void printGraph() {

		for (LinkedList<Integer> linkedList : this.list) {
			Iterator<Integer> iterator = linkedList.iterator();
			while (iterator.hasNext()) {
				Integer i = iterator.next();
				System.out.print(i + " --> ");
			}
			
			System.out.println();
		}

	}

	private void addEdge(int src, int dest) {

		this.list.get(src).addLast(dest);
		this.list.get(dest).addLast(src);

	}

}
