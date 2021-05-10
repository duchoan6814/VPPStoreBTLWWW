package com.boot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nguoi_dung")
public class NguoiDung implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1835758663980843147L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	private String hoTenDem;
	private String ten;
	private Date ngaySinh;
	private String soDienThoai;
	private boolean gioiTinh;
	private String avatar;
	private String diaChi;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTenDem() {
		return hoTenDem;
	}

	public void setHoTenDem(String hoTenDem) {
		this.hoTenDem = hoTenDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public NguoiDung(int id, String hoTenDem, String ten, Date ngaySinh, String soDienThoai, boolean gioiTinh,
			String avatar, String diaChi, User user) {
		super();
		this.id = id;
		this.hoTenDem = hoTenDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.gioiTinh = gioiTinh;
		this.avatar = avatar;
		this.diaChi = diaChi;
		this.user = user;
	}

	public NguoiDung() {
		super();
	}

	@Override
	public String toString() {
		return "NguoiDung [id=" + id + ", hoTenDem=" + hoTenDem + ", ten=" + ten + ", ngaySinh=" + ngaySinh
				+ ", soDienThoai=" + soDienThoai + ", gioiTinh=" + gioiTinh + ", avatar=" + avatar + ", diaChi="
				+ diaChi + ", user=" + user + "]";
	}
	
	
	
}
