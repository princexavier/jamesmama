package com.xps.Bills.Pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "areamaster")
public class AreaMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "areaseq")
	@SequenceGenerator(name = "james_flower", sequenceName = "james_flower.areaseq")
	@Column(name = "AREAID")
	private Long areaId;

	@Column(name = "AREANAME")
	private String areaName;

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "AreaMaster [areaId=" + areaId + ", areaName=" + areaName + "]";
	}
}
