package com.example.tugas1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tugas1.dao.MahasiswaMapper;
import com.example.tugas1.model.MahasiswaModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MahasiswaServiceDatabase implements DataService<MahasiswaModel>{

	@Autowired
	private MahasiswaMapper mahasiswaMapper;
	
	@Override
	public MahasiswaModel selectData(Object id) {
		log.info("select mahasiswa with npm {}", id);
		return mahasiswaMapper.selectMahasiswa((int) id);
	}

	@Override
	public MahasiswaModel selectMahasiswaByNPM(String value) {
		log.info(value);
		return mahasiswaMapper.selectMahasiswaByNPM(value);
	}

	@Override
	public List<MahasiswaModel> selectAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertData(MahasiswaModel data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData(MahasiswaModel data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteData(Object id) {
		// TODO Auto-generated method stub
		
	}
	
}
