/*
 * Copyright (c) 2016. MomentumVinum.com
 */

package com.momentumvinum.beans;

/**
 * Created by Leonardo Martinez Ubal a.k.a 'Leosssdroid' on 08/10/2016.
 */
public class Producto {

    private int id;
    private String nombre;
    private String tipo;
    private enum tipo { Aceite, Blanco, Cava, Cerveza, Champagne, Ginebra, Licores, Rosado, Tinto, Vodka, Whisky};
    private float precio_venta_tienda;
    private float precio_mayorista;
    private String imagen;
    private float peso;
    private int cantidad;
    private int cantidad_minima;
    private String fabricante;
    private String distribuidor;
    private Caracteristicas caracteristicas;
    private Seo seo_es;
    private Seo seo_cat;
    private Seo seo_en;
    private Info info_es;
    private Info info_cat;
    private Info info_en;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_venta_tienda() {
        return precio_venta_tienda;
    }

    public void setPrecio_venta_tienda(float precio_venta_tienda) {
        this.precio_venta_tienda = precio_venta_tienda;
    }

    public float getPrecio_mayorista() {
        return precio_mayorista;
    }

    public void setPrecio_mayorista(float precio_mayorista) {
        this.precio_mayorista = precio_mayorista;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad_minima() {
        return cantidad_minima;
    }

    public void setCantidad_minima(int cantidad_minima) {
        this.cantidad_minima = cantidad_minima;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Seo getSeo_es() {
        return seo_es;
    }

    public void setSeo_es(Seo seo_es) {
        this.seo_es = seo_es;
    }

    public Seo getSeo_cat() {
        return seo_cat;
    }

    public void setSeo_cat(Seo seo_cat) {
        this.seo_cat = seo_cat;
    }

    public Seo getSeo_en() {
        return seo_en;
    }

    public void setSeo_en(Seo seo_en) {
        this.seo_en = seo_en;
    }

    public Info getInfo_es() {
        return info_es;
    }

    public void setInfo_es(Info info_es) {
        this.info_es = info_es;
    }

    public Info getInfo_cat() {
        return info_cat;
    }

    public void setInfo_cat(Info info_cat) {
        this.info_cat = info_cat;
    }

    public Info getInfo_en() {
        return info_en;
    }

    public void setInfo_en(Info info_en) {
        this.info_en = info_en;
    }
}

