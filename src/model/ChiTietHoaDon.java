package model;

public class ChiTietHoaDon {
	private SanPham sanPham;
	private int soLuong;
	private double donGia;
	private double thanhTien;
	
	public ChiTietHoaDon() {
		this(null, 0, 0.0, 0.0);
	}

	public ChiTietHoaDon(SanPham sanPham, int soLuong, double donGia, double thanhTien) {
		
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [soLuong=" + soLuong + ", donGia=" + donGia + ", thanhTien=" + thanhTien + "]";
	}
	
	
}
