package com.equivi.mailsy.data.dao;


import com.equivi.mailsy.data.entity.QuotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface QuotaDao extends JpaRepository<QuotaEntity, Long>, QueryDslPredicateExecutor<QuotaEntity>  {
}
