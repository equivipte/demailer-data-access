package com.equivi.mailsy.data.dao;

import com.equivi.mailsy.data.entity.SubscriberGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberGroupDao extends JpaRepository<SubscriberGroupEntity, Long>, QueryDslPredicateExecutor<SubscriberGroupEntity> {
}
