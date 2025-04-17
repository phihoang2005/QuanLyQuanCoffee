package model;

import java.time.LocalTime;

public class CaLamViec {
	private String maCa;
	private LocalTime gioBatDau;
	private LocalTime gioKetThuc;
	
	public CaLamViec() {
		this("", LocalTime.now(), LocalTime.now());
	}

	public CaLamViec(String maCa, LocalTime gioBatDau, LocalTime gioKetThuc) {
		
		this.maCa = maCa;
		this.gioBatDau = gioBatDau;
		this.gioKetThuc = gioKetThuc;
	}

	public String getMaCa() {
		return maCa;
	}

	public void setMaCa(String maCa) {
		this.maCa = maCa;
	}

	public LocalTime getGioBatDau() {
		return gioBatDau;
	}

	public void setGioBatDau(LocalTime gioBatDau) {
		this.gioBatDau = gioBatDau;
	}

	public LocalTime getGioKetThuc() {
		return gioKetThuc;
	}

	public void setGioKetThuc(LocalTime gioKetThuc) {
		this.gioKetThuc = gioKetThuc;
	}

	@Override
	public String toString() {
		return "CaLamViec [maCa=" + maCa + ", gioBatDau=" + gioBatDau + ", gioKetThuc=" + gioKetThuc + "]";
	}
	
	
}
