package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;
//能够将bean装入容器
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
