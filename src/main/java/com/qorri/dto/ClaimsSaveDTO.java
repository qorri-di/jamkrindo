package com.qorri.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClaimsSaveDTO {
    private String id;
    private Integer periode;
    private String lob;
    private String penyebab_claim;
    private String nasabah;
    private String nilai_claim;
}
