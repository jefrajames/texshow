-- Load some test data

-- Merchant 1
insert into merchant 
(id, status, activity, activityLevel, servicelevel, brandname, scoreId,  joindate, scoreenabled, instore, mobile, online,  twitterhandle, website) 
values 
(1, 'ENABLED', 'RESTAURANT',  'MEDIUM', 'STANDARD', 'Marcel', 'ms-1', '1979-12-12', true, true, true, true, '@marcel', 'http://www.restaurantmarcel.fr/');

-- CardSchemes for Merchant 1
insert into merchant_cardschemes (merchant_id, cardschemes) values (1, 'AMEX');
insert into merchant_cardschemes (merchant_id, cardschemes) values (1, 'VISA');
insert into merchant_cardschemes (merchant_id, cardschemes) values (1, 'CB');

-- Contacts for Merchant 1
insert into contact (id, name, number, street, city, country) values (1,'Harrisson Ford', '2', '5th avenue', 'New York', 'USA');
insert into contact_emailaddresses (contact_id, emailaddresses) values (1, 'hariford@gmail.com');
insert into contact_emailaddresses (contact_id, emailaddresses) values (1, 'harissonford@yahoo.com');
insert into contact_phonenumbers (contact_id, phonenumbers) values (1, '23-45-67-89-01');
insert into merchant_contact (merchant_id, contacts_id) values (1,1);

insert into contact (id, name, number, street, city, country) values (2,'John Travolta', '5', 'Market Street', 'San Francisco', 'USA');
insert into contact_emailaddresses (contact_id, emailaddresses) values (2, 'jtravolta@gmail.com');
insert into contact_emailaddresses (contact_id, emailaddresses) values (2, 'johntra@yahoo.com');
insert into contact_phonenumbers (contact_id, phonenumbers) values (2, '12-34-56-78-90');
insert into merchant_contact (merchant_id, contacts_id) values (1,2);

-- Merchant 2
insert into merchant 
(id, status, activity, activityLevel, servicelevel, brandname, scoreId,  joindate, scoreenabled, instore, mobile, online,  twitterhandle, website) 
values 
(2, 'ENABLED', 'THEATER',  'HIGH', 'PREMIUM', 'Chinese Theatre', 'ms-2', '1980-01-01', true, true, true, true, '@ChinesesTheaters', 'http://www.tclchinesetheatres.com/');

-- CardSchemes for Merchant 2
insert into merchant_cardschemes (merchant_id, cardschemes) values (2, 'MASTERCARD');
insert into merchant_cardschemes (merchant_id, cardschemes) values (2, 'JCB');

-- Contacts for Merchant 2
insert into contact (id, name, number, street, city, country) values (3,'JCVD', '3', 'Grand Place', 'Bruxelles', 'Belgium');
insert into contact_emailaddresses (contact_id, emailaddresses) values (3, 'jcvd@gmail.com');
insert into contact_phonenumbers (contact_id, phonenumbers) values (3, '34-56-78-90-12');
insert into merchant_contact (merchant_id, contacts_id) values (2,3);

-- Merchant 3
insert into merchant 
(id, status, activity, activityLevel, servicelevel, brandname, scoreId,  joindate, scoreenabled, instore, mobile, online,  twitterhandle, website) 
values 
(3, 'ENABLED', 'BOOKSTORE',  'LOW', 'STANDARD', 'Librairie Labbe', 'ms-3', '1980-01-01', true, true, false, false, '@LabLib', 'https://librairie-labbe.business.site/');

-- CardSchemes for Merchant 3
insert into merchant_cardschemes (merchant_id, cardschemes) values (3, 'MASTERCARD');
insert into merchant_cardschemes (merchant_id, cardschemes) values (3, 'CB');
insert into merchant_cardschemes (merchant_id, cardschemes) values (3, 'VISA');

-- Contacts for Merchant 3
insert into contact (id, name, number, street, city, country) values (4,'Philippe Labbe', '4', 'Place Saint Louis', 'Blois', 'France');
insert into contact_emailaddresses (contact_id, emailaddresses) values (4, 'labbe@laposte.net');
insert into contact_phonenumbers (contact_id, phonenumbers) values (4, '45-67-89-01-23');
insert into merchant_contact (merchant_id, contacts_id) values (3,4);

-- Merchant 4
insert into merchant 
(id, status, activity, activityLevel, servicelevel, brandname, scoreId,  joindate, scoreenabled, instore, mobile, online,  twitterhandle, website) 
values 
(4, 'ENABLED', 'GROCERY',  'HIGH', 'PREMIUM', 'Fauchon', 'ms-4', '1998-09-04', true, true, true, true, '@FauchonStore', 'http://www.fauchon.com/');

-- CardSchemes for Merchant 4
insert into merchant_cardschemes (merchant_id, cardschemes) values (4, 'MASTERCARD');
insert into merchant_cardschemes (merchant_id, cardschemes) values (4, 'CB');
insert into merchant_cardschemes (merchant_id, cardschemes) values (4, 'VISA');
insert into merchant_cardschemes (merchant_id, cardschemes) values (4, 'JCB');
insert into merchant_cardschemes (merchant_id, cardschemes) values (4, 'UnionPay');

-- Contacts for Merchant 4
insert into contact (id, name, number, street, city, country) values (5,'Gerard Fauchon', '10', 'Rue Royale', 'Paris', 'France');
insert into contact_emailaddresses (contact_id, emailaddresses) values (5, 'gege@laposte.net');
insert into contact_phonenumbers (contact_id, phonenumbers) values (5, '56-78-90-12-34');
insert into merchant_contact (merchant_id, contacts_id) values (4,5);

-- Merchant 5
insert into merchant 
(id, status, activity, activityLevel, servicelevel, brandname, scoreId,  joindate, scoreenabled, instore, mobile, online,  twitterhandle, website) 
values 
(5, 'ENABLED', 'ELECTRONIC',  'MEDIUM', 'BASIC', 'ElectroTout', 'ms-5', '2020-10-10', true, true, true, true, '@ElectroTout', 'http://www.electrotout.com/');

-- CardSchemes for Merchant 5
insert into merchant_cardschemes (merchant_id, cardschemes) values (5, 'MASTERCARD');
insert into merchant_cardschemes (merchant_id, cardschemes) values (5, 'CB');

-- Contacts for Merchant 5
insert into contact (id, name, number, street, city, country) values (6,'Momo Afond', '9', 'Rue des oiseaux', 'Geneva', 'Switzerland');
insert into contact_emailaddresses (contact_id, emailaddresses) values (6, 'momo@laposte-suisse.net');
insert into contact_phonenumbers (contact_id, phonenumbers) values (6, '56-78-90-12-34');
insert into merchant_contact (merchant_id, contacts_id) values (5,6);
