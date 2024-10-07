-- Tabel PO User
CREATE TABLE public."user"
(
    id               int4         NOT NULL,
    created_by       varchar(255) NULL,
    created_datetime timestamp    NULL DEFAULT CURRENT_TIMESTAMP,
    email            varchar(255) NULL,
    first_name       varchar(500) NULL,
    last_name        varchar(500) NULL,
    phone            varchar(255) NULL,
    updated_by       varchar(255) NULL,
    updated_datetime timestamp    NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);

-- Tabel PO Item
CREATE TABLE public.item
(
    id               int4         NOT NULL,
    "cost"           int4         NULL,
    created_by       varchar(255) NULL,
    created_datetime timestamp    NULL DEFAULT CURRENT_TIMESTAMP,
    description      varchar(500) NULL,
    "name"           varchar(500) NULL,
    price            int4         NULL,
    updated_by       varchar(255) NULL,
    updated_datetime timestamp    NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT item_pkey PRIMARY KEY (id)
);

-- Tabel PO Header
CREATE TABLE public.po_h
(
    id               int4         NOT NULL,
    created_by       varchar(255) NULL,
    created_datetime timestamp    NULL DEFAULT CURRENT_TIMESTAMP,
    datetime         timestamp    NULL DEFAULT CURRENT_TIMESTAMP,
    description      varchar(500) NULL,
    total_cost       int4         NULL,
    total_price      int4         NULL,
    updated_by       varchar(255) NULL,
    updated_datetime timestamp    NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT po_h_pkey PRIMARY KEY (id)
);

-- Tabel PO Detail
CREATE TABLE public.po_d
(
    id         int4 NOT NULL,
    item_cost  int4 NULL,
    item_id    int4 NULL,
    item_price int4 NULL,
    item_qty   int4 NULL,
    poh_id     int4 NULL,
    CONSTRAINT po_d_pkey PRIMARY KEY (id),
    CONSTRAINT item_id_fk FOREIGN KEY (item_id) REFERENCES public.item (id),
    CONSTRAINT poh_id_fk FOREIGN KEY (poh_id) REFERENCES public.po_h (id)
);

-- Please insert this query for running service
INSERT INTO public.users (id, created_by, created_datetime, email, first_name, last_name, phone, updated_by, updated_datetime) VALUES(2024100402, 'Administrator', '2024-10-04 00:09:52.679', 'admin@qorri-di.com', 'Administrator', '', '08112622993', '', NULL);