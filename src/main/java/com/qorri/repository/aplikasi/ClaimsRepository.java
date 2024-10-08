package com.qorri.repository.aplikasi;

import com.qorri.entity.aplikasi.ClaimsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimsRepository extends JpaRepository<ClaimsEntity, String> {
}
