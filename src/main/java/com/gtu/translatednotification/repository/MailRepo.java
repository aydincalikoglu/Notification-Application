package com.gtu.translatednotification.repository;

import com.gtu.translatednotification.model.dao.Mail;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public
interface MailRepo extends JpaRepository<Mail, Long>, JpaSpecificationExecutor<Mail> {

    static Specification<Mail> typeFilter(String type) {
        return (mail, cq, cb) -> cb.equal(mail.get("type"), type);
    }

}
