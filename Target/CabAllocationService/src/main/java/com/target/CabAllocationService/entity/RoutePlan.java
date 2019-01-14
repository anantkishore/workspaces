/**
 * 
 */
package com.target.CabAllocationService.entity;

import java.util.ArrayList;
import java.util.List;

import com.target.CabAllocationService.repository.TeamMemberRepository;


/**
 * @author Anant Kishore
 *
 */
public class RoutePlan {

	private String total_cost;

	private List<Route> routes;

	/**
	 * { “total_cost”:”5”, “routes”: [ { “cab_id”:”1”, “team_member_ids”:”4,5”,
	 * “route”: “target_headquarter,pointE”, “route_cost”: 2 }, {… ..} ] }
	 * 
	 */
	public RoutePlan() {
		// TODO Auto-generated constructor stub
	}

	public static RoutePlan calculateRoutePlan() {
		List<Route> routes = new ArrayList<>();
		routes.add(new Route());
		RoutePlan routePlan = new RoutePlan();
		routePlan.setTotal_cost("5");
		routePlan.setRoutes(routes);
		return routePlan;
	}
	
	public static RoutePlan fetchRoutePlan() {
		
		
		RoutePlan routePlan = new RoutePlan();
		
		
		
		
		return null;
	}

	public String getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(String total_cost) {
		this.total_cost = total_cost;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

}
