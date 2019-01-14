/**
 * 
 */
package com.target.CabAllocationService.service;

import org.springframework.stereotype.Service;

import com.target.CabAllocationService.entity.Cab;

/**
 * @author Anant Kishore
 *
 */
@Service
public class CabService {

	/**
	 * 
	 */
	public CabService() {
	}

	public boolean isValid(Cab cab) {
		return true;
	}

}
