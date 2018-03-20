package com.example.tugas1.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MahasiswaModel {
	public static final int TAG_JK_PRIA = 1;
	public static final int TAG_JK_WANITA = 0;
	private int id;
	private String npm;
	private String nama;
	private String tempatLahir;
	private Date tanggalLahir;
	private int jenisKelamin;
	private String agama;
	private String golonganDarah;
	private String status;
	private String tahunMasuk;
	private String jalurMasuk;
	private int idProdi;
}
