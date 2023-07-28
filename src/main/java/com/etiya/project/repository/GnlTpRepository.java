package com.etiya.project.repository;

import com.etiya.project.DTOs.GeneralType;
import com.etiya.project.entities.GnlTpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GnlTpRepository extends JpaRepository<GnlTpEntity, Long> {


    GnlTpEntity findByShrtCodeAndActv(String shrtCode, boolean actv);

    GnlTpEntity findByGnlTpId(Long id);
}
