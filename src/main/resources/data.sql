INSERT INTO USERS (id, name, role) VALUES
('1', 'Vasian', 'client'),
('2', 'Petian', 'client'),
('3', 'Vovan', 'administrator');

INSERT INTO PRODUCTS (id, name, type, description) VALUES
('1', 'Vodka "Absolute"', 'alcohol', 'Old but gold classics'),
('2', 'Red wine "Dragon blood"', 'alcohol', 'Sweet and hot'),
('3', 'Cookies "Sweeties"', 'sweeties', 'Sweet flavour'),
('4', 'Cheese "Maasdam"', 'tapas', 'Salty flavour');

INSERT INTO PRODUCT_PRICE (product_id, price) VALUES
('1', '100'),
('2', '50'),
('3', '10'),
('4', '25');

INSERT INTO PRODUCT_QUANTITY (product_id, quantity) VALUES
('1', '100'),
('2', '50'),
('3', '75'),
('4', '40');
