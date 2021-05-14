package com.boot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chi_tiet_hoa_don")
public class ChiTietHoaDon implements Serializable {

    @Column(name = "so_luong", nullable = false)
    private int soLuong;

    @Id
    @ManyToOne
    @JoinColumn(name = "san_pham_id")
    private SanPham sanPham;

    @Id
    @ManyToOne
    @JoinColumn(name = "hoa_don_id", nullable = true)
    private HoaDon hoaDon;

    @Id
    @ManyToOne
    @JoinColumn(name = "gio_hang_id", nullable = true)
    private Cart cart;

    @Column(name = "gia_ban", nullable = false)
    public double tinhGiaBan() {
        return 0;
    }
}
