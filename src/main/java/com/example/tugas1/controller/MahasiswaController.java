package com.example.tugas1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tugas1.model.MahasiswaModel;
import com.example.tugas1.service.DataService;

@Controller
public class MahasiswaController {

	@Autowired
	DataService<MahasiswaModel> mahasiswaDAO;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/mahasiswa")
	public String viewData(Model model, @RequestParam(value = "npm") String npm) {
		System.out.println(npm);
		// MahasiswaModel mhs = mahasiswaDAO.selectData(Integer.valueOf(npm));
		MahasiswaModel mhs = mahasiswaDAO.selectMahasiswaByNPM(npm);
		if (mhs == null) {
			System.out.println("LOL " + npm);
			return "";
		}
		model.addAttribute("npm", mhs.getNpm());
		return "view-mahasiswa";
	}

	@RequestMapping("/mahasiswa/tambah")
	public String addDataForm(Model model) {
		return "form-add-mahasiswa";
	}

	@RequestMapping(value = "/mahasiswa/tambah/submit", method = RequestMethod.POST)
	public String addDataSubmit(Model model, @ModelAttribute MahasiswaModel mahasiswa) {
		return "submit-success";
	}

	@RequestMapping("/mahasiswa/ubah/{npm}")
	public String editDataForm(Model model, @PathVariable("npm") String npm) {
		return "form-update-mahasiswa";
	}

	@RequestMapping(value = "/mahasiswa/ubah/submit", method = RequestMethod.POST)
	public String editDataSubmit(Model model, @ModelAttribute MahasiswaModel mahasiswa) {
		return "submit-success";
	}

	@RequestMapping("/kelulusan")
	public String viewPresentationGraduation(Model model, @RequestParam("thn") String tahun,
			@RequestParam("prodi") int idProdi) {
		return "view-presentation-graduation";
	}

	@RequestMapping("/mahasiswa/cari")
	public String viewDataByValue(Model model, @RequestParam("univ") int idUniv,
			@RequestParam("fakultas") int idFakultas, @RequestParam("prodi") int idProdi) {
		return "find-result";
	}
}
