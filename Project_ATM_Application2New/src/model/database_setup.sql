-- Create database
CREATE DATABASE IF NOT EXISTS school;
USE school;

-- Create accounts table
CREATE TABLE IF NOT EXISTS accounts (
    id VARCHAR(20) PRIMARY KEY,
    account_number VARCHAR(20) UNIQUE NOT NULL,
    account_holder_name VARCHAR(100) NOT NULL,
    balance DECIMAL(15,2) DEFAULT 0.00,
    account_type VARCHAR(20) NOT NULL,
    mobile_number VARCHAR(15) NOT NULL,
    pin VARCHAR(6) NOT NULL,
    username VARCHAR(50) UNIQUE NOT NULL
);

-- Insert sample data
INSERT INTO accounts VALUES 
('101', '847583944389', 'Vaibhav Gosavi', 100000.00, 'Saving', '9657160283', '9090', 'Vaibhav@11'),
('102', '236456932234', 'Abhishek Anap', 110000.00, 'Current', '9123456780', '1122', 'Abhi@21'),
('103', '812432234342', 'Nikhil Shinde', 150000.00, 'Saving', '9087563456', '3344', 'NS@125'),
('104', '747584974389', 'Govind Pawar', 90000.00, 'Saving', '9561424284', '2003', 'Govind@2025');