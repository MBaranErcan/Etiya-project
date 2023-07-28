package com.etiya.project.repository;

import com.etiya.project.DTOs.GeneralStatus;
import com.etiya.project.entities.GnlStEntity;
import com.etiya.project.entities.GnlTpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GnlStRepository extends JpaRepository<GnlStEntity, Long> {


    GnlStEntity findByShrtCodeAndActvAndEntCodeName(String shrtCode, boolean actv, String codeName);

    GnlStEntity findByGnlStId(Long id);


}
