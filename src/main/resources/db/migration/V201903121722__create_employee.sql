CREATE TABLE person
(
    id      serial                 NOT NULL,
    name    character varying(250) NOT NULL,
    CONSTRAINT person_pkey PRIMARY KEY (id)
)