package com.qorri.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClaimsReadDTO {
    private Integer limit;
    private Integer offset;
    private Integer page;
}
