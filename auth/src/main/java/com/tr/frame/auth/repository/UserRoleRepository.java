package com.tr.frame.auth.repository;

import com.tr.frame.auth.entity.UserRole;
import com.tr.frame.auth.entity.pk.UserRolePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRoleRepository extends JpaRepository<UserRole, UserRolePK>, JpaSpecificationExecutor<UserRole> {
}
