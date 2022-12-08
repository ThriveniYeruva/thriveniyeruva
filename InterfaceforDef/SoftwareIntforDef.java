package com.example.software.InterfaceforDef;

import java.util.List;

import com.example.software.Model.Software;

public interface SoftwareIntforDef {
	Software savesoftware(Software obj);// public abstract

	List<Software> fetchAllRecords();

	Software fetchOneRecord(int id) throws Exception;

	Software updateSoftware(int id, Software newvalue);

	void deletesoftware(int id);

}
