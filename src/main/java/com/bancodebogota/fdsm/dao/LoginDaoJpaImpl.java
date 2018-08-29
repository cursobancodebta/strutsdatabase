/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdsm.dao;

import com.bancodebogota.fdsm.dto.UserDto;
import com.bancodebogota.fdsm.entity.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.modelmapper.ModelMapper;

/**
 *
 * @author jpramirez
 */
public class LoginDaoJpaImpl implements LoginDao {

    private SessionFactory sf;

    public LoginDaoJpaImpl(SessionFactory sf) {
        this.sf = sf;
    }

    public UserDto obtenerUsuario(UserDto userDto) {

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        @SuppressWarnings("deprecated")
        Query query = session.createQuery("from UserEntity where login=:id and password=:pwd");
        query.setString("id", userDto.getLogin());
        query.setString("pwd", userDto.getPassword());
        UserEntity user = (UserEntity) query.uniqueResult();
        if (user != null) {
            System.out.println("User Retrieved from DB::" + user);
        }
        tx.commit();
        session.close();
        return getDTO(user);
    }
    
    
    private UserDto getDTO(UserEntity user){
        ModelMapper modelMapper = new ModelMapper();
        UserDto dto = modelMapper.map(user, UserDto.class);
        return dto;
    }
}
