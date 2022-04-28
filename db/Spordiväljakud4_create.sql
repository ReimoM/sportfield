-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-04-28 13:16:06.298

-- tables
-- Table: booking
CREATE TABLE booking (
    id serial  NOT NULL,
    user_id int  NOT NULL,
    CONSTRAINT booking_pk PRIMARY KEY (id)
);

-- Table: contact
CREATE TABLE contact (
    id serial  NOT NULL,
    first_name varchar(50)  NOT NULL,
    last_name varchar(50)  NOT NULL,
    telephone varchar(50)  NOT NULL,
    email varchar(250)  NOT NULL,
    CONSTRAINT contact_pk PRIMARY KEY (id)
);

-- Table: field
CREATE TABLE field (
    id serial  NOT NULL,
    location_id int  NOT NULL,
    name varchar(250)  NOT NULL,
    is_active boolean  NOT NULL,
    CONSTRAINT field_pk PRIMARY KEY (id)
);

-- Table: field_availability
CREATE TABLE field_availability (
    id serial  NOT NULL,
    field_id int  NOT NULL,
    weekday int  NULL,
    start_time_hour int  NULL,
    end_time_hour int  NULL,
    holiday date  NULL,
    is_open boolean  NOT NULL,
    CONSTRAINT field_availability_pk PRIMARY KEY (id)
);

-- Table: field_booking
CREATE TABLE field_booking (
    id serial  NOT NULL,
    booking_id int  NOT NULL,
    sports_field_id int  NOT NULL,
    date date  NOT NULL,
    start_time_hour int  NOT NULL,
    end_time_hour int  NOT NULL,
    CONSTRAINT field_booking_pk PRIMARY KEY (id)
);

-- Table: location
CREATE TABLE location (
    id serial  NOT NULL,
    county varchar(50)  NOT NULL,
    latitude decimal(10,10)  NULL,
    longitude decimal(10,10)  NULL,
    CONSTRAINT location_pk PRIMARY KEY (id)
);

-- Table: picture
CREATE TABLE picture (
    id serial  NOT NULL,
    picture_data bytea  NOT NULL,
    CONSTRAINT picture_pk PRIMARY KEY (id)
);

-- Table: picture_field
CREATE TABLE picture_field (
    id serial  NOT NULL,
    field_id int  NOT NULL,
    picture_id int  NOT NULL,
    title varchar(255)  NULL,
    CONSTRAINT picture_field_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
    id serial  NOT NULL,
    name varchar(255)  NOT NULL,
    user_id int  NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: sports
CREATE TABLE sports (
    id serial  NOT NULL,
    sports_type varchar(50)  NOT NULL,
    CONSTRAINT sports_pk PRIMARY KEY (id)
);

-- Table: sports_field
CREATE TABLE sports_field (
    id serial  NOT NULL,
    field_id int  NOT NULL,
    sports_id int  NOT NULL,
    CONSTRAINT sports_field_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
    id serial  NOT NULL,
    contact_id int  NOT NULL,
    username varchar(250)  NOT NULL,
    password varchar(50)  NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: booking_user (table: booking)
ALTER TABLE booking ADD CONSTRAINT booking_user
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: field_availability_field (table: field_availability)
ALTER TABLE field_availability ADD CONSTRAINT field_availability_field
    FOREIGN KEY (field_id)
    REFERENCES field (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: field_booking_booking (table: field_booking)
ALTER TABLE field_booking ADD CONSTRAINT field_booking_booking
    FOREIGN KEY (booking_id)
    REFERENCES booking (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: field_booking_sports_field (table: field_booking)
ALTER TABLE field_booking ADD CONSTRAINT field_booking_sports_field
    FOREIGN KEY (sports_field_id)
    REFERENCES sports_field (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: field_location (table: field)
ALTER TABLE field ADD CONSTRAINT field_location
    FOREIGN KEY (location_id)
    REFERENCES location (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: picture_field_field (table: picture_field)
ALTER TABLE picture_field ADD CONSTRAINT picture_field_field
    FOREIGN KEY (field_id)
    REFERENCES field (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: picture_field_picture (table: picture_field)
ALTER TABLE picture_field ADD CONSTRAINT picture_field_picture
    FOREIGN KEY (picture_id)
    REFERENCES picture (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: role_user (table: role)
ALTER TABLE role ADD CONSTRAINT role_user
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sports_field_field (table: sports_field)
ALTER TABLE sports_field ADD CONSTRAINT sports_field_field
    FOREIGN KEY (field_id)
    REFERENCES field (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: sports_field_sports (table: sports_field)
ALTER TABLE sports_field ADD CONSTRAINT sports_field_sports
    FOREIGN KEY (sports_id)
    REFERENCES sports (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: user_contact (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_contact
    FOREIGN KEY (contact_id)
    REFERENCES contact (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

