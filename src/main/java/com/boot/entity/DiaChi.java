package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DIA_CHI")
public class DiaChi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "phuong_xa", nullable = false)
    private String phuongXa;
    @Column(name = "quan_huyen", nullable = false)
    private String quanHuyen;
    @Column(name = "tinh_thanhpho", nullable = false)
    private String tinhThanhPho;

    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id", nullable = false)
    private NguoiDung nguoiDung;

    @Override
    public String toString() {
        return "DiaChi{" +
                "id='" + id + '\'' +
                ", phuongXa='" + phuongXa + '\'' +
                ", quanHuyen='" + quanHuyen + '\'' +
                ", tinhThanhPho='" + tinhThanhPho + '\'' +
                ", nguoiDung=" + nguoiDung +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(String tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public DiaChi() {
    }

    public DiaChi(String id, String phuongXa, String quanHuyen, String tinhThanhPho, NguoiDung nguoiDung) {
        this.id = id;
        this.phuongXa = phuongXa;
        this.quanHuyen = quanHuyen;
        this.tinhThanhPho = tinhThanhPho;
        this.nguoiDung = nguoiDung;
    }
}
