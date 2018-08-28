/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdsm.controller;

import com.bancodebogota.fdsm.dao.LoginDao;
import com.bancodebogota.fdsm.dto.UserDto;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author jpramirez
 */
public class LoginAction extends ActionSupport {

    private UserDto userDto;

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    @Override
    public String execute() {
        //userDto = new UserDto();
        
        UserDto us =  LoginDao.getInstance().obtenerUsuario(userDto);
        if(us==null){
             return ERROR;
        }else{
            return SUCCESS+"Tiles";
        }

        
    }

    public void validate() {
        if (userDto.getName().length() == 0) {
            addFieldError("userDto.name", "Name is required.");
        }

        if (userDto.getPassword().length() == 0) {
            addFieldError("userDto.password", "Password is required.");
        }
    }
}
