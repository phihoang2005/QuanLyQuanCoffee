package model;

public class NhanVien {
	private String maNhanVien;
	private String tenNhanVien;
	private String gioiTinh;
	private String soDienThoai;
	private String chucVu;
	private CaLamViec caLam;
	private TaiKhoan taiKhoan;
	
	public NhanVien() {
		this("", "", "", "", "", null, null);
	}

	public NhanVien(String maNhanVien, String tenNhanVien, String gioiTinh, String soDienThoai, String chucVu,
			CaLamViec caLam, TaiKhoan taiKhoan) {
		
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.chucVu = chucVu;
		this.caLam = caLam;
		this.taiKhoan = taiKhoan;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public CaLamViec getCaLam() {
		return caLam;
	}

	public void setCaLam(CaLamViec caLam) {
		this.caLam = caLam;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", gioiTinh=" + gioiTinh
				+ ", soDienThoai=" + soDienThoai + ", chucVu=" + chucVu + "]";
	}
	
	
}
