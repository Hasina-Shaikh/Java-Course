package com.cornerstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PcController {
	
	@Autowired
	Pcimpl pcimpl;
	
	@PostMapping("/postdata")
	public PcEntity savePostData(@RequestBody PcEntity entity) {
			return pcimpl.savaPcData(entity);
	}
	
	@GetMapping("/getdata")
	public List<PcEntity> getPostData() {
			return pcimpl.getPcData();
	}
	
	@PostMapping("/getdatabyname")
	public PcEntity getDataByName(@RequestHeader String pcname)
	{
		return pcimpl.getData(pcname);
	}
}
