package com.boot.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

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

    @Column(name = "ho_ten_dem", nullable = false)
    private String hoTenDem;
    @Column(name = "ten", nullable = false)
    private String ten;
    @Column(name = "ngay_sinh")
    private Date ngaySinh;
    @Column(name = "so_dien_thoai", nullable = false)
    private String soDienThoai;
    @Column(name = "gioi_tinh")
    private boolean gioiTinh;
    @Column(name = "avatar")
    private String avatar;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "nguoiDung")
    private Set<DiaChi> diaChis;

    @OneToMany(mappedBy = "nguoiDung")
    private Set<HoaDon> hoaDons;

    @OneToOne(mappedBy = "nguoiDung")
    private Cart cart;

    @Override
    public String toString() {
        return "NguoiDung{" +
                "id=" + id +
                ", hoTenDem='" + hoTenDem + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", avatar='" + avatar + '\'' +
                ", user=" + user +
                ", diaChis=" + diaChis +
                ", hoaDons=" + hoaDons +
                ", cart=" + cart +
                '}';
    }

    public NguoiDung(int id, String hoTenDem, String ten, Date ngaySinh, String soDienThoai, boolean gioiTinh, String avatar, User user, Set<DiaChi> diaChis, Set<HoaDon> hoaDons, Cart cart) {
        this.id = id;
        this.hoTenDem = hoTenDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
        this.avatar = avatar;
        this.user = user;
        this.diaChis = diaChis;
        this.hoaDons = hoaDons;
        this.cart = cart;
    }

    public NguoiDung() {
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<DiaChi> getDiaChis() {
        return diaChis;
    }

    public void setDiaChis(Set<DiaChi> diaChis) {
        this.diaChis = diaChis;
    }

    public Set<HoaDon> getHoaDons() {
        return hoaDons;
    }

    public void setHoaDons(Set<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
