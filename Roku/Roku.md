Pablo Munoz Hidalgo ~ Carne: 2020031899
Instituto Tecnologico de Costa Rica
Programacion Orientada a Objetos ~ 17/09/2020


-----------------------------------------------------------------


--Nombre:-- Roku

--Referencia:-- https://www.roku.com/es-cr/

--Resumen del Software:-- Roku es un software para pantallas que facilita la busqueda de entretenimiento visual por medio de internet, este las convierte en medios de reproduccion digital utilizando varios servicios como Netflix, Hulu, etc...

--Clasificacion del Software:-- Software de Aplicacion

--Tipo de licencia:-- Privada

--Involucrados:-- 
-Usuarios*
(*Directos: Personas que tienen pantallas SIN la capacidad de reproducir medios de entretenimiento de manera autonoma, osea, necesitan un dispositivo externo para poder hacer la pantalla "Inteligente".)
(*Secundarios: Empresas que colaboran con Roku.)
-Clientes (Netflix, Hulu, TED, Cinepolis, Crunchyroll o Prime Video)
-Equipo de Ingenieria (El mismo Roku)
-Autoridades (Autoridades de proteccion de datos y seguridad en internet respectivas de cada pais [CR: SUTEL])

--Requerimientos Funcionales:--

**Registrar Nuevo Usuario**
Entradas: 
-Nombre Completo
-Correo Electronico
-Pais o Region

Salidas:
-Mensaje "Usuario registrado exitosamente"

Comportamiento:
-Se toman los datos del usuario y se registran en la base de datos de Roku como un nuevo usuario.

**Instalar en una Nueva Pantalla (Dispositivo)**
Entradas:
-Marca
-Modelo
-Resolucion

Salidas:
-Mensaje "Se esta configurando Roku" en el proceso.
-Mensaje "Se ha finalizado la instalacion, bienvenido" al finalizar exitosamente.

Comportamiento:
-Se envian los datos de entrada a la base de datos y se inicia por medio del usb o dispositivo externo la configuracion de resolucion y otras caracteristicas.

**Registrar Nuevo Patrocinador (Previamente negociado)**
Entradas:
-Nombre
-Tipo de servicio
-Logo (.png)
-Direccion web

Salidas:
-Mensaje "Nuevo patrocinador registrado exitosamente".

Comportamiento: Se registran los datos en la base de datos y se muestra como nueva opcion de entretenimiento a los usuarios en sus dispositivos.


**Verificar Actualizacion de Software**
Entradas:
-Version actual del software
-Confirmacion de busqueda por parte del usuario

Salidas:
-Valor Booleano con mensaje adjunto de confirmacion en caso de ser verdadero o negacion en caso de ser falso

Comportamiento: Se compara la version del dato de entrada con la mas actualizada en la base de datos y se da un veredicto con base al resultado.


--Requerimientos no funcionales:--

-Portabilidad y Compatibilidad: A menos que el dispositivo o pantalla no tenga entrada HDMI Roku funcionara sin problemas, por lo que le da una alta compatibilidad y portabilidad. Ademas es un dispositivo muy pequeno por lo que es facil de transportar.

-Internacionalizacion y localizacion: Llegado a este punto el dispositivo Roku casi en cualquier pais ofrece sus servicios, siempre siguiendo las regulaciones de cada pais respectivamente.



