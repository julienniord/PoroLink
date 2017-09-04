CREATE TABLE IF NOT EXISTS administrator (
  administrator_name varchar(100) DEFAULT NULL,
  appuser_id int(11) NOT NULL,
  PRIMARY KEY (appuser_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS appuser (
  appuser_id int(11) NOT NULL AUTO_INCREMENT,
  role_appuser int(11) DEFAULT NULL,
  mail varchar(255) NOT NULL,
  password varchar(50) NOT NULL,
  created_at datetime DEFAULT NULL,
  updated_at datetime DEFAULT NULL,
  PRIMARY KEY (appuser_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS candidate (
  gender tinyint(1),
  firstname varchar(255) DEFAULT NULL,
  lastname varchar(255) DEFAULT NULL,
  phone varchar(15) DEFAULT NULL,
  birthdate date DEFAULT NULL,
  transport varchar(25) DEFAULT NULL,
  presentation text,
  links varchar(255) DEFAULT NULL,
  certificates varchar(255) DEFAULT NULL,
  certificate_in_progress varchar(255) DEFAULT NULL,
  appuser_id int(11) NOT NULL,
  PRIMARY KEY (appuser_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS company (
  company_name varchar(255) NOT NULL,
  adress varchar(255) DEFAULT NULL,
  description text,
  links varchar(150) DEFAULT NULL,
  siret varchar(50) DEFAULT NULL,
  appuser_id int(11) NOT NULL,
  PRIMARY KEY (appuser_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS need (
  indice_priorite int(11) DEFAULT NULL,
  post_id int(11) NOT NULL,
  skill_id int(11) NOT NULL,
  PRIMARY KEY (post_id,skill_id),
  KEY FK_need_skill_id (skill_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS own (
  indice_masteries int(11) DEFAULT NULL,
  skill_id int(11) NOT NULL,
  appuser_id int(11) NOT NULL,
  PRIMARY KEY (skill_id,appuser_id),
  KEY FK_own_appuser_id (appuser_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS post (
  post_id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  presentation text,
  created_at datetime DEFAULT NULL,
  updated_at datetime DEFAULT NULL,
  mail_agent varchar(100) DEFAULT NULL,
  firstname_agent varchar(150) DEFAULT NULL,
  lastname_agent varchar(150) NOT NULL,
  appuser_id int(11) NOT NULL,
  PRIMARY KEY (post_id),
  KEY FK_post_appuser_id (appuser_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS skill (
  skill_id int(11) NOT NULL AUTO_INCREMENT,
  skill_name varchar(255) DEFAULT NULL,
  PRIMARY KEY (skill_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


ALTER TABLE administrator
  ADD CONSTRAINT FK_administrator_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser (appuser_id);

ALTER TABLE candidate
  ADD CONSTRAINT FK_candidate_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser (appuser_id);

ALTER TABLE company
  ADD CONSTRAINT FK_company_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser (appuser_id);

ALTER TABLE need
  ADD CONSTRAINT FK_need_post_id FOREIGN KEY (post_id) REFERENCES post (post_id),
  ADD CONSTRAINT FK_need_skill_id FOREIGN KEY (skill_id) REFERENCES skill (skill_id);

ALTER TABLE own
  ADD CONSTRAINT FK_own_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser (appuser_id),
  ADD CONSTRAINT FK_own_skill_id FOREIGN KEY (skill_id) REFERENCES skill (skill_id);

ALTER TABLE post
  ADD CONSTRAINT FK_post_appuser_id FOREIGN KEY (appuser_id) REFERENCES appuser (appuser_id);
