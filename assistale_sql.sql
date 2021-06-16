drop database assistales;
create database assistales;

use assistales;
create table projets (
id_projet bigint not null primary key auto_increment,
nom varchar(50),
description varchar(50),
trame varchar(50)
);

create table univers (
id_univers bigint not null primary key auto_increment,
nom varchar(50)
);

create table utiliser (
id_projet bigint not null,
id_univers bigint not null,
foreign key (id_projet) references projets(id_projet),
foreign key (id_univers) references univers(id_univers)
);

alter table utiliser
add primary key (id_projet, id_univers);

create table personnages (
id_personnage bigint not null primary key auto_increment,
nom varchar(50),
prenom varchar(50),
surnom varchar(50),
genre varchar(50),
age varchar(50),
metier varchar(50),
ancien_metier varchar(50),
qualite varchar(50),
defaut varchar(50),
talent varchar(50),
faiblesse varchar(50),
conflit_personnel varchar(50),
competence varchar(50),
langue_parler varchar(50),
centre_interet varchar(50),
enfance varchar(50),
meilleur_souvenir varchar(50),
pire_souvenir varchar(50),
trophee varchar(50),
echec varchar(50),
secret varchar(50),
objectif varchar(50),
anedocte varchar(50),
taille varchar(50),
poids varchar(50),
peau varchar(50),
cheveux varchar(50),
yeux varchar(50),
oreilles varchar(50),
cicatrice varchar(50),
tatouage_percing varchar(50),
style_vestimentaire varchar(50),
particularite varchar(50),
autres varchar(50)
);

create table ethnies (
id_ethnie bigint not null primary key auto_increment,
nom varchar(50),
autre_nom varchar(50),
description varchar(50),
tranche_age varchar(50),
talent varchar(50),
faiblesse varchar(50),
qi_moyen varchar(50),
puissance varchar(50),
agilite varchar(50),
vie_groupe boolean,
traditions varchar(50),
peau varchar(50),
cheveux varchar(50),
yeux varchar(50),
oreilles varchar(50),
nez varchar(50),
taille_moyenne varchar(50),
poid_moyen varchar(50),
particularite varchar(50),
id_univers bigint not null,
foreign key (id_univers) references univers(id_univers)
);

create table flores (
id_flore bigint not null primary key auto_increment,
nom varchar(50),
histoire varchar(50),
apparence varchar(50),
rarete boolean,
benefice varchar(50),
danger varchar(50),
specificite varchar(50),
id_univers bigint not null,
foreign key (id_univers) references univers(id_univers)
);

create table lieux (
id_lieu bigint not null primary key auto_increment,
nom varchar(50),
description varchar(50),
genre varchar(50),
abandonner boolean,
paysage varchar(50),
odeur varchar(50),
son varchar(50),
culture varchar(50),
emplacement varchar(50),
climat varchar(50),
monument varchar(50),
id_univers bigint not null,
foreign key (id_univers) references univers(id_univers)
);

create table objets (
id_objet bigint not null primary key auto_increment,
nom varchar(50),
description varchar(50),
genre varchar(50),
poid varchar(50),
taille varchar(50),
autre varchar(50),
date_creation varchar(50),
origine varchar(50),
passe varchar(50),
actuel varchar(50),
utiliter varchar(50),
capacite varchar(50),
id_univers bigint not null,
foreign key (id_univers) references univers(id_univers)
);

create table faunes (
id_faune bigint not null primary key auto_increment,
nom varchar(50),
description varchar(50),
race varchar(50),
agressivite varchar(50),
attaque varchar(50),
defense varchar(50),
intelligence varchar(50),
pouvoir varchar(50),
agilite varchar(50),
vie_groupe boolean,
puissance varchar(50),
faiblesse varchar(50),
rarete boolean,
oreilles varchar(50),
museau varchar(50),
queue varchar(50),
fourrure varchar(50),
couleur varchar(50),
particularite varchar(50),
id_univers bigint not null,
foreign key (id_univers) references univers(id_univers)
);

create table sejourner (
id_lieu bigint not null,
id_personnage bigint not null,
foreign key (id_lieu) references lieux(id_lieu),
foreign key (id_personnage) references personnages(id_personnage),
primary key (id_lieu, id_personnage),
naissance boolean,
enfance boolean,
actuel boolean
);

create table accompanger (
id_faune bigint not null,
id_personnage bigint not null,
foreign key (id_faune) references faunes(id_faune),
foreign key (id_personnage) references personnages(id_personnage),
primary key (id_faune, id_personnage)
);

create table vivre (
id_faune bigint not null,
id_lieu bigint not null,
foreign key (id_faune) references faunes(id_faune),
foreign key (id_lieu) references lieux(id_lieu),
primary key (id_faune, id_lieu)
);

create table posseder (
id_objet bigint not null,
id_personnage bigint not null,
foreign key (id_objet) references objets(id_objet),
foreign key (id_personnage) references personnages(id_personnage),
primary key (id_objet, id_personnage),
createur boolean,
passe boolean,
actuel boolean
);

create table abriter (
id_univers bigint not null,
id_personnage bigint not null,
foreign key (id_univers) references univers(id_univers),
foreign key (id_personnage) references personnages(id_personnage),
primary key (id_univers, id_personnage)
);

create table grandir (
id_lieu bigint not null,
id_flore bigint not null,
foreign key (id_lieu) references lieux(id_lieu),
foreign key (id_flore) references flores(id_flore),
primary key (id_lieu, id_flore)
);

create table habiter (
id_lieu bigint not null,
id_ethnie bigint not null,
foreign key (id_lieu) references lieux(id_lieu),
foreign key (id_ethnie) references ethnies(id_ethnie),
primary key (id_lieu, id_ethnie)
);

create table definir (
id_personnage bigint not null,
id_ethnie bigint not null,
foreign key (id_personnage) references personnages(id_personnage),
foreign key (id_ethnie) references ethnies(id_ethnie),
primary key (id_personnage, id_ethnie)
);

use assistales;
insert into univers (nom) value 
("idées");

insert into univers (nom) value 
();

insert into personnages (nom, prenom) value 
();

select * from projets
where nom="";

update projets
set nom=""
where nom="";

select univers.nom, personnages.nom
from univers, personnages
where univers.id_univers = personnages.id_univers;

select objets.nom
from objets, personnage, posseder
where objets.id_objet = posseder.id_objet 
and posseder.id_personnage = personnages.id_personnage;

alter table personnages
add id_personnage_lier bigint;