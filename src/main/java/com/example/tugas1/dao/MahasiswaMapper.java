package com.example.tugas1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.tugas1.model.MahasiswaModel;

@Mapper
public interface MahasiswaMapper {
	
	@Select("SELECT * FROM mahasiswa WHERE id=#{id}")
	@Results({
		@Result(property = "tempatLahir", column = "tempat_lahir"),
		@Result(property = "tanggalLahir", column = "tanggal_lahir"),
		@Result(property = "jenisKelamin", column = "jenis_kelamin"),
		@Result(property = "golonganDarah", column = "golongan_darah"),
		@Result(property = "tahunMasuk", column = "tahun_masuk"),
		@Result(property = "jalurMasuk", column = "jalur_masuk"),
		@Result(property = "idProdi", column = "id_prodi")
	})
	MahasiswaModel selectMahasiswa(@Param("id") int id);

	@Select("SELECT * FROM mahasiswa WHERE npm=#{npm}")
	@Results({
		@Result(property = "tempatLahir", column = "tempat_lahir"),
		@Result(property = "tanggalLahir", column = "tanggal_lahir"),
		@Result(property = "jenisKelamin", column = "jenis_kelamin"),
		@Result(property = "golonganDarah", column = "golongan_darah"),
		@Result(property = "tahunMasuk", column = "tahun_masuk"),
		@Result(property = "jalurMasuk", column = "jalur_masuk"),
		@Result(property = "idProdi", column = "id_prodi")
	})
	MahasiswaModel selectMahasiswaByNPM(@Param("npm") String npm);
	
	@Select("SELECT * FROM mahasiswa")
	@Results({
		@Result(property = "tempatLahir", column = "tempat_lahir"),
		@Result(property = "tanggalLahir", column = "tanggal_lahir"),
		@Result(property = "jenisKelamin", column = "jenis_kelamin"),
		@Result(property = "golonganDarah", column = "golongan_darah"),
		@Result(property = "tahunMasuk", column = "tahun_masuk"),
		@Result(property = "jalurMasuk", column = "jalur_masuk"),
		@Result(property = "idProdi", column = "id_prodi")
	})
	List<MahasiswaModel> selectAllMahasiswa();

	@Insert("INSERT INTO mahasiswa VALUES ("
			+ "#{mahasiswa.npm},"
			+ "#{mahasiswa.nama},"
			+ "#{mahasiswa.tempatLahir},"
			+ "#{mahasiswa.tanggalLahir},"
			+ "#{mahasiswa.jenisKelamin},"
			+ "#{mahasiswa.agama},"
			+ "#{mahasiswa.golonganDarah},"
			+ "#{mahasiswa.status},"
			+ "#{mahasiswa.tahunMasuk},"
			+ "#{mahasiswa.jalurMasuk},"
			+ "#{mahasiswa.idProdi})")
	void insertMahasiwa(@Param("mahasiwa") MahasiswaModel mahasiswa);

	@Update("UPDATE mahasiswa SET "
			+ "npm=#{mahasiswa.npm},"
			+ "nama=#{mahasiswa.nama},"
			+ "tempat_lahir=#{mahasiswa.tempatLahir},"
			+ "tanggal_lahir=#{mahasiswa.tanggalLahir},"
			+ "jenis_kelamin=#{mahasiswa.jenisKelamin},"
			+ "agama=#{mahasiswa.agama},"
			+ "golongan_darah=#{mahasiswa.golonganDarah},"
			+ "status=#{mahasiswa.status},"
			+ "tahun_masuk=#{mahasiswa.tahunMasuk},"
			+ "jalur_masuk=#{mahasiswa.jalurMasuk},"
			+ "id_prodi=#{mahasiswa.idProdi}"
			+ " WHERE id=#{mahasiswa.id}")
	void updateMahasiswa(@Param("mahasiwa") MahasiswaModel mahasiswa);

	@Delete("DELETE FROM mahasiwa WHERE id=#{id}")
	void deleteMahasiswa(@Param("id") int id);
}
