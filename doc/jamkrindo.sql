-- public.mst_lob definition
-- Drop table
-- DROP TABLE public.mst_lob;
CREATE TABLE public.mst_lob
(
    lob_id     varchar(255) NOT NULL,
    created_at timestamp(6) NULL,
    created_by varchar(255) NULL,
    lob_name   varchar(255) NULL,
    status     int4         NULL DEFAULT 1,
    updated_at timestamp(6) NULL,
    updated_by varchar(255) NULL,
    CONSTRAINT mst_lob_pkey PRIMARY KEY (lob_id)
);

-- public.mst_penyebab_claims definition
-- Drop table
-- DROP TABLE public.mst_penyebab_claims;
CREATE TABLE public.mst_penyebab_claims
(
    penyebab_claim_id varchar(255) NOT NULL,
    created_at        timestamp(6) NULL,
    created_by        varchar(255) NULL,
    penyebab_claim    varchar(255) NULL,
    status            int4         NULL DEFAULT 1,
    updated_at        timestamp(6) NULL,
    updated_by        varchar(255) NULL,
    CONSTRAINT mst_penyebab_claims_pkey PRIMARY KEY (penyebab_claim_id)
);

-- public.trx_claims definition
-- Drop table
-- DROP TABLE public.trx_claims;
CREATE TABLE public.trx_claims
(
    claim_id       varchar(255) NOT NULL,
    created_at     timestamp(6) NULL,
    created_by     varchar(255) NULL,
    lob            varchar(255) NULL,
    nasabah        varchar(255) NULL,
    nilai_claim    varchar(255) NULL,
    penyebab_claim varchar(255) NULL,
    updated_at     timestamp(6) NULL,
    updated_by     varchar(255) NULL,
    status         int4         NULL DEFAULT 1,
    CONSTRAINT trx_claims_pkey PRIMARY KEY (claim_id),
    CONSTRAINT lob_id_fk FOREIGN KEY (lob) REFERENCES public.mst_lob (lob_id),
    CONSTRAINT penyebab_claim_fk FOREIGN KEY (penyebab_claim) REFERENCES public.mst_penyebab_claims (penyebab_claim_id)
);