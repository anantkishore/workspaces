/**
 * 
 */
package com.target.CabAllocationService.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.target.CabAllocationService.entity.Cab;
import com.target.CabAllocationService.entity.RoutePlan;
import com.target.CabAllocationService.entity.TeamMember;
import com.target.CabAllocationService.repository.CabRepository;
import com.target.CabAllocationService.repository.TeamMemberRepository;

/**
 * @author Anant Kishore
 *
 */
public class RoutePlanService {

	@Autowired
	private TeamMemberRepository teamMemberRepository;

	@Autowired
	private CabRepository cabRepository;

	/**
	 * 
	 */
	public RoutePlanService() {
	}

	public RoutePlan calculateRoutePlan() {
		List<TeamMember> teamMembers = teamMemberRepository.findAll();
		List<Cab> cabs = cabRepository.findAll();

		Collections.sort(teamMembers, Comparator.comparing(TeamMember::getDrop_point));

		Collections.sort(cabs, Comparator.comparing(Cab::getCapacity));

		HashMap<String, Integer> map = new HashMap<>();

		for (TeamMember teamMember : teamMembers) {
			String dropPoint = teamMember.getDrop_point();
			if (map.containsKey(dropPoint)) {
				int value = map.get(dropPoint);
				map.put(dropPoint, value + 1);
			} else {
				map.put(dropPoint, 1);
			}
		}
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, Comparator.comparing(Map.Entry<String, Integer>::getValue));
		map.clear();
		for (Map.Entry<String, Integer> entry : list) {
			map.put(entry.getKey(), entry.getValue());
		}
		allocateCabs(map, cabs);
		return null;
	}

	private void allocateCabs(HashMap<String, Integer> map, List<Cab> cabs) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			assignCab(entry.getKey(), entry.getValue(), cabs);
		}
	}

	private void assignCab(String key, Integer value, List<Cab> cabs) {
		while (value > cabs.get(i).getCapacity()) {
			value -= cabs.get(i).getCapacity();
			i++;
		}
		value = cabs.get(i).getCapacity();
	}

	private static int i = 0;
}
