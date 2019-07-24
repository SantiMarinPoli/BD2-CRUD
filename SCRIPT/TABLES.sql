--CREAR TABLAS EN EL USUARIO AS_ELECTRON

CREATE TABLE ESTADO_SERVICIO(
    ID_ESTADO_SERVICIO NUMBER(4),
    NOMBRE_ESRADO_SERVICIO VARCHAR2(50) NOT NULL,
    CONSTRAINT ID_ESTADO_SERVICIO PRIMARY KEY(ID_ESTADO_SERVICIO)
);

CREATE TABLE CIUDAD(
    ID_CIUDAD NUMBER(4),
    NOMBRE_CIUDAD VARCHAR2(50) NOT NULL,
    CONSTRAINT ID_CIUDAD PRIMARY KEY(ID_CIUDAD)
);

CREATE TABLE TIPO_PRODUCTO(
    ID_TIPO_PRODUCTO NUMBER(4),
    NOMBRE_TIPO_PRODUCTO VARCHAR2(50) NOT NULL,
    CONSTRAINT ID_TIPO_PRODUCTO PRIMARY KEY(ID_TIPO_PRODUCTO)
);

CREATE TABLE CARGO(
    ID_CARGO NUMBER(4),
    NOMBRE_CARGO VARCHAR2(30) NOT NULL,
    CONSTRAINT ID_CARGO PRIMARY KEY(ID_CARGO)
);

CREATE TABLE TIPO_IDENTIFICACION(
    ID_TIPO_IDENTIFICACION NUMBER(4),
    NOMBRE_TIPO_IDENTIFICACION VARCHAR2(30) NOT NULL,
    CONSTRAINT ID_TIPO_IDENTIFICACION PRIMARY KEY(ID_TIPO_IDENTIFICACION)
);

CREATE TABLE SEDE(
    ID_SEDE NUMBER(4),
    NOMBRE_EMPRESA VARCHAR2(50)NOT NULL,
    DIRECCION VARCHAR(50)NOT NULL,
    NUMERO_LOCAL VARCHAR2(10),
    NOMBRE_LOCALIDAD VARCHAR(50),
    ID_CIUDAD,
    CONSTRAINT ID_SEDE PRIMARY KEY(ID_SEDE),
    FOREIGN KEY(ID_CIUDAD) REFERENCES CIUDAD(ID_CIUDAD)
);

CREATE TABLE EMPLEADO(
    ID_EMPLEADO INT NOT NULL,
    ID_CARGO NUMBER(4) NOT NULL,
    ID_TIPO_IDENTIFICACION NUMBER(4) NOT NULL,
    NUMERO_INDENTIFICACION VARCHAR2(20) NOT NULL,
    NOMBRE_EMPLEADO VARCHAR2(30) NOT NULL,
    APELLIDO_EMPLEADO VARCHAR2(20) NOT NULL,
    NUMERO_CELULAR VARCHAR2(20) NOT NULL,
    CORREO_EMPLEADO VARCHAR2(30) NOT NULL,
    PASSWORD_EMPLEADO VARCHAR2(20) NOT NULL,
    ID_CIUDAD NUMBER(4) NOT NULL,
    CONSTRAINT ID_EMPLEADO PRIMARY KEY(ID_EMPLEADO),
    FOREIGN KEY(ID_CARGO) REFERENCES CARGO(ID_CARGO),
    FOREIGN KEY(ID_TIPO_IDENTIFICACION) REFERENCES TIPO_IDENTIFICACION(ID_TIPO_IDENTIFICACION),
    FOREIGN KEY(ID_CIUDAD) REFERENCES CIUDAD(ID_CIUDAD)
);

CREATE TABLE CLIENTE(
    ID_CLIENTE INT NOT NULL,
    ID_TIPO_IDENTIFICACION NUMBER(4) NOT NULL,
    NUMERO_INDENTIFICACION VARCHAR2(20) NOT NULL,
    NOMBRE_CLIENTE VARCHAR2(30) NOT NULL,
    APELLIDO_CLIENTE VARCHAR2(20) NOT NULL,
    NUMERO_FIJO VARCHAR2(20),
    NUMERO_CELULAR VARCHAR2(20) NOT NULL,
    CORREO_EMPLEADO VARCHAR2(30),
    ID_CIUDAD NUMBER(4) NOT NULL,
    DIRECCION VARCHAR2(20)NOT NULL,
    CONSTRAINT ID_CLIENTE PRIMARY KEY(ID_CLIENTE),
    FOREIGN KEY(ID_TIPO_IDENTIFICACION) REFERENCES TIPO_IDENTIFICACION(ID_TIPO_IDENTIFICACION),
    FOREIGN KEY(ID_CIUDAD) REFERENCES CIUDAD(ID_CIUDAD)
);

CREATE TABLE PRODUCTO(
    ID_PRODUCTO NUMBER(4),
    ID_TIPO_PRODUCTO NUMBER(4)NOT NULL,
    MARCA_PRODUCTO VARCHAR2(30)NOT NULL,
    NUMERO_MODELO VARCHAR2(20)NOT NULL,
    CODIGO_PRODUCTO VARCHAR2(30)NOT NULL,
    CONSTRAINT ID_PRODUCTO PRIMARY KEY(ID_PRODUCTO),
    FOREIGN KEY(ID_TIPO_PRODUCTO) REFERENCES TIPO_PRODUCTO(ID_TIPO_PRODUCTO)
);


CREATE TABLE SERVICIO(
    ID_SERVICIO NUMBER(4),
    ID_SEDE NUMBER(4)NOT NULL,
    ID_CLIENTE NUMBER(4)NOT NULL,
    NUMERO_CONTACTOS VARCHAR2(80)NOT NULL,
    ID_EMPLEADO NUMBER(4)NOT NULL,
    ID_CARGO NUMBER(4)NOT NULL,
    FECHA_INGRESO DATE NOT NULL,
    FECHA_ENTREGA DATE NOT NULL,
    COMENTARIO_CLIENTE VARCHAR2(500 BYTE)NOT NULL,
    DIAGNOSTICO VARCHAR2(500 BYTE),
    CANTIDAD INT,
    VALOR_SERVICIO INT,
    OBSERVACIONES_REPARACION VARCHAR2(500 BYTE),
    ESTADO_PRODUCTO VARCHAR2(50) NOT NULL,
    DIRECCION_CLIENTE VARCHAR2(50),
    ID_PRODUCTO NUMBER(4)NOT NULL,
    ID_ESTADO_SERVICIO NUMBER(4)NOT NULL,
    CONSTRAINT ID_SERVICIO PRIMARY KEY(ID_SERVICIO),
    FOREIGN KEY (ID_CARGO) REFERENCES CARGO(ID_CARGO),
    FOREIGN KEY(ID_EMPLEADO) REFERENCES EMPLEADO(ID_EMPLEADO),
    FOREIGN KEY(ID_SEDE) REFERENCES SEDE(ID_SEDE),
    FOREIGN KEY(ID_PRODUCTO) REFERENCES PRODUCTO(ID_PRODUCTO),
    FOREIGN KEY(ID_ESTADO_SERVICIO) REFERENCES ESTADO_SERVICIO(ID_ESTADO_SERVICIO),
    FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE(ID_CLIENTE)
);

CREATE TABLE DOMICILIO(
    ID_DOMICILIO INT NOT NULL,
    ID_SERVICIO NUMBER(4) NOT NULL,
    CONSTRAINT ID_DOMICILIO PRIMARY KEY(ID_DOMICILIO),
    FOREIGN KEY(ID_SERVICIO) REFERENCES SERVICIO(ID_SERVICIO)
);

CREATE TABLE AUDITORIA(
    USUARIO VARCHAR2(80),
    FECHA DATE,
    TABLA VARCHAR2(50),
    OPERACION VARCHAR2(80),
    DESCRIPCION VARCHAR2(80)
);

DROP TABLE AUDITORIA;
DROP TABLE CLIENTE;
DROP TABLE SERVICO;
DROP TABLE DOMICILIO;
