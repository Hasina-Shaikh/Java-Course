/**
 * 
 */
package com.cornerstone;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author muskanshaikh
 *
 */
@Service
public interface PcServices {

	public PcEntity savaPcData(PcEntity entity);
	public List<PcEntity> getPcData();
	public PcEntity getData(String pcname);
}

