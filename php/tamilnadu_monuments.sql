-- Create the database
CREATE DATABASE tamilnadu_monuments;

-- Use the database
USE tamilnadu_monuments;

-- Create the table to store monument information
CREATE TABLE monuments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    image_url VARCHAR(255)
);

-- Insert some sample data
INSERT INTO monuments (name, location, description, image_url) VALUES
('Brihadeeswarar Temple', 'Thanjavur', 'A UNESCO World Heritage Site, also known as the Big Temple, dedicated to Lord Shiva.', 'https://example.com/brihadeeswarar.jpg'),
('Meenakshi Temple', 'Madurai', 'A historic Hindu temple, famous for its intricate architecture and sculptures.', 'https://example.com/meenakshi.jpg'),
('Rockfort Temple', 'Tiruchirappalli', 'A historic fort and temple complex built on an ancient rock formation.', 'https://example.com/rockfort.jpg');
