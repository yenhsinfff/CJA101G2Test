package com.camp.model;

import java.util.*;

public interface CampDAO_interface {
	public void insert(CampVO campVO);

	// public void update(CampVO campVO);

	// public void delete(CampVO campVO);

	// public CampVO findByPrimaryKey(Integer campno);

	public List<CampVO> getAll();

}
