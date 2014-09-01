package com.equivi.mailsy.data.dao;

import com.equivi.mailsy.data.entity.CampaignEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignDao extends JpaRepository<CampaignEntity, Long>, QueryDslPredicateExecutor<CampaignEntity> {
}
