DROP DATABASE IF EXISTS osboxes;

CREATE DATABASE osboxes
    WITH
    OWNER = postgres
    ENCODING = 'UTF8';

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

GRANT ALL ON DATABASE osboxes TO postgres;

\c osboxes;

DROP TABLE IF EXISTS public.jaegers;

CREATE TABLE IF NOT EXISTS public.jaegers
(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    "modelName" character varying NOT NULL,
    mark character varying,
    height numeric,
    weight numeric,
    status character varying NOT NULL,
    origin character varying,
    launch date,
    "kaijuKill" integer,
    CONSTRAINT "Jaegers_pkey" PRIMARY KEY (id)
)   TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.jaegers OWNER to postgres;

\ir init_db.sql;

\ir queries.sql;
