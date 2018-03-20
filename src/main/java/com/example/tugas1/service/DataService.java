package com.example.tugas1.service;

import java.util.List;

public interface DataService<T> extends MahasiswaService {

	T selectData(Object id);

	List<T> selectAllData();

	void insertData(T data);

	void updateData(T data);

	void deleteData(Object id);
}
