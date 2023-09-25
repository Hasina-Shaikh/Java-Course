/**
 * 
 */
package com.cornerstone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author muskanshaikh
 *
 */
@Data
@Table(name = "Teams")
@Entity
class entitydata {

	@Id
	public String Tid;
	public String Tname;
	
}
