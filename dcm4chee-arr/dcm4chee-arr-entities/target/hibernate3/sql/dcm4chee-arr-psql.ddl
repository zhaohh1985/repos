
    create table active_part (
        pk int8 not null,
        alt_user_id varchar(255),
        net_access_pt_id varchar(255),
        net_access_pt_type int4,
        user_id varchar(255),
        requestor bool,
        user_name varchar(255),
        role_id_fk int8,
        audit_record_fk int8,
        primary key (pk)
    );

    create table audit_record (
        pk int8 not null,
        iheyr4 bool,
        site_id varchar(255),
        event_action varchar(255),
        event_date_time timestamp,
        event_outcome int4,
        receive_date_time timestamp,
        source_id varchar(255),
        source_type int4,
        xmldata oid,
        event_id_fk int8,
        event_type_fk int8,
        primary key (pk)
    );

    create table code (
        pk int8 not null,
        code_designator varchar(255) not null,
        code_meaning varchar(255),
        code_value varchar(255) not null,
        primary key (pk),
        unique (code_value, code_designator)
    );

    create table part_obj (
        pk int8 not null,
        data_life_cycle int4,
        obj_id varchar(255),
        obj_id_type_rfc int4,
        name varchar(255),
        obj_role int4,
        obj_sensitivity varchar(255),
        obj_type int4,
        audit_record_fk int8,
        obj_id_type_fk int8,
        primary key (pk)
    );

    alter table active_part 
        add constraint FKC154118C9F9901B4 
        foreign key (role_id_fk) 
        references code;

    alter table active_part 
        add constraint FKC154118C327533D4 
        foreign key (audit_record_fk) 
        references audit_record;

    create index ar_receive_date_ti on audit_record (receive_date_time);

    create index ar_event_date_time on audit_record (event_date_time);

    alter table audit_record 
        add constraint FKAF55D13517670399 
        foreign key (event_type_fk) 
        references code;

    alter table audit_record 
        add constraint FKAF55D1354D8CC8D8 
        foreign key (event_id_fk) 
        references code;

    alter table part_obj 
        add constraint FK46D80EAB57A24562 
        foreign key (obj_id_type_fk) 
        references code;

    alter table part_obj 
        add constraint FK46D80EAB327533D4 
        foreign key (audit_record_fk) 
        references audit_record;

    create sequence active_part_pk_seq;

    create sequence audit_record_pk_seq;

    create sequence code_pk_seq;

    create sequence part_obj_pk_seq;
