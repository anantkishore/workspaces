/**
 * 
 */
package com.target.CabAllocationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.target.CabAllocationService.entity.TeamMember;

/**
 * @author i351596
 *
 */
public interface TeamMemberRepository extends JpaRepository<TeamMember, Long>{
	
	
}
