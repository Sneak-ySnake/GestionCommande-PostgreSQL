create table magasin.produit
(
idproduit integer not null,
description varchar(30),
prix float
);

alter table magasin.produit
add constraint PK_PRODUIT primary key (idproduit); 

alter table magasin.produit
    owner to gestionnaire;

create table magasin.client
(
idclient integer not null,
nom varchar(30),
prenom varchar(30),
adresse varchar(50)
);

alter table magasin.client
add constraint PK_CLIENT primary key (idclient);

alter table magasin.client
owner to gestionnaire;

create table magasin.commande
(
idcommande integer not null,
idclient integer not null,
idproduit integer not null,
quantite integer
);

alter table magasin.commande
add constraint PK_COMMANDE primary key (idcommande);

alter table magasin.commande
add constraint FK1_COMMANDE
foreign key (idclient)
references magasin.client (idclient);

alter table magasin.commande
add constraint FK2_COMMANDE 
foreign key (idproduit)
references magasin.produit (idproduit);

alter table magasin.commande
owner to gestionnaire;

commit;