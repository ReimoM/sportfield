INSERT INTO public.contact (id, first_name, last_name, telephone, email)
VALUES (DEFAULT, 'Külli', 'Lumiste', '55597482', 'kyllilumiste@gmail.com');
INSERT INTO public.contact (id, first_name, last_name, telephone, email)
VALUES (DEFAULT, 'Marju', 'Tamm', '53345785', 'tammmarju@gmail.com');
INSERT INTO public.contact (id, first_name, last_name, telephone, email)
VALUES (DEFAULT, 'Reimo-Martin', 'Salo', '55598524', 'reimosalo@gmail.com');
INSERT INTO public.contact (id, first_name, last_name, telephone, email)
VALUES (DEFAULT, 'Holger', 'Part', '55597482', 'holger.part@gmail.com');
INSERT INTO public.location (id, county, latitude, longitude)
VALUES (DEFAULT, 'Harjumaa', null, null);
INSERT INTO public.location (id, county, latitude, longitude)
VALUES (DEFAULT, 'Tartumaa', null, null);
INSERT INTO public.location (id, county, latitude, longitude)
VALUES (DEFAULT, 'Pärnumaa', null, null);
INSERT INTO public.location (id, county, latitude, longitude)
VALUES (DEFAULT, 'Viljandimaa', null, null);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 1, 'Sõle Spordikeskus', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 1, 'Arigato Keskus', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 1, 'Eduard Vilde tee korvpalliväljak', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 1, 'Saku Suurhall', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 2, 'Aardla rannavõrkpalliväljak', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 2, 'Tartu Ülikooli Spordihoone', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 3, 'Pärnu Spordihall', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 3, 'Pärnu Kalevi Staadion', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 3, 'Pauluse Spordihall', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 3, 'Pärnu Kesklinna Tenniseklubi', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 4, 'Viljani Kaare Kooli Staadion', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 4, 'Viljandi Jäähall', true);
INSERT INTO public.field (id, location_id, name, is_active) VALUES (DEFAULT, 4, 'Viljandi tennisemaja', true);
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'jalgpall');
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'korvpall');
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'võrkpall');
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'tennis');
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'uisusport');
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'saalihoki');
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'käsipall');
INSERT INTO public.sports (id, sports_type) VALUES (DEFAULT, 'sulgpall');
INSERT INTO public."user" (id, contact_id, username, password) VALUES (DEFAULT, 1, 'kyllilum', 'kyllilum');
INSERT INTO public."user" (id, contact_id, username, password) VALUES (DEFAULT, 2, 'marjutamm', 'marjutamm');
INSERT INTO public."user" (id, contact_id, username, password) VALUES (DEFAULT, 2, 'spordimees', 'parool15');
INSERT INTO public."user" (id, contact_id, username, password) VALUES (DEFAULT, 2, 'spordipoiss', 'parool13');
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 1, 3);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 1, 4);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 2, 4);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 3, 2);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 4, 2);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 4, 3);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 4, 7);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 5, 3);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 2);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 3);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 6);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 7);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 8);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 7, 2);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 3);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 6);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 7);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 6, 8);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 7, 1);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 8, 1);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 9, 2);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 9, 3);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 9, 7);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 10, 2);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 10, 3);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 10, 6);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 10, 7);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 10, 8);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 11, 1);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 12, 5);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 13, 4);
INSERT INTO public.sports_field (id, field_id, sports_id) VALUES (DEFAULT, 13, 8);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, 1, 8, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, 2, 8, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, 3, 8, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, 4, 8, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, 5, 8, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, 6, 10, 18, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, 7, 10, 18, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, 1, 10, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, 2, 10, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, 3, 10, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, 4, 10, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, 5, 10, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, 6, null, null, null, false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, 7, null, null, null, false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, 1, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, 2, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, 3, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, 4, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, 5, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, 6, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, 7, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, 1, 18, 23, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, 2, 18, 23, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, 3, 18, 23, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, 4, 18, 23, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, 5, 18, 23, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, 6, 18, 23, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, 7, 18, 23, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, 1, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, 2, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, 3, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, 4, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, 5, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, 6, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, 7, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, 1, 07, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, 2, 07, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, 3, 07, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, 4, 07, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, 5, 07, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, 6, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, 7, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, 1, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, 2, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, 3, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, 4, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, 5, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, 6, 09, 19, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, 7, null, null, null, false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, 1, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, 2, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, 3, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, 4, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, 5, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, 6, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, 7, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, 1, 10, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, 2, 10, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, 3, 10, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, 4, 10, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, 5, 10, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, 6, 10, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, 7, 10, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, 1, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, 2, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, 3, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, 4, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, 5, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, 6, 08, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, 7, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, 1, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, 2, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, 3, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, 4, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, 5, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, 6, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, 7, 08, 21, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, 1, 17, 19, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, 2, 15, 19, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, 3, 15, 15, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, 4, 15, 19, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, 5, 15, 19, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, 6, 13, 20, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, 7, 11, 19, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, 1, 07, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, 2, 07, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, 3, 07, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, 4, 07, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, 5, 07, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, 6, 07, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, 7, 07, 22, null, true);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 1, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 2, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 3, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 4, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 5, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 6, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 7, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 8, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 9, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 10, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 11, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 12, null, null, null, '2022-05-01', false);
INSERT INTO public.field_availability (id, field_id, weekday, start_time_hour, end_time_hour, holiday, is_open) VALUES (DEFAULT, 13, null, null, null, '2022-05-01', false);