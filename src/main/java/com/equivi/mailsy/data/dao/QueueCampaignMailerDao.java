package com.equivi.mailsy.data.dao;

import com.equivi.mailsy.data.entity.QueueCampaignMailerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueCampaignMailerDao extends JpaRepository<QueueCampaignMailerEntity, Long>, QueryDslPredicateExecutor<QueueCampaignMailerEntity> {
}
