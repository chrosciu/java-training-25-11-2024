-- Tworzenie tabeli COUNTRIES
CREATE TABLE countries (
                           country_id CHAR(2) PRIMARY KEY,
                           country_name VARCHAR(40) NOT NULL,
                           region_id INT
);

-- Tworzenie tabeli REGIONS
CREATE TABLE regions (
                         region_id SERIAL PRIMARY KEY,
                         region_name VARCHAR(25)
);

-- Tworzenie tabeli LOCATIONS
CREATE TABLE locations (
                           location_id SERIAL PRIMARY KEY,
                           street_address VARCHAR(40),
                           postal_code VARCHAR(12),
                           city VARCHAR(30) NOT NULL,
                           state_province VARCHAR(25),
                           country_id CHAR(2) REFERENCES countries(country_id)
);

-- Tworzenie tabeli DEPARTMENTS
CREATE TABLE departments (
                             department_id SERIAL PRIMARY KEY,
                             department_name VARCHAR(30) NOT NULL,
                             manager_id INT,
                             location_id INT REFERENCES locations(location_id)
);

-- Tworzenie tabeli JOBS
CREATE TABLE jobs (
                      job_id VARCHAR(10) PRIMARY KEY,
                      job_title VARCHAR(35) NOT NULL,
                      min_salary NUMERIC(8,2),
                      max_salary NUMERIC(8,2)
);

-- Tworzenie tabeli EMPLOYEES
CREATE TABLE employees (
                           employee_id SERIAL PRIMARY KEY,
                           first_name VARCHAR(20),
                           last_name VARCHAR(25) NOT NULL,
                           email VARCHAR(25) UNIQUE NOT NULL,
                           phone_number VARCHAR(20),
                           hire_date DATE NOT NULL,
                           job_id VARCHAR(10) REFERENCES jobs(job_id),
                           salary NUMERIC(8,2),
                           commission_pct NUMERIC(2,2),
                           manager_id INT REFERENCES employees(employee_id),
                           department_id INT REFERENCES departments(department_id)
);

-- Tworzenie tabeli JOB_HISTORY
CREATE TABLE job_history (
                             employee_id INT REFERENCES employees(employee_id),
                             start_date DATE NOT NULL,
                             end_date DATE NOT NULL,
                             job_id VARCHAR(10) REFERENCES jobs(job_id),
                             department_id INT REFERENCES departments(department_id),
                             PRIMARY KEY (employee_id, start_date)
);

-- Dodanie przykładowych danych do tabeli REGIONS
INSERT INTO regions (region_name) VALUES ('Europe'), ('Americas'), ('Asia'), ('Middle East and Africa');

-- Dodanie przykładowych danych do tabeli COUNTRIES
INSERT INTO countries (country_id, country_name, region_id) VALUES
                                                                ('US', 'United States', 2),
                                                                ('CA', 'Canada', 2),
                                                                ('UK', 'United Kingdom', 1),
                                                                ('IT', 'Italy', 1),
                                                                ('JP', 'Japan', 3),
                                                                ('CN', 'China', 3);

-- Dodanie przykładowych danych do tabeli LOCATIONS
INSERT INTO locations (street_address, postal_code, city, state_province, country_id) VALUES
                                                                                          ('1297 Via Cola di Rie', '98999', 'Roma', NULL, 'IT'),
                                                                                          ('93091 Calle della Testa', '10934', 'Venice', NULL, 'IT'),
                                                                                          ('2017 Shinjuku-ku', '1689', 'Tokyo', 'Tokyo Prefecture', 'JP'),
                                                                                          ('2007 St. Marys Ave', '96813', 'Hawaii', 'Hawaii', 'US');

-- Dodanie przykładowych danych do tabeli JOBS
INSERT INTO jobs (job_id, job_title, min_salary, max_salary) VALUES
                                                                 ('AD_PRES', 'President', 20000, 40000),
                                                                 ('AD_VP', 'Administration Vice President', 15000, 30000),
                                                                 ('IT_PROG', 'Programmer', 4000, 10000),
                                                                 ('MK_MAN', 'Marketing Manager', 9000, 15000);

-- Dodanie przykładowych danych do tabeli DEPARTMENTS
INSERT INTO departments (department_name, manager_id, location_id) VALUES
                                                                       ('Administration', NULL, 1),
                                                                       ('Marketing', NULL, 2),
                                                                       ('Purchasing', NULL, 2),
                                                                       ('Human Resources', NULL, 2);

-- Dodanie przykładowych danych do tabeli EMPLOYEES
INSERT INTO employees (first_name, last_name, email, phone_number, hire_date, job_id, salary, department_id) VALUES
                                                                                                                 ('Steven', 'King', 'SKING', '515.123.4567', '2003-06-17', 'AD_PRES', 24000, 1),
                                                                                                                 ('Neena', 'Kochhar', 'NKOCHHAR', '515.123.4568', '2005-09-21', 'AD_VP', 17000, 2),
                                                                                                                 ('Lex', 'De Haan', 'LDEHAAN', '515.123.4569', '2001-01-13', 'AD_VP', 17000, 2);

-- Dodanie przykładowych danych do tabeli JOB_HISTORY
INSERT INTO job_history (employee_id, start_date, end_date, job_id, department_id) VALUES
                                                                                       (1, '2001-03-17', '2003-06-17', 'IT_PROG', 3),
                                                                                       (2, '2003-09-21', '2005-09-21', 'MK_MAN', 4);

-- Komentarz informacyjny o zakończeniu
-- Skrypt został wykonany pomyślnie. Schemat bazy danych hr został utworzony.
