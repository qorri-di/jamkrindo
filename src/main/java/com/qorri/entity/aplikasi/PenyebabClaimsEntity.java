package com.qorri.entity.aplikasi;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mst_penyebab_claims",schema = "public")
public class PenyebabClaimsEntity implements Serializable{
    @Id
    @Column(name = "penyebab_claim_id")
    private String id;

    @Column(name = "penyebab_claim")
    private String name;

    @Column(name = "status", columnDefinition = "integer default 1")
    private Integer status;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_by")
    private String updated_by;

    @Column(name = "updated_at")
    private Date updated_at;
}
