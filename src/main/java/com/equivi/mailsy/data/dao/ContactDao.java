package com.equivi.mailsy.data.dao;

import com.equivi.mailsy.data.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends JpaRepository<ContactEntity, Long>, QueryDslPredicateExecutor<ContactEntity> {
}
