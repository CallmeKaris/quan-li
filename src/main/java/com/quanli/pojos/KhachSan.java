/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quanli.pojos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author AD
 */
@Entity
@Table(name="khachsan")
public class KhachSan implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idkhachsan;
    private String tenKS;
    private String thanhPho;
    @ManyToOne
    @JoinColumn(name="idPhong")
    private Phong idPhong;

    /**
     * @return the idkhachsan
     */
    public int getIdkhachsan() {
        return idkhachsan;
    }

    /**
     * @param idkhachsan the idkhachsan to set
     */
    public void setIdkhachsan(int idkhachsan) {
        this.idkhachsan = idkhachsan;
    }

    /**
     * @return the tenKS
     */
    public String getTenKS() {
        return tenKS;
    }

    /**
     * @param tenKS the tenKS to set
     */
    public void setTenKS(String tenKS) {
        this.tenKS = tenKS;
    }

    /**
     * @return the thanhPho
     */
    public String getThanhPho() {
        return thanhPho;
    }

    /**
     * @param thanhPho the thanhPho to set
     */
    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    /**
     * @return the idPhong
     */
    public Phong getIdPhong() {
        return idPhong;
    }

    /**
     * @param idPhong the idPhong to set
     */
    public void setIdPhong(Phong idPhong) {
        this.idPhong = idPhong;
    }

}
