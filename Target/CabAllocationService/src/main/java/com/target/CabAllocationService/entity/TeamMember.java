/**
 * 
 */
package com.target.CabAllocationService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Anant Kishore
 *
 */
@Entity
public class TeamMember {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long team_member_id;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="drop_point")
	private String drop_point;
	
	/**
	 * 
	 */
	public TeamMember() {
	}

	public TeamMember(Long team_member_id, String gender, String drop_point) {
		super();
		this.team_member_id = team_member_id;
		this.gender = gender;
		this.drop_point = drop_point;
	}

	public Long getTeam_member_id() {
		return team_member_id;
	}

	public void setTeam_member_id(Long team_member_id) {
		this.team_member_id = team_member_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDrop_point() {
		return drop_point;
	}

	public void setDrop_point(String drop_point) {
		this.drop_point = drop_point;
	}
	
	

}
