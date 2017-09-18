INSERT INTO appuser (appuser_id, role_appuser, mail, password, created_at, updated_at) 
VALUES (1, 'COMPANY', 'imie@imie.fr', 'aA123456$', '2017-06-01 00:51:24', '2017-06-01 00:51:24');
INSERT INTO appuser (appuser_id, role_appuser, mail, password, created_at, updated_at) 
VALUES (2, 'COMPANY', 'tactfactory@tactfactory.fr', 'aA123456$', '2017-06-01 00:51:24', '2017-06-01 00:51:24');
INSERT INTO appuser (appuser_id, role_appuser, mail, password, created_at, updated_at) 
VALUES (3, 'CANDIDATE', 'jeanlouis@on.fr', 'aA123456$', '2017-06-01 00:51:24', '2017-06-01 00:51:24');
INSERT INTO appuser (appuser_id, role_appuser, mail, password, created_at, updated_at) 
VALUES (4, 'CANDIDATE', 'roger@durand.fr', 'aA123456$', '2017-06-01 00:51:24', '2017-06-01 00:51:24');

INSERT INTO company (company_name, address, description, linkLinkedin, linkWebsite, siret, phone, appuser_id)
VALUES ("imie", "2 rue de la chaussée", "Ecole de la filière numérique proposant des formations allant du +1 au +5 en alternance du +2 au +5. Propose des filières, reseau, développement, digital", "www.linkedin.com/in/imie", "imie.fr", "12345678912345", "0623589417", 1);
INSERT INTO company (company_name, address, description, linkLinkedin, linkWebsite, siret, phone, appuser_id)
VALUES ("tactfactory", "3 rue des champ de la paquerette", "Entreprise créatrice de Soft pour des clients. Vends les services de ses employés pour du développement ou de la formation", "www.linkedin.com/in/tactfactory", "tactfactory.fr", "12345678912345", "0298846174", 2);

INSERT INTO candidate (firstname, lastname, phone, transport, presentation, linkLinkedin, linkGitHub, certificate_in_progress, appuser_id)
VALUES ('Jean Louis', 'ON', '08 36 65 65 65', 'trotinette', 'Pere Noel de son état, il est trop stylé', 'JeanLouiOn.fr', 'GitJeanLouiOn.fr', 'Master Pro', 3);
INSERT INTO candidate (firstname, lastname, phone, transport, presentation, linkLinkedin, linkGitHub, certificate_in_progress, appuser_id)
VALUES ('Roger', 'Durand', '08 37 65 65 65', 'trotinette', 'J ai du style et je m épile', 'ROgerDurand.fr', 'GitROgerDurand.fr', 'BTS', 4);

INSERT INTO skill (skill_id, skill_name) VALUES (1, 'Java');
INSERT INTO skill (skill_id, skill_name) VALUES (2, 'PhP');
INSERT INTO skill (skill_id, skill_name) VALUES (3, 'C++');
INSERT INTO skill (skill_id, skill_name) VALUES (4, 'SQL');
INSERT INTO skill (skill_id, skill_name) VALUES (5, 'Git');
INSERT INTO skill (skill_id, skill_name) VALUES (6, 'Méthode Agiles');

INSERT INTO post (post_id, post_name, presentation, created_at, updated_at, mail_agent, firstname_agent, lastname_agent, appuser_id) 
VALUES (1, 'dévellopeur Java', 'Recrute dévellopeur en Java pour un projet d alternance', '2017/09/04 14:28:35', '2017/09/04 14:28:35', 'agent@enterprise.fr', 'agent', 'super', 1);
INSERT INTO post (post_id, post_name, presentation, created_at, updated_at, mail_agent, firstname_agent, lastname_agent, appuser_id) 
VALUES (2, 'dévellopeur PhP', 'Recherche un dévellopeur en Php pour un CDI', '2017/09/04 14:28:35', '2017/09/04 14:28:35', 'agent@super.fr', 'super', 'agent', 2);
INSERT INTO post (post_id, post_name, presentation, created_at, updated_at, mail_agent, firstname_agent, lastname_agent, appuser_id) 
VALUES (3, 'Scrum master', 'Recrute un Scrum master pour un CDD de 6 mois', '2017/09/05 14:28:35', '2017/09/04 14:28:35', 'agenttropcool@enterprise.fr', 'superagent', 'agentsuper', 1);

INSERT INTO own (indice_masteries, skill_id, appuser_id) VALUES (5, 1, 3);
INSERT INTO own (indice_masteries, skill_id, appuser_id) VALUES (4, 2, 3);
INSERT INTO own (indice_masteries, skill_id, appuser_id) VALUES (3, 3, 3);
INSERT INTO own (indice_masteries, skill_id, appuser_id) VALUES (3, 4, 4);
INSERT INTO own (indice_masteries, skill_id, appuser_id) VALUES (2, 5, 4);
INSERT INTO own (indice_masteries, skill_id, appuser_id) VALUES (2, 6, 4);

INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (5, 1, 1);
INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (3, 1, 4);
INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (2, 1, 3);
INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (5, 2, 2);
INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (3, 2, 5);
INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (2, 2, 6);
INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (5, 3, 6);
INSERT INTO need (indice_priorite, post_id, skill_id) VALUES (3, 3, 5);

INSERT INTO certificate (id_certif, certificate) VALUES (1, 'BAC');
INSERT INTO certificate (id_certif, certificate) VALUES (2, 'BEP');
INSERT INTO certificate (id_certif, certificate) VALUES (3, 'CAP');
INSERT INTO certificate (id_certif, certificate) VALUES (4, 'Licence');
INSERT INTO certificate (id_certif, certificate) VALUES (5, 'Master');
INSERT INTO certificate (id_certif, certificate) VALUES (6, 'licence psy');
INSERT INTO certificate (id_certif, certificate) VALUES (7, 'licence info');
INSERT INTO certificate (id_certif, certificate) VALUES (8, 'licence bio');

INSERT INTO graduate (id_certif, appuser_id) VALUES (1, 3);
INSERT INTO graduate (id_certif, appuser_id) VALUES (6, 3);
INSERT INTO graduate (id_certif, appuser_id) VALUES (5, 3);
INSERT INTO graduate (id_certif, appuser_id) VALUES (2, 4);
INSERT INTO graduate (id_certif, appuser_id) VALUES (3, 4);
INSERT INTO graduate (id_certif, appuser_id) VALUES (1, 4);
