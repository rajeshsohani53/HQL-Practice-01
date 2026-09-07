# HQL Practice 01

A small Java + Hibernate project for practicing ORM mapping and HQL (Hibernate Query Language), built around a `Festival` entity backed by a MySQL database.

## Tech stack

- Java
- Hibernate ORM 6.3.1
- MySQL (via `mysql-connector-java`)
- Maven

## Project structure

```
src/main/java/com/rajesh/
├── Entity/
│   └── Festival.java        # Entity: id, name, description, month, sweet
├── Main/
│   ├── GetConnection.java   # Builds the Hibernate SessionFactory
│   ├── FestivalDao.java     # get / insert operations
│   └── Application.java     # Seeds sample festival data
└── HQL/
    └── HQL01.java            # HQL query practice (e.g. "From Festival")

src/main/resources/
├── hibernate.cfg.xml         # Hibernate + MySQL connection config
└── Festival.hbm.xml          # Hibernate mapping file for Festival
```

## Setup

1. Create a MySQL database matching the one in `hibernate.cfg.xml` (`hibernatedb`), and update the connection URL/username/password there to match your local MySQL setup.
2. Build with Maven:
   ```
   mvn clean install
   ```
3. Run `Application.java` to insert sample festival records.
4. Run `HQL01.java` to practice fetching and querying data with HQL.

## What this project practices

- Mapping a POJO to a database table with Hibernate (`.hbm.xml`)
- Basic CRUD via `Session` (`persist`, `get`)
- Writing and running HQL queries against mapped entities
