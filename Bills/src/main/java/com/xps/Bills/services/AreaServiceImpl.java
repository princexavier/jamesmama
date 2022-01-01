package com.xps.Bills.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xps.Bills.Pojos.AreaMaster;
import com.xps.Bills.repo.AreaRepo;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	AreaRepo areaRepo;

	@Override
	public AreaMaster saveArea(String requestData) {
		// TODO Auto-generated method stub

		AreaMaster area = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			area = mapper.readValue(requestData, AreaMaster.class);
			System.out.println(area);
		} catch (Exception e) {

		}
		return areaRepo.save(area);
	}

	@Override
	public List<AreaMaster> getAreas() {
		// TODO Auto-generated method stub
		return areaRepo.findAll();
	}

}
