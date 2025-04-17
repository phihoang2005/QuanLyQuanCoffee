package model;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private double gia;
	private String loaiSanPham;
	private int soLuongTon;
	
	public SanPham() {
		this("", "", 0.0, "",0);
	}

	public SanPham(String maSanPham, String tenSanPham, double gia, String loaiSanPham, int soLuongTon) {
		
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.gia = gia;
		this.loaiSanPham = loaiSanPham;
		this.soLuongTon = soLuongTon;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", gia=" + gia + ", loaiSanPham="
				+ loaiSanPham + ", soLuongTon=" + soLuongTon + "]";
	}
	
}
