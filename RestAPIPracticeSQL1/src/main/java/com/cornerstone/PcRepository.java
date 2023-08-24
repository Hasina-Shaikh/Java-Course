/**
 * 
 */
package com.cornerstone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author muskanshaikh
 *
 */
@Repository
public interface PcRepository extends JpaRepository<PcEntity, Long>{

	PcEntity getBypcname(String pcname);
}
