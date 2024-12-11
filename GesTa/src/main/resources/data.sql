CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);
INSERT INTO users (id, name, email) VALUES (1, 'John Doe', 'john.doe@example.com');
