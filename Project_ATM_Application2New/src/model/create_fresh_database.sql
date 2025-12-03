-- Delete existing database and create fresh one
DROP DATABASE IF EXISTS atm;
CREATE DATABASE atm;
USE atm;

-- Create accounts table
CREATE TABLE accounts (
    id VARCHAR(20) PRIMARY KEY,
    account_number VARCHAR(20) UNIQUE NOT NULL,
    account_holder_name VARCHAR(100) NOT NULL,
    balance DECIMAL(15,2) DEFAULT 0.00,
    account_type VARCHAR(20) NOT NULL,
    mobile_number VARCHAR(15) NOT NULL,
    pin VARCHAR(6) NOT NULL,
    username VARCHAR(50) UNIQUE NOT NULL
);

-- Create transaction history table
CREATE TABLE transaction_history (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    account_id VARCHAR(20),
    transaction_type VARCHAR(20) NOT NULL,
    amount DECIMAL(15,2) NOT NULL,
    balance_after DECIMAL(15,2) NOT NULL,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (account_id) REFERENCES accounts(id)
);

-- Insert account data
INSERT INTO accounts VALUES 
('101', '847583944389', 'Vaibhav Gosavi', 100000.00, 'Saving', '9657160283', '9090', 'Vaibhav@11'),
('102', '236456932234', 'Abhishek Anap', 110000.00, 'Current', '9123456780', '1122', 'Abhi@21'),
('103', '812432234342', 'Nikhil Shinde', 150000.00, 'Saving', '9087563456', '3344', 'NS@125'),
('104', '747584974389', 'Govind Pawar', 90000.00, 'Saving', '9561424284', '2003', 'Govind@2025');