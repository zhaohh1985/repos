
    create table ae (
        pk int8 not null,
        ae_group varchar(255),
        cipher_suites varchar(255),
        department varchar(255),
        ae_desc varchar(255),
        fs_group_id varchar(255),
        hostname varchar(255) not null,
        installed bool,
        institution varchar(255),
        acc_no_issuer varchar(255),
        pat_id_issuer varchar(255),
        passwd varchar(255),
        port int4 not null,
        station_name varchar(255),
        aet varchar(255) not null,
        user_id varchar(255),
        wado_url varchar(255),
        primary key (pk)
    );

    create table code (
        pk int8 not null,
        code_meaning varchar(255),
        code_value varchar(255) not null,
        code_designator varchar(255) not null,
        code_version varchar(255),
        primary key (pk)
    );

    create table content_item (
        pk int8 not null,
        rel_type varchar(255),
        text_value varchar(255),
        code_fk int8,
        name_fk int8,
        instance_fk int8,
        primary key (pk)
    );

    create table device (
        pk int8 not null,
        modality varchar(255) not null,
        station_aet varchar(255) not null,
        station_name varchar(255) not null,
        primary key (pk)
    );

    create table files (
        pk int8 not null,
        created_time timestamp,
        filepath varchar(255),
        file_size int8,
        file_status int4,
        file_md5 varchar(255),
        md5_check_time timestamp,
        file_tsuid varchar(255),
        filesystem_fk int8,
        instance_fk int8,
        primary key (pk)
    );

    create table filesystem (
        pk int8 not null,
        availability int4 not null,
        dirpath varchar(255) not null unique,
        fs_group_id varchar(255) not null,
        retrieve_aet varchar(255) not null,
        fs_status int4 not null,
        user_info varchar(255),
        next_fk int8,
        primary key (pk)
    );

    create table gppps (
        pk int8 not null,
        created_time timestamp,
        pps_attrs bytea,
        pps_iuid varchar(255) not null,
        pps_start timestamp,
        pps_status int4 not null,
        updated_time timestamp,
        patient_fk int8,
        primary key (pk)
    );

    create table gpsps (
        pk int8 not null,
        item_attrs bytea,
        end_datetime timestamp,
        in_availability int4,
        gpsps_prior int4,
        gpsps_iuid varchar(255) not null,
        start_datetime timestamp not null,
        gpsps_status int4,
        gpsps_tuid varchar(255),
        patient_fk int8,
        code_fk int8,
        primary key (pk)
    );

    create table gpsps_perf (
        pk int8 not null,
        hum_perf_fn_sx varchar(255),
        hum_perf_gn_sx varchar(255),
        hum_perf_i_name varchar(255),
        human_perf_name varchar(255),
        hum_perf_p_name varchar(255),
        code_fk int8,
        gpsps_fk int8,
        primary key (pk)
    );

    create table gpsps_req (
        pk int8 not null,
        accession_no varchar(255),
        req_proc_id varchar(255),
        gpsps_fk int8,
        primary key (pk)
    );

    create table hp (
        pk int8 not null,
        hp_attrs bytea,
        hp_level int4,
        hp_name varchar(255),
        num_priors int4,
        num_screens int4,
        hp_cuid varchar(255),
        hp_iuid varchar(255) not null,
        hp_group varchar(255),
        user_fk int8,
        primary key (pk)
    );

    create table hpdef (
        pk int8 not null,
        laterality varchar(255),
        modality varchar(255),
        hp_fk int8,
        primary key (pk)
    );

    create table instance (
        pk int8 not null,
        all_attrs bool not null,
        archived bool not null,
        availability int4 not null,
        sr_complete varchar(255),
        content_datetime timestamp,
        created_time timestamp,
        inst_attrs bytea,
        ext_retr_aet varchar(255),
        inst_custom1 varchar(255),
        inst_custom2 varchar(255),
        inst_custom3 varchar(255),
        inst_no varchar(255),
        retrieve_aets varchar(255),
        sop_cuid varchar(255) not null,
        sop_iuid varchar(255) not null,
        commitment bool not null,
        inst_status int4 not null,
        updated_time timestamp,
        sr_verified varchar(255),
        srcode_fk int8,
        media_fk int8,
        series_fk int8,
        primary key (pk)
    );

    create table issuer (
        pk int8 not null,
        entity_id varchar(255),
        entity_uid varchar(255),
        entity_uid_type varchar(255),
        primary key (pk)
    );

    create table media (
        pk int8 not null,
        created_time timestamp,
        fileset_id varchar(255),
        fileset_iuid varchar(255) not null,
        media_rq_iuid varchar(255),
        media_status int4 not null,
        media_status_info varchar(255),
        media_usage int8 not null,
        updated_time timestamp,
        primary key (pk)
    );

    create table mpps (
        pk int8 not null,
        accession_no varchar(255),
        created_time timestamp,
        mpps_attrs bytea,
        modality varchar(255),
        station_aet varchar(255),
        mpps_iuid varchar(255) not null unique,
        pps_start timestamp,
        mpps_status int4 not null,
        updated_time timestamp,
        drcode_fk int8,
        patient_fk int8,
        primary key (pk)
    );

    create table mwl_item (
        pk int8 not null,
        accession_no varchar(255),
        created_time timestamp,
        item_attrs bytea,
        modality varchar(255) not null,
        req_proc_id varchar(255) not null,
        perf_phys_fn_sx varchar(255),
        perf_phys_gn_sx varchar(255),
        perf_phys_i_name varchar(255),
        perf_physician varchar(255),
        perf_phys_p_name varchar(255),
        sps_id varchar(255),
        station_aet varchar(255) not null,
        station_name varchar(255),
        start_datetime timestamp not null,
        sps_status int4,
        study_iuid varchar(255) not null,
        updated_time timestamp,
        patient_fk int8,
        primary key (pk)
    );

    create table other_pid (
        pk int8 not null,
        pat_id_issuer varchar(255) not null,
        pat_id varchar(255) not null,
        primary key (pk)
    );

    create table patient (
        pk int8 not null,
        created_time timestamp,
        pat_attrs bytea,
        pat_id_issuer varchar(255),
        pat_birthdate varchar(255),
        pat_custom1 varchar(255),
        pat_custom2 varchar(255),
        pat_custom3 varchar(255),
        pat_fn_sx varchar(255),
        pat_gn_sx varchar(255),
        pat_id varchar(255),
        pat_i_name varchar(255),
        pat_name varchar(255),
        pat_p_name varchar(255),
        pat_sex varchar(255),
        updated_time timestamp,
        merge_fk int8,
        primary key (pk)
    );

    create table priv_file (
        pk int8 not null,
        file_md5 varchar(255),
        filepath varchar(255) not null,
        file_size int8,
        file_status int4,
        file_tsuid varchar(255) not null,
        filesystem_fk int8,
        instance_fk int8,
        primary key (pk)
    );

    create table priv_instance (
        pk int8 not null,
        created_time timestamp,
        inst_attrs bytea,
        priv_type int4 not null,
        sop_iuid varchar(255) not null,
        series_fk int8,
        primary key (pk)
    );

    create table priv_patient (
        pk int8 not null,
        pat_attrs bytea,
        pat_id_issuer varchar(255),
        pat_id varchar(255),
        pat_name varchar(255),
        priv_type int4 not null,
        primary key (pk)
    );

    create table priv_series (
        pk int8 not null,
        series_attrs bytea,
        priv_type int4 not null,
        series_iuid varchar(255) not null,
        src_aet varchar(255),
        study_fk int8 not null,
        primary key (pk)
    );

    create table priv_study (
        pk int8 not null,
        accession_no varchar(255),
        study_attrs bytea,
        priv_type int4 not null,
        study_iuid varchar(255) not null,
        patient_fk int8,
        primary key (pk)
    );

    create table published_study (
        pk int8 not null,
        created_time timestamp,
        docentry_uid varchar(255),
        doc_uid varchar(255),
        repository_uid varchar(255),
        status int4 not null,
        updated_time timestamp,
        study_fk int8,
        primary key (pk)
    );

    create table rel_dev_proto (
        prcode_fk int8 not null,
        device_fk int8 not null,
        primary key (prcode_fk, device_fk)
    );

    create table rel_gpsps_appcode (
        appcode_fk int8 not null,
        gpsps_fk int8 not null,
        primary key (appcode_fk, gpsps_fk)
    );

    create table rel_gpsps_devclass (
        devclass_fk int8 not null,
        gpsps_fk int8 not null,
        primary key (devclass_fk, gpsps_fk)
    );

    create table rel_gpsps_devloc (
        devloc_fk int8 not null,
        gpsps_fk int8 not null,
        primary key (devloc_fk, gpsps_fk)
    );

    create table rel_gpsps_devname (
        devname_fk int8 not null,
        gpsps_fk int8 not null,
        primary key (devname_fk, gpsps_fk)
    );

    create table rel_gpsps_gppps (
        gppps_fk int8 not null,
        gpsps_fk int8 not null,
        primary key (gppps_fk, gpsps_fk)
    );

    create table rel_hpdef_proc (
        hpdef_fk int8 not null,
        proc_fk int8 not null,
        primary key (hpdef_fk, proc_fk)
    );

    create table rel_hpdef_reason (
        hpdef_fk int8 not null,
        reason_fk int8 not null,
        primary key (hpdef_fk, reason_fk)
    );

    create table rel_hpdef_region (
        hpdef_fk int8 not null,
        region_fk int8 not null,
        primary key (hpdef_fk, region_fk)
    );

    create table rel_pat_other_pid (
        patient_fk int8 not null,
        other_pid_fk int8 not null,
        primary key (other_pid_fk, patient_fk)
    );

    create table rel_study_pcode (
        study_fk int8 not null,
        pcode_fk int8 not null,
        primary key (study_fk, pcode_fk)
    );

    create table rel_ups_appcode (
        ups_fk int8 not null,
        appcode_fk int8 not null,
        primary key (ups_fk, appcode_fk)
    );

    create table rel_ups_devclass (
        ups_fk int8 not null,
        devclass_fk int8 not null,
        primary key (ups_fk, devclass_fk)
    );

    create table rel_ups_devloc (
        ups_fk int8 not null,
        devloc_fk int8 not null,
        primary key (ups_fk, devloc_fk)
    );

    create table rel_ups_devname (
        ups_fk int8 not null,
        devname_fk int8 not null,
        primary key (ups_fk, devname_fk)
    );

    create table rel_ups_performer (
        ups_fk int8 not null,
        performer_fk int8 not null,
        primary key (ups_fk, performer_fk)
    );

    create table series (
        pk int8 not null,
        availability int4 not null,
        body_part varchar(255),
        created_time timestamp,
        series_attrs bytea,
        ext_retr_aet varchar(255),
        fileset_id varchar(255),
        fileset_iuid varchar(255),
        institution varchar(255),
        department varchar(255),
        laterality varchar(255),
        modality varchar(255),
        num_instances int4 not null,
        pps_iuid varchar(255),
        pps_start timestamp,
        perf_phys_fn_sx varchar(255),
        perf_phys_gn_sx varchar(255),
        perf_phys_i_name varchar(255),
        perf_physician varchar(255),
        perf_phys_p_name varchar(255),
        retrieve_aets varchar(255),
        series_custom1 varchar(255),
        series_custom2 varchar(255),
        series_custom3 varchar(255),
        series_desc varchar(255),
        series_iuid varchar(255) not null,
        series_no varchar(255),
        src_aet varchar(255),
        station_name varchar(255),
        series_status int4 not null,
        updated_time timestamp,
        inst_code_fk int8,
        mpps_fk int8,
        study_fk int8,
        primary key (pk)
    );

    create table series_req (
        pk int8 not null,
        accession_no varchar(255),
        req_proc_id varchar(255),
        req_physician varchar(255),
        req_phys_fn_sx varchar(255),
        req_phys_gn_sx varchar(255),
        req_phys_i_name varchar(255),
        req_phys_p_name varchar(255),
        req_service varchar(255),
        sps_id varchar(255),
        study_iuid varchar(255),
        accno_issuer_fk int8,
        series_fk int8,
        primary key (pk)
    );

    create table study (
        pk int8 not null,
        accession_no varchar(255),
        availability int4 not null,
        created_time timestamp,
        study_attrs bytea,
        ext_retr_aet varchar(255),
        fileset_id varchar(255),
        fileset_iuid varchar(255),
        mods_in_study varchar(255),
        num_instances int4 not null,
        num_series int4 not null,
        patient_fk int8,
        ref_phys_fn_sx varchar(255),
        ref_phys_gn_sx varchar(255),
        ref_phys_i_name varchar(255),
        ref_physician varchar(255),
        ref_phys_p_name varchar(255),
        retrieve_aets varchar(255),
        cuids_in_study varchar(255),
        study_custom1 varchar(255),
        study_custom2 varchar(255),
        study_custom3 varchar(255),
        study_datetime timestamp,
        study_desc varchar(255),
        study_id varchar(255),
        study_iuid varchar(255) not null,
        study_status int4 not null,
        study_status_id varchar(255),
        checked_time timestamp,
        updated_time timestamp,
        accno_issuer_fk int8,
        primary key (pk)
    );

    create table study_on_fs (
        pk int8 not null,
        access_time timestamp not null,
        mark_to_delete bool not null,
        filesystem_fk int8,
        study_fk int8,
        primary key (pk)
    );

    create table study_permission (
        pk int8 not null,
        action varchar(255) not null,
        roles varchar(255) not null,
        study_iuid varchar(255) not null,
        primary key (pk)
    );

    create table ups (
        pk int8 not null,
        adm_id varchar(255),
        created_time timestamp,
        ups_attrs bytea,
        ups_compl_time timestamp,
        adm_id_issuer_id varchar(255),
        adm_id_issuer_uid varchar(255),
        ups_prior int4,
        ups_label varchar(255) not null,
        ups_start_time timestamp not null,
        ups_iuid varchar(255) not null,
        ups_state int4,
        ups_tuid varchar(255),
        updated_time timestamp,
        uwl_label varchar(255) not null,
        patient_fk int8,
        primary key (pk)
    );

    create table ups_rel_ps (
        pk int8 not null,
        sop_cuid varchar(255),
        sop_iuid varchar(255),
        ups_fk int8,
        primary key (pk)
    );

    create table ups_repl_ps (
        pk int8 not null,
        sop_cuid varchar(255),
        sop_iuid varchar(255),
        ups_fk int8,
        primary key (pk)
    );

    create table ups_req (
        pk int8 not null,
        accession_no varchar(255),
        confidentiality varchar(255),
        req_proc_id varchar(255),
        req_service varchar(255),
        ups_fk int8,
        primary key (pk)
    );

    create table ups_subscr (
        pk int8 not null,
        aet varchar(255),
        deletion_lock bool,
        ups_fk int8,
        primary key (pk)
    );

    create table verify_observer (
        pk int8 not null,
        verify_datetime timestamp,
        observer_fn_sx varchar(255),
        observer_gn_sx varchar(255),
        observer_i_name varchar(255),
        observer_name varchar(255),
        observer_p_name varchar(255),
        instance_fk int8,
        primary key (pk)
    );

    alter table content_item 
        add constraint FK318FE31937EDB1AA 
        foreign key (instance_fk) 
        references instance;

    alter table content_item 
        add constraint FK318FE31970C135AA 
        foreign key (code_fk) 
        references code;

    alter table content_item 
        add constraint FK318FE3199F40BC4C 
        foreign key (name_fk) 
        references code;

    alter table files 
        add constraint FK5CEBA7737EDB1AA 
        foreign key (instance_fk) 
        references instance;

    alter table files 
        add constraint FK5CEBA77206F5C8A 
        foreign key (filesystem_fk) 
        references filesystem;

    alter table filesystem 
        add constraint FKA2455AABE9B3E742 
        foreign key (next_fk) 
        references filesystem;

    alter table gppps 
        add constraint FK5E010EAA511AE1E 
        foreign key (patient_fk) 
        references patient;

    alter table gpsps 
        add constraint FK5E01C2D70C135AA 
        foreign key (code_fk) 
        references code;

    alter table gpsps 
        add constraint FK5E01C2DA511AE1E 
        foreign key (patient_fk) 
        references patient;

    alter table gpsps_perf 
        add constraint FKC00AA3BB9637239E 
        foreign key (gpsps_fk) 
        references gpsps;

    alter table gpsps_perf 
        add constraint FKC00AA3BB70C135AA 
        foreign key (code_fk) 
        references code;

    alter table gpsps_req 
        add constraint FKA319258C9637239E 
        foreign key (gpsps_fk) 
        references gpsps;

    alter table hp 
        add constraint FKD082FD8C30C 
        foreign key (user_fk) 
        references code;

    alter table hpdef 
        add constraint FK5EDF9FDC7D4B11E 
        foreign key (hp_fk) 
        references hp;

    alter table instance 
        add constraint FK211694958151AFEA 
        foreign key (series_fk) 
        references series;

    alter table instance 
        add constraint FK21169495A5F47C3E 
        foreign key (media_fk) 
        references media;

    alter table instance 
        add constraint FK211694954DC50E6B 
        foreign key (srcode_fk) 
        references code;

    alter table mpps 
        add constraint FK333EE69DC28D5C 
        foreign key (drcode_fk) 
        references code;

    alter table mpps 
        add constraint FK333EE6A511AE1E 
        foreign key (patient_fk) 
        references patient;

    alter table mwl_item 
        add constraint FK8F9D3D30A511AE1E 
        foreign key (patient_fk) 
        references patient;

    alter table patient 
        add constraint FKD0D3EB05206840B 
        foreign key (merge_fk) 
        references patient;

    alter table priv_file 
        add constraint FKA16B610C242260C1 
        foreign key (instance_fk) 
        references priv_instance;

    alter table priv_file 
        add constraint FKA16B610C206F5C8A 
        foreign key (filesystem_fk) 
        references filesystem;

    alter table priv_instance 
        add constraint FK9891B8255C4538C1 
        foreign key (series_fk) 
        references priv_series;

    alter table priv_series 
        add constraint FKA10C6078477F667 
        foreign key (study_fk) 
        references priv_study;

    alter table priv_study 
        add constraint FK8CBD1439288F4027 
        foreign key (patient_fk) 
        references priv_patient;

    alter table published_study 
        add constraint FK707B68384BDB761E 
        foreign key (study_fk) 
        references study;

    alter table rel_dev_proto 
        add constraint FKA8591518E207F051 
        foreign key (prcode_fk) 
        references device;

    alter table rel_dev_proto 
        add constraint FKA85915183A1E80A1 
        foreign key (device_fk) 
        references code;

    alter table rel_gpsps_appcode 
        add constraint FKB35F8056F3B2489D 
        foreign key (appcode_fk) 
        references gpsps;

    alter table rel_gpsps_appcode 
        add constraint FKB35F8056F38E1F6A 
        foreign key (gpsps_fk) 
        references code;

    alter table rel_gpsps_devclass 
        add constraint FKB48B32BBE6672D88 
        foreign key (devclass_fk) 
        references gpsps;

    alter table rel_gpsps_devclass 
        add constraint FKB48B32BBF38E1F6A 
        foreign key (gpsps_fk) 
        references code;

    alter table rel_gpsps_devloc 
        add constraint FK862EA143E28E4000 
        foreign key (devloc_fk) 
        references gpsps;

    alter table rel_gpsps_devloc 
        add constraint FK862EA143F38E1F6A 
        foreign key (gpsps_fk) 
        references code;

    alter table rel_gpsps_devname 
        add constraint FK3FA63CE8F646ACB 
        foreign key (devname_fk) 
        references gpsps;

    alter table rel_gpsps_devname 
        add constraint FK3FA63CE8F38E1F6A 
        foreign key (gpsps_fk) 
        references code;

    alter table rel_gpsps_gppps 
        add constraint FKDB38F3B291188E7E 
        foreign key (gppps_fk) 
        references gppps;

    alter table rel_gpsps_gppps 
        add constraint FKDB38F3B29637239E 
        foreign key (gpsps_fk) 
        references gpsps;

    alter table rel_hpdef_proc 
        add constraint FK70548BBE262ADBA1 
        foreign key (proc_fk) 
        references code;

    alter table rel_hpdef_proc 
        add constraint FK70548BBEC4325808 
        foreign key (hpdef_fk) 
        references hpdef;

    alter table rel_hpdef_reason 
        add constraint FKB00D00ACC4325808 
        foreign key (hpdef_fk) 
        references hpdef;

    alter table rel_hpdef_reason 
        add constraint FKB00D00AC10B75DF3 
        foreign key (reason_fk) 
        references code;

    alter table rel_hpdef_region 
        add constraint FKB00F955C3D0C4B43 
        foreign key (region_fk) 
        references code;

    alter table rel_hpdef_region 
        add constraint FKB00F955CC4325808 
        foreign key (hpdef_fk) 
        references hpdef;

    alter table rel_pat_other_pid 
        add constraint FK929DDE1A23ED359E 
        foreign key (other_pid_fk) 
        references other_pid;

    alter table rel_pat_other_pid 
        add constraint FK929DDE1AA511AE1E 
        foreign key (patient_fk) 
        references patient;

    alter table rel_study_pcode 
        add constraint FK2EF025C1E344D73A 
        foreign key (pcode_fk) 
        references code;

    alter table rel_study_pcode 
        add constraint FK2EF025C14BDB761E 
        foreign key (study_fk) 
        references study;

    alter table rel_ups_appcode 
        add constraint FK7F11DCE151094469 
        foreign key (appcode_fk) 
        references code;

    alter table rel_ups_appcode 
        add constraint FK7F11DCE17504163E 
        foreign key (ups_fk) 
        references ups;

    alter table rel_ups_devclass 
        add constraint FK5F24679043BE2954 
        foreign key (devclass_fk) 
        references code;

    alter table rel_ups_devclass 
        add constraint FK5F2467907504163E 
        foreign key (ups_fk) 
        references ups;

    alter table rel_ups_devloc 
        add constraint FKADC907583FE53BCC 
        foreign key (devloc_fk) 
        references code;

    alter table rel_ups_devloc 
        add constraint FKADC907587504163E 
        foreign key (ups_fk) 
        references ups;

    alter table rel_ups_devname 
        add constraint FKB5899736CBB6697 
        foreign key (devname_fk) 
        references code;

    alter table rel_ups_devname 
        add constraint FKB5899737504163E 
        foreign key (ups_fk) 
        references ups;

    alter table rel_ups_performer 
        add constraint FKAA5544618976EC29 
        foreign key (performer_fk) 
        references code;

    alter table rel_ups_performer 
        add constraint FKAA5544617504163E 
        foreign key (ups_fk) 
        references ups;

    alter table series 
        add constraint FKCA01FE77B729CB1 
        foreign key (inst_code_fk) 
        references code;

    alter table series 
        add constraint FKCA01FE774BDB761E 
        foreign key (study_fk) 
        references study;

    alter table series 
        add constraint FKCA01FE778427EAEA 
        foreign key (mpps_fk) 
        references mpps;

    alter table series_req 
        add constraint FKE38CD2D6C45E7AAD 
        foreign key (accno_issuer_fk) 
        references issuer;

    alter table series_req 
        add constraint FKE38CD2D68151AFEA 
        foreign key (series_fk) 
        references series;

    alter table study 
        add constraint FK68B0DC9C45E7AAD 
        foreign key (accno_issuer_fk) 
        references issuer;

    alter table study 
        add constraint FK68B0DC9A511AE1E 
        foreign key (patient_fk) 
        references patient;

    alter table study_on_fs 
        add constraint FK947DD9374BDB761E 
        foreign key (study_fk) 
        references study;

    alter table study_on_fs 
        add constraint FK947DD937206F5C8A 
        foreign key (filesystem_fk) 
        references filesystem;

    alter table ups 
        add constraint FK1C538A511AE1E 
        foreign key (patient_fk) 
        references patient;

    alter table ups_rel_ps 
        add constraint FK9762B0507504163E 
        foreign key (ups_fk) 
        references ups;

    alter table ups_repl_ps 
        add constraint FK553160CC7504163E 
        foreign key (ups_fk) 
        references ups;

    alter table ups_req 
        add constraint FKF2D951177504163E 
        foreign key (ups_fk) 
        references ups;

    alter table ups_subscr 
        add constraint FK99F4BEC97504163E 
        foreign key (ups_fk) 
        references ups;

    alter table verify_observer 
        add constraint FKC9DB73DC37EDB1AA 
        foreign key (instance_fk) 
        references instance;

    create sequence ae_pk_seq;

    create sequence code_pk_seq;

    create sequence content_item_pk_seq;

    create sequence device_pk_seq;

    create sequence files_pk_seq;

    create sequence filesystem_pk_seq;

    create sequence gppps_pk_seq;

    create sequence gpsps_perf_pk_seq;

    create sequence gpsps_pk_seq;

    create sequence gpsps_req_pk_seq;

    create sequence hp_pk_seq;

    create sequence hpdef_pk_seq;

    create sequence instance_pk_seq;

    create sequence issuer_pk_seq;

    create sequence media_pk_seq;

    create sequence mpps_pk_seq;

    create sequence mwl_item_pk_seq;

    create sequence other_pid_pk_seq;

    create sequence patient_pk_seq;

    create sequence priv_file_pk_seq;

    create sequence priv_instance_pk_seq;

    create sequence priv_patient_pk_seq;

    create sequence priv_series_pk_seq;

    create sequence priv_study_pk_seq;

    create sequence published_study_pk_seq;

    create sequence series_pk_seq;

    create sequence series_req_pk_seq;

    create sequence study_on_fs_pk_seq;

    create sequence study_permission_pk_seq;

    create sequence study_pk_seq;

    create sequence ups_pk_seq;

    create sequence ups_rel_ps_pk_seq;

    create sequence ups_repl_ps_pk_seq;

    create sequence ups_req_pk_seq;

    create sequence ups_subscr_pk_seq;

    create sequence verify_observer_pk_seq;
