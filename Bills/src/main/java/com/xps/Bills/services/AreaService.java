package com.xps.Bills.services;

import java.util.List;

import com.xps.Bills.Pojos.AreaMaster;

public interface AreaService {

	public AreaMaster saveArea(String area);
	public List<AreaMaster> getAreas();
}
