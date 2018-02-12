package com.wuzhi.sprout.repository.management;

import com.wuzhi.sprout.model.management.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
