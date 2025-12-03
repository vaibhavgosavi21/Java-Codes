# ATM Database Setup Instructions

## 1. Install MySQL
- Download and install MySQL Server
- Set root password as "root" (or update DataBaseConnection.java)

## 2. Create Database
- Open MySQL Command Line or MySQL Workbench
- Run the SQL script: `src/model/database_setup.sql`

## 3. Add MySQL Driver
**Option A - Maven (Recommended):**
- Convert project to Maven in Eclipse
- Use the provided pom.xml

**Option B - Manual JAR:**
- Download mysql-connector-java-8.0.33.jar
- Add to project Build Path in Eclipse

## 4. Test Connection
- Run ATMMain.java
- Login with: username=`john123`, PIN=`1234`
- Or: username=`jane456`, PIN=`5678`

## Database Details
- Host: localhost:3306
- Database: school
- Username: root
- Password: root