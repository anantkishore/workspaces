/**
 * 
 */
package com.target.CabAllocationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.target.CabAllocationService.entity.Cab;

/**
 * @author i351596
 *
 */
public interface CabRepository extends JpaRepository<Cab, Long> {

	static void persist(Cab cab) {
		// TODO Auto-generated method stub

	}

}
