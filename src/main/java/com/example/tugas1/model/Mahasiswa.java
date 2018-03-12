package com.example.tugas1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mahasiswa {
	private int id;
	private String npm;
	private String nama;
	private String tempatLahir;
	private String tanggalLahir;
	private String jenisKelamin;
	private String agama;
	private String golonganDarah;
	private String status;
	private String tahunMasuk;
	private String jalurMasuk;
}
