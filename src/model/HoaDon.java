package model;

import java.time.LocalDateTime;
import java.util.List;

public class HoaDon {
	private String maHoaDOn;
	private LocalDateTime ngayLap;
	private double tongTien;
	private NhanVien nhanVien;
	private List<ChiTietHoaDon> chiTiet;
	
	public HoaDon() {
		this("", LocalDateTime.now(), 0.0, null, null);
	}

	public HoaDon(String maHoaDOn, LocalDateTime ngayLap, double tongTien, NhanVien nhanVien,
			List<ChiTietHoaDon> chiTiet) {
		
		this.maHoaDOn = maHoaDOn;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
		this.nhanVien = nhanVien;
		this.chiTiet = chiTiet;
	}

	public String getMaHoaDOn() {
		return maHoaDOn;
	}

	public void setMaHoaDOn(String maHoaDOn) {
		this.maHoaDOn = maHoaDOn;
	}

	public LocalDateTime getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(LocalDateTime ngayLap) {
		this.ngayLap = ngayLap;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public List<ChiTietHoaDon> getChiTiet() {
		return chiTiet;
	}

	public void setChiTiet(List<ChiTietHoaDon> chiTiet) {
		this.chiTiet = chiTiet;
	}

	@Override
	public String toString() {
		return "HoaDon [maHoaDOn=" + maHoaDOn + ", ngayLap=" + ngayLap + ", tongTien=" + tongTien + ", nhanVien="
				+ nhanVien + "]";
	}
	
	
	
}
