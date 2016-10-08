/*
 * Copyright (c) 2016.  - MomentumVinum.com
 */

package com.momentumvinum.dao;

import com.momentumvinum.beans.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by Leonardo Martinez Ubal a.k.a 'Leosssdroid' on 08/10/2016.
 */
@Repository
public class DAOProductoImpl implements DAOProducto {

    @Autowired
    private DataSource dataSource;

    public void registrar(Producto producto) throws Exception {
        String sql = "INSERT INTO productos(id,nombre,tipo) values (?,?,?)";
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, producto.getId());
            ps.setString(2,producto.getNombre());
            ps.setString(3,producto.getTipo());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (conn != null){
                conn.close();
            }
        }
    }
}
