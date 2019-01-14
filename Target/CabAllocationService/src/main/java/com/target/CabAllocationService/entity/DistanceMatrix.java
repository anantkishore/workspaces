/**
 * 
 */
package com.target.CabAllocationService.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/**
 * @author Anant Kishore
 *
 */
public class DistanceMatrix {

	private List<List<Integer>> matrix = new ArrayList<>();
	
	private int getSize()
	{
		return this.matrix.size();
	}

	/**
	 * 
	 */
	public DistanceMatrix() {
	}

	public DistanceMatrix(LinkedHashMap<String, String> dropPoints) {
		Set<String> dropPoint = dropPoints.keySet();
		for(String point: dropPoint)
		{	
			List<Integer> distList = new ArrayList<>();
			String distances = dropPoints.get(point);
			for(String distance: distances.split(","))
			{
				int dist = Integer.parseInt(distance);
				distList.add(dist);
			}
			this.matrix.add(distList);
		}
	}
	
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("##########################");
		
		int size = this.getSize();
		for(int i = 0; i < size; i++)
		{
			sb.append("\n");
			for(int j = 0; j < size-1; j++)
			{
				sb.append(this.matrix.get(i).get(j) +" ");
			}
		}
		sb.append("\n");
		sb.append("##########################");
		sb.append("\n");
		return sb.toString();
		
	}

	public List<List<Integer>> getMatrix() {
		return matrix;
	}

	public void setMatrix(List<List<Integer>> matrix) {
		this.matrix = matrix;
	}

}
