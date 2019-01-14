/**
 * 
 */
package com.target.CabAllocationService.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.target.CabAllocationService.entity.Cab;
import com.target.CabAllocationService.entity.DistanceMatrix;
import com.target.CabAllocationService.entity.RoutePlan;
import com.target.CabAllocationService.entity.TeamMember;
import com.target.CabAllocationService.repository.CabRepository;
import com.target.CabAllocationService.repository.TeamMemberRepository;
import com.target.CabAllocationService.service.CabService;
import com.target.CabAllocationService.service.DistanceMatrixService;
import com.target.CabAllocationService.service.TeamMemberService;

/**
 * @author Anant Kishore
 *
 */
@RestController
public class CabAllocationServiceController {

	@Autowired
	private CabRepository cabrepo;

	@Autowired
	private CabService cabService;

	@Autowired
	private TeamMemberService teamMemberService;

	@Autowired
	private TeamMemberRepository teamMemberRepo;

	@Autowired
	private DistanceMatrixService distanceMatrixService;

	@PostMapping("/register")
	public ResponseEntity<String> registerTeamMembers(@RequestBody TeamMember team_member) {
		if (teamMemberService.isValid(team_member)) {
			teamMemberRepo.save(team_member);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}

	@PostMapping("/cabs")
	public ResponseEntity<String> registerCabs(@RequestBody List<Cab> cabs) {
		if (cabs != null && cabs.size() > 0) {
			for (Cab cab : cabs) {
				if (cabService.isValid(cab)) {
					cabrepo.save(cab);
					return ResponseEntity.status(HttpStatus.CREATED).build();
				}
			}
		}
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}

	@PostMapping("/drop_points")
	public ResponseEntity<String> createDropPoints(@RequestBody Object dropPoints) {
		@SuppressWarnings("unchecked")
		LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap<String, String>) dropPoints;
		DistanceMatrix distanceMatrix = new DistanceMatrix(linkedHashMap);
		if (distanceMatrix != null) {
			if (distanceMatrixService.isValid(distanceMatrix)) {
				System.out.println(distanceMatrix.toString());
				return ResponseEntity.status(HttpStatus.CREATED).build();
			}
		}
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}

	@GetMapping("/route_plan")
	public ResponseEntity<RoutePlan> fetchRoutePlan() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(RoutePlan.calculateRoutePlan());
	}

	@GetMapping("/cabs")
	public List<Cab> findAllCabs() {
		return cabrepo.findAll();
	}

}
