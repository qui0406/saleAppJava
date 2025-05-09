/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tlaq.utils;

import com.tlaq.pojo.Category;
import com.tlaq.pojo.Comment;
import com.tlaq.pojo.OrderDetail;
import com.tlaq.pojo.ProdTag;
import com.tlaq.pojo.Product;
import com.tlaq.pojo.SaleOrder;
import com.tlaq.pojo.Tag;
import com.tlaq.pojo.User;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.archive.internal.StandardArchiveDescriptorFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.internal.util.PropertiesHelper;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author admin
 */
public class HibernateUtils {
    private static final SessionFactory FACTORY;
    
    static {
        Configuration conf = new Configuration();
        Properties props =new Properties();
        props.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        props.setProperty(Environment.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
        props.setProperty(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost/saledb");
        props.setProperty(Environment.JAKARTA_JDBC_USER, "root");
        props.setProperty(Environment.JAKARTA_JDBC_PASSWORD, "root");
        props.setProperty(Environment.SHOW_SQL, "true");
        
        conf.setProperties(props);
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Comment.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(ProdTag.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(User.class);
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        
        FACTORY = (SessionFactory) conf.buildSessionFactory(serviceRegistry);
    }
    
    public static SessionFactory getFACTORY(){
        return FACTORY;
    }
    
}
