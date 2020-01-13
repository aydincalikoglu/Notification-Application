package com.gtu.translatednotification.repository;

import com.gtu.translatednotification.model.dao.Event;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public
interface EventRepo extends JpaRepository<Event, Long>, JpaSpecificationExecutor<Event> {

    static Specification<Event> typeFilter(String type) {
        return (event, query, cb) -> cb.equal(event.get("type"), type);
    }

    static Specification<Event> statusFilter(Long status) {
        return (event, query, cb) -> cb.equal(event.get("status"), status);
    }

}
