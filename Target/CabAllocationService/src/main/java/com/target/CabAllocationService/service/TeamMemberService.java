/**
 * 
 */
package com.target.CabAllocationService.service;

import org.springframework.stereotype.Service;

import com.target.CabAllocationService.entity.TeamMember;

/**
 * @author Anant Kishore
 *
 */
@Service
public class TeamMemberService {

	/**
	 * 
	 */
	public TeamMemberService() {
	}
	
	public boolean isValid(TeamMember team_member)
	{
		return true;
	}

}
