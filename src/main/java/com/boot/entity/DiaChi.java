package com.boot.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DIA_CHI")
public class DiaChi implements Serializable {

    @Column(name = "phuong_xa", nullable = false)
    @Nationalized
    private String phuongXa;
    @Column(name = "quan_huyen", nullable = false)
    @Nationalized
    private String quanHuyen;
    @Column(name = "tinh_thanhpho", nullable = false)
    @Nationalized
    private String tinhThanhPho;

    @Id
    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id", nullable = false)
    private NguoiDung nguoiDung;

    @Override
    public String toString() {
        return "DiaChi{" +
                "phuongXa='" + phuongXa + '\'' +
                ", quanHuyen='" + quanHuyen + '\'' +
                ", tinhThanhPho='" + tinhThanhPho + '\'' +
                ", nguoiDung=" + nguoiDung +
                '}';
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

    public DiaChi(String phuongXa, String quanHuyen, String tinhThanhPho, NguoiDung nguoiDung) {
        this.phuongXa = phuongXa;
        this.quanHuyen = quanHuyen;
        this.tinhThanhPho = tinhThanhPho;
        this.nguoiDung = nguoiDung;
    }
}
