/**
 * 
 */
package com.cornerstone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author muskanshaikh
 *
 */
@Data
@Entity
@Table(name = "PC")
public class PcEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pcnum;
	private String pcname;
}
