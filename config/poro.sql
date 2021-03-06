CREATE TABLE company(
        company_name Varchar (255) NOT NULL ,
        address      Varchar (255) ,
        description  Text ,
        linkLinkedin Varchar (150) ,
        linkWebsite	 Varchar (150) ,
        siret        Varchar (14) ,
        phone        Varchar (15) ,
        appuser_id   Double NOT NULL ,
        PRIMARY KEY (appuser_id )
)ENGINE=InnoDB;


CREATE TABLE candidate(
        firstname               Varchar (255) ,
        lastname                Varchar (255) ,
        phone                   Varchar (15) ,
        transport               Varchar (25) ,
        presentation            Text ,
        linkLinkedin            Varchar (255) ,
        linkGitHub				Varchar (255) ,
        certificate_in_progress Varchar (255) ,
        appuser_id              Double NOT NULL ,
        PRIMARY KEY (appuser_id )
)ENGINE=InnoDB;


CREATE TABLE post(
        post_id         Double Auto_increment  NOT NULL ,
        post_name       Varchar (100) NOT NULL ,
        presentation    Text ,
        created_at      Datetime ,
        updated_at      Datetime ,
        mail_agent      Varchar (100) ,
        firstname_agent Varchar (150) ,
        lastname_agent  Varchar (150) NOT NULL ,
        appuser_id      Double NOT NULL ,
        PRIMARY KEY (post_id )
)ENGINE=InnoDB;


CREATE TABLE skill(
        skill_id   Double Auto_increment  NOT NULL ,
        skill_name Varchar (255) ,
        PRIMARY KEY (skill_id )
)ENGINE=InnoDB;


CREATE TABLE appuser(
        appuser_id   Double Auto_increment  NOT NULL ,
        role_appuser Varchar (50) NOT NULL ,
        mail         Varchar (255) NOT NULL ,
        password     Varchar (50) NOT NULL ,
        created_at   Datetime NOT NULL,
        updated_at   Datetime NOT NULL,
        PRIMARY KEY (appuser_id )
)ENGINE=InnoDB;


CREATE TABLE administrator(
        administrator_name Varchar (100) ,
        appuser_id         Double NOT NULL ,
        PRIMARY KEY (appuser_id )
)ENGINE=InnoDB;


CREATE TABLE certificate(
        id_certif   Double Auto_increment  NOT NULL ,
        certificate Varchar (255) NOT NULL ,
        PRIMARY KEY (id_certif )
)ENGINE=InnoDB;


CREATE TABLE need(
        indice_priorite Int ,
        post_id         Double NOT NULL ,
        skill_id        Double NOT NULL ,
        PRIMARY KEY (post_id ,skill_id )
)ENGINE=InnoDB;


CREATE TABLE own(
        indice_masteries Int ,
        skill_id         Double NOT NULL ,
        appuser_id       Double NOT NULL ,
        PRIMARY KEY (skill_id ,appuser_id )
)ENGINE=InnoDB;


CREATE TABLE graduate(
        id_certif  Double NOT NULL ,
        appuser_id Double NOT NULL ,
        PRIMARY KEY (id_certif ,appuser_id )
)ENGINE=InnoDB;


ALTER TABLE company 
	ADD CONSTRAINT FK_company_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser(appuser_id);

ALTER TABLE candidate 
	ADD CONSTRAINT FK_candidate_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser(appuser_id);

ALTER TABLE post 
	ADD CONSTRAINT FK_post_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser(appuser_id);

ALTER TABLE administrator 
	ADD CONSTRAINT FK_administrator_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser(appuser_id);

ALTER TABLE need 
	ADD CONSTRAINT FK_need_post_id FOREIGN KEY (post_id) REFERENCES post(post_id),
	ADD CONSTRAINT FK_need_skill_id FOREIGN KEY (skill_id) REFERENCES skill(skill_id);

ALTER TABLE own 
	ADD CONSTRAINT FK_own_skill_id FOREIGN KEY (skill_id) REFERENCES skill(skill_id),
	ADD CONSTRAINT FK_own_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser(appuser_id);

ALTER TABLE graduate 
	ADD CONSTRAINT FK_graduate_id_certif FOREIGN KEY (id_certif) REFERENCES certificate(id_certif),
	ADD CONSTRAINT FK_graduate_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser(appuser_id);
