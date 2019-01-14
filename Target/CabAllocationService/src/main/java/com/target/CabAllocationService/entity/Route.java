/**
 * 
 */
package com.target.CabAllocationService.entity;

/**
 * @author Anant Kishore
 *
 */
public class Route {

	private String cab_id;

	private String team_member_ids;

	private String route;

	private int route_cost;

	/**
	 * { “cab_id”:”1”, “team_member_ids”:”4,5”, “route”:
	 * “target_headquarter,pointE”, “route_cost”: 2 }
	 */
	public Route() {
		this.cab_id = "1";
		this.team_member_ids = "4,5";
		this.route = "target_headquarter,pointE";
		this.route_cost = 2;
	}

	public Route(String cab_id, String team_member_ids, String route, int route_cost) {
		super();
		this.cab_id = cab_id;
		this.team_member_ids = team_member_ids;
		this.route = route;
		this.route_cost = route_cost;
	}

	public String getCab_id() {
		return cab_id;
	}

	public void setCab_id(String cab_id) {
		this.cab_id = cab_id;
	}

	public String getTeam_member_ids() {
		return team_member_ids;
	}

	public void setTeam_member_ids(String team_member_ids) {
		this.team_member_ids = team_member_ids;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getRoute_cost() {
		return route_cost;
	}

	public void setRoute_cost(int route_cost) {
		this.route_cost = route_cost;
	}

}
