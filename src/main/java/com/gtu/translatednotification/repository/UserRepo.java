package com.gtu.translatednotification.repository;

import com.gtu.translatednotification.model.dao.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public
interface UserRepo extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    static Specification<User> statusFilter(Long status) {
        return (user, query, cb) -> cb.equal(user.get("status"), status);
    }

    static Specification<User> countryCodeFilter(String countryCode) {
        return (user, query, cb) -> cb.equal(user.get("countryCode"), countryCode);
    }

}
