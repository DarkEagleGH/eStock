INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 1, 0, 'Крупная бытовая техника' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 2, 0, 'Мелкая бытовая техника' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 3, 0, 'Телевизоры и аксессуары' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 4, 1, 'Холодильники' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 5, 1, 'Стиральные машины' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 6, 1, 'Газовые плиты' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 7, 2, 'Пылесосы' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 8, 2, 'Электрочайники' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 9, 3, 'Телевизоры' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 10, 3, 'Акустика' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 11, 3, 'Домашние кинотеатры' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 12, 3, 'DVD/HD-медиаплееры' ); 
INSERT INTO PUBLIC.CATEGORIES( ID, PARENT_ID, NAME ) VALUES ( 13, 3, 'Аксессуары' ); 

INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 1, 'Honda' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 2, 'Mitsubishi' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 3, 'Samsung' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 4, 'LG' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 5, 'Panasonic' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 6, 'NEC' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 7, 'Sony' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 8, 'Indesit' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 9, 'Bosch' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 10, 'Polaris' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 11, 'Kenwood' ); 
INSERT INTO PUBLIC.MANUFACTURERS( ID, NAME ) VALUES ( 12, 'Ariston' ); 

INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 2, 'RF SM-01', 'SM-01', 3, 7000, 'clob13: '', 3, 4 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 3, 'RF SM-02', 'SM-02', 3, 7500, 'clob14: '', 2, 4 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 4, 'RF LG-01', 'LG-01', 4, 6500, 'clob15: '', 0, 4 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 5, 'RF LG-02', 'LG-02', 4, 6900, 'clob16: '', 1, 4 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 6, 'VC BH-01', 'BH-01', 9, 4900, 'clob17: '', 4, 7 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 7, 'VC BH-02', 'BH-02', 9, 5200, 'clob18: '', 1, 7 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 8, 'VC LG-02', 'LG-02', 4, 3200, 'clob19: '', 0, 7 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 9, 'TV SN-02', 'SN-02', 7, 13200, 'clob20: '', 5, 9 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 10, 'TV SN-03', 'SN-03', 7, 17200, 'clob21: '', 1, 9 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 11, 'TV PN-04', 'PN-04', 5, 18450, 'clob22: '', 2, 9 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 12, 'TV PN-01', 'PN-01', 5, 19950, 'clob23: '', 0, 9 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 13, 'CB HDMI-15', 'HDMI-15', 5, 140, 'clob24: '', 13, 13 ); 
INSERT INTO PUBLIC.ITEMS( ID, NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID ) VALUES ( 14, 'CB HDMI-50', 'HDMI-50', 6, 540, 'clob25: '', 4, 13 ); 
