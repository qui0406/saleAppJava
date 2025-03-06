/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tlaq.springsaleapp;

import com.tlaq.RepositoryImpl.CategoryRepositoryImpl;
import com.tlaq.RepositoryImpl.ProductRepositoryImpl;
import com.tlaq.RepositoryImpl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class SpringSaleApp {

    public static void main(String[] args) {
//        CategoryRepositoryImpl s= new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));
//        
//        ProductRepositoryImpl s2= new ProductRepositoryImpl();
//        
//        Map<String, String> params= new HashMap<>();
//        params.put("kw", "iPhone");
//        params.put("fromPrice", "30000000");
//        s2.getProducts(params).forEach(p-> System.out.printf("%d - %s - %d\n",
//            p.getId(), p.getName(), p.getPrice()));
        StatsRepositoryImpl s = new StatsRepositoryImpl();
        s.statsRevenueByProduct().forEach(o-> System.out.printf("%d - %s: %d\n", o[0], o[1], o[2]));
    }
}
