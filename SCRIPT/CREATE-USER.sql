--CREAR EL NUEVO USUARIO--
CREATE USER AS_ELECTRON 
IDENTIFIED BY "123"
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE TEMP;

GRANT RESOURCE TO AS_ELECTRON;
GRANT CONNECT TO AS_ELECTRON;
GRANT DBA TO AS_ELECTRON;