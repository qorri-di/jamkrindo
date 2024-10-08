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
@Table(name = "trx_claims",schema = "public")
public class ClaimsEntity implements Serializable {
    @Id
    @Column(name = "claim_id")
    private String id;

    @Column(name = "lob")
    private String lob;

    @Column(name = "penyebab_claim")
    private String penyebab_claim;

    @Column(name = "nasabah")
    private String nasabah;

    @Column(name = "nilai_claim")
    private String nilai_claim;

    @Column(name = "status", columnDefinition = "integer default 1")
    private Integer status;

    @Column(name = "periode")
    private Integer periode;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_by")
    private String updated_by;

    @Column(name = "updated_at")
    private Date updated_at;
}
