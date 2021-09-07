/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author AD
 */
@Entity
@Table(name="phong")
public class Phong implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPhong;
    private String tenPhong;
    private BigDecimal giaPhong;
    private boolean tinhTrang;

    /**
     * @return the idPhong
     */
    public int getIdPhong() {
        return idPhong;
    }

    /**
     * @param idPhong the idPhong to set
     */
    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    /**
     * @return the tenPhong
     */
    public String getTenPhong() {
        return tenPhong;
    }

    /**
     * @param tenPhong the tenPhong to set
     */
    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    /**
     * @return the giaPhong
     */
    public BigDecimal getGiaPhong() {
        return giaPhong;
    }

    /**
     * @param giaPhong the giaPhong to set
     */
    public void setGiaPhong(BigDecimal giaPhong) {
        this.giaPhong = giaPhong;
    }

    /**
     * @return the tinhTrang
     */
    public boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

   

    
}
