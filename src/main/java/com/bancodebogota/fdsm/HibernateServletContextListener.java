/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdsm;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.SessionFactory;

/**
 *
 * @author jpramirez
 */
public class HibernateServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        EntityManagerFactory emFactory = emFactory = Persistence.createEntityManagerFactory("test");
        sce.getServletContext().setAttribute("EntityManagerFactory", emFactory);      
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        EntityManagerFactory emFactory = (EntityManagerFactory) sce.getServletContext().getAttribute("EntityManagerFactory");
        emFactory.close();
    }

}
