/**
 * 
 */
package com.cornerstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author muskanshaikh
 *
 */
@Service
public class Pcimpl implements PcServices {
	
	@Autowired
	PcRepository pcRepository;

	@Override
	public PcEntity savaPcData(PcEntity entity) {
		return pcRepository.save(entity);
	}

	@Override
	public List<PcEntity> getPcData() {
		return pcRepository.findAll();
	}

	@Override
	public PcEntity getData(String pcname) {
		return pcRepository.getBypcname(pcname);
	}
	


}
