package com.example.tugas1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FakultasModel {
	private int id;
	private String kodeFakultas;
	private String namaFakultas;
	private int idUniversitas;
}
