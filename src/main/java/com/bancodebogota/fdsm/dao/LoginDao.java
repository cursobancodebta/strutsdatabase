package com.bancodebogota.fdsm.dao;

import com.bancodebogota.fdsm.config.SimpleDataSource;
import com.bancodebogota.fdsm.dto.UserDto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jpramirez
 */
public interface LoginDao {

    UserDto obtenerUsuario(UserDto userDto);

}
