INSERT INTO user_table(USERNAME ,PASSWORD ) VALUES ('jack','pass_word');
INSERT INTO user_table(USERNAME ,PASSWORD ) VALUES ('bob','pass_word');
INSERT INTO user_table(USERNAME ,PASSWORD ) VALUES ('apple','pass_word');
INSERT INTO user_table(USERNAME ,PASSWORD ) VALUES ('glaxo','pass_word');

INSERT INTO ROLE_TABLE(ROLE ) VALUES ('CONSUMER');
INSERT INTO ROLE_TABLE(ROLE ) VALUES ('SELLER');

INSERT INTO category_table(category_name) VALUES ('Fashion');
INSERT INTO category_table(category_name) VALUES ('Electronics');
INSERT INTO category_table(category_name) VALUES ('Books');
INSERT INTO category_table(category_name) VALUES ('Groceries');
INSERT INTO category_table(category_name) VALUES ('Medicines');

INSERT INTO users_roles (user_id,role_id) VALUES (1,1);
INSERT INTO users_roles (user_id,role_id) VALUES (2,1);
INSERT INTO users_roles (user_id,role_id) VALUES (3,2);
INSERT INTO users_roles (user_id,role_id) VALUES (4,2);

INSERT INTO CART (total_amount,user_cart) VALUES (20,1);
INSERT INTO CART (total_amount,user_cart) VALUES (0,2);

INSERT INTO product (price,prodcut_name,category_category_id,seller_user_id)
VALUES (29190,'apple ipad 10.2 8th gen wifi ios tablet',2,3);

INSERT INTO product (price,prodcut_name,category_category_id,seller_user_id)
VALUES (10,'crocin pain relief tablet',5,4);


INSERT INTO cart_product(cart_cart_id,cart_product,quantity) VALUES (1,2,2);
