/*
 * Copyright (c) 2016.  - MomentumVinum.com
 */

package com.momentumvinum.service;

import com.momentumvinum.beans.Producto;
import com.momentumvinum.dao.DAOProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Leonardo Martinez Ubal a.k.a 'Leosssdroid' on 08/10/2016.
 */
@Service
public class ServiceProductoImpl implements ServiceProducto{

    @Autowired
    private DAOProducto daoProducto;

    public void registrar(Producto producto) throws Exception {
        try {
            daoProducto.registrar(producto);
        }catch (Exception e){
            System.out.println("MEEEC!");
        }
    }
}
