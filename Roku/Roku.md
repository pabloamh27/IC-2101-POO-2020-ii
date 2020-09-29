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

**Instalar en una Nueva Pantalla**
Entradas:
-Marca
-Modelo
-Resolucion

Salidas:
-Mensaje "Se esta configurando Roku" en el proceso.
-Mensaje "Se ha finalizado la instalacion, bienvenido" al finalizar exitosamente.

Comportamiento:
-Se envian los datos de entrada a la base de datos y se inicia por medio del usb o dispositivo externo la configuracion de resolucion y otras caracteristicas.

**Publicar Nuevo Servicio de streaming**
Entradas:
-Nombre
-Tipo de entretenimiento
-Logo
-Direccion web

Salidas:
-Mensaje "Nuevo Servicio de streaming publicado exitosamente".

Comportamiento: Se registra en la base de datos y se muestra como nueva opcion de entretenimiento a los usuarios en sus dispositivos.


**Verificar Actualizacion de Software**
Entradas:
-Version actual del software
-Confirmacion de busqueda por parte del usuario

Salidas:
-Valor Booleano con mensaje adjunto de confirmacion en caso de ser verdadero o negacion en caso de ser falso

Comportamiento: Se compara la version del dato de entrada con la mas actualizada en la base de datos y se da un veredicto con base al resultado.


--Requerimientos no funcionales:--

-Portabilidad y Compatibilidad: A menos que la pantalla no tenga entrada HDMI Roku funcionara sin problemas, por lo que le da una alta compatibilidad y portabilidad. Ademas es un dispositivo muy pequeño por lo que es facil de transportar. Al tener su propio SO no debe ser compatible con otro software ademas de el mismo.

-Internacionalizacion y localizacion: Llegado a este punto el dispositivo Roku casi en cualquier pais ofrece sus servicios, siempre siguiendo las regulaciones de cada pais respectivamente. La empresa se ubica en Los Gatos, California, Estados Unidos y utiliza como moneda principal el dolar.




--6 Casos de Uso--

1.Inscribir nuevo usuario
2.Eliminar usuario registrado
3.Registrar nuevo canal de entretenimiento en el sistema
4.Añadir canal de entretenimiento a favoritos
5.Eliminar canal de entretenimiento de favoritos
6.Establecer nueva conexion a una red de internet(configuracion)

*Profe, la verdad hoy no ando creativo.



--Actores--
-Nuevo Usuario
-Usuario Registrado
-Programadores
-Director de Roku
-Departamento de marketing
-Empresa propietaria del canal

*Profe, solo pongo estos actores ya que son los que uso en las descripciones.

--Descripciones detalladas--

1.Inscribir nuevo usuario:
	*Actor Primario: -Nuevo Usuario
	*Actor Secundario: -Programadores (Quienes programan el sistema de registro)
	*Pre-Condiciones: -Correo Electronico
					  -Contraseña
					  -Numero Telefonico
					  -Pais o Region
	*Post-Condiciones: -El nuevo usuario queda registrado en el sistema pasando a ser un usuario registrado.
	*Flujo Principal: 1.El nuevo usuario selecciona la opcion "Inscribirse/Registrarse"
					  2.El sistema le muestra la pantalla de registro al nuevo usuario
					  3.El usuario ingresa los datos solicitados (Pre-Condiciones)
					  4.El sistema verifica la autenticidad de la informacion, que la contraseña siga una serie de reglas y envia un correo electronico de verificacion
					  5.El usuario confirma por medio del correo
					  6.El sistema muestra un mensaje "Correo verificado, inscripcion exitosa"
	*Flujos Alternos: 
					  1.El sistema no recibe todas las precondiciones, rechazando el registro.
					  2.El sistema rechaza la contraseña.
					  3.El usuario no contesta al correo de verificacion.


2.Eliminar usuario registrado:
	*Actor Primario: -Usuario registrado
	*Actor Secundario: -Programadores (Quienes programan el sistema de registro)
	*Pre-Condiciones: -Ser un usuario registrado del sistema
	*Post-Condiciones: -El usuario y su informacion quedan eliminados del sistema
	*Flujo Principal: 1.El usuario registrado seleccion la opcion de "Eliminar Cuenta"
					  2.El sistema muestra opcion de "Confirmar eliminacion de cuenta"
					  3.El usuario confirma
					  4.El sistema borra al usuario del sistema y lo envia al menu de registro

	*Flujos Alternos: 1.El usuario NO confirma la eliminacion, cancelando asi el proceso.


3.Registrar nuevo canal de entretenimiento en el sistema (Previamente aprovado):
	*Actor Primario: -Programador
	*Actor Secundario: -Empresa propietaria del canal
					   -Director de Roku
					   -Departamento de marketing
	*Pre-Condiciones: -Nombre del canal
					  -Link especial del canal ()
	*Post-Condiciones: -El canal queda registrado en el sistema
					   -Se emite un mensaje a los actores secundarios para que se proceda con la publicacion del canal.
	*Flujo Principal: 1.El programador entra en la opcion de desarrollador "Ingresar nuevo canal".
					  2.El sistema muestra la pantalla de registro de nuevo canal.
					  3.El programador ingresa las pre-condiciones.
					  4.El sistema verifica la compatibilidad del link especial con el sistema.
					  5.Se completa el registro del canal nuevo dejandolo listo para la publicacion.
	*Flujos Alternos: 1.En caso de que el link no sea compatible el sistema retorna el codigo de error respectivo.


4.Añadir canal de entretenimiento a favoritos:
	*Actor Primario: -Usuario Registrado
	*Actor Secundario: -Empresa propietaria del canal
					   -Departamento de marketing
	*Pre-Condiciones: -Ser usuario registrado
					  -Canal existente
	*Post-Condiciones: -Se agrega el canal a favoritos
					   -Se envian datos estadisticos al departamento de marketing y a la empresa propietaria del canal. 
	*Flujo Principal: 1.El usuario registrado selecciona la opcion "Agregar canal a favoritos".
	                  2.Se verifican las pre-condiciones.
	                  3.Se añade a la lista de favoritos
	*Flujos Alternos: 1.Si no se cumplen las pre-condiciones se envia un mensaje de error.


5.Eliminar canal de entretenimiento de favoritos:
	*Actor Primario: -Usuario Registrado
	*Actor Secundario: -Empresa propietaria del canal
					   -Departamento de marketing
	*Pre-Condiciones: -Ser usuario registrado
					  -Canal existente 
					  -Canal en lista de favoritos
	*Post-Condiciones: -Se elimina el canal a favoritos
					   -Se envian datos estadisticos al departamento de marketing y a la empresa propietaria del canal.
	*Flujo Principal: 1.El usuario registrado selecciona la opcion "Eliminar canal de favoritos".
	                  2.Se verifican las pre-condiciones.
	                  3.Se elimina de la lista de favoritos
	*Flujos Alternos: 1.Si no se cumplen las pre-condiciones se envia un mensaje de error.
					  2.Se envia un mensaje "Este canal no esta en tu lista de favoritos".


6.Establecer nueva conexion a una red de internet(configuracion/etapa de registro):
	*Actor Primario: -Usuario.
	*Actor Secundario: -Programadores (Encargados del sistema de registro y/o configuracion).
	*Pre-Condiciones: -Medio para conectarse a internet
					  -Conexion a internet
	*Post-Condiciones: -Se registra nueva conexion en el sistema
					   -Se envian los datos estadisticos de la red y el dispositivo de conexion.
	*Flujo Principal: 1.El usuario selecciona la opcion de "Configurar nueva red"
					  2.El sistema verifica que exista un medio para conectarse a internet
					  3.El sistema busca redes disponibles y las muestra al usuario
					  4.El usuario selecciona una red
					  5.El sistema verifica la conexion y envia datos a los actores secundarios
					  6.Se registra como red predeterminada y como nueva conexion a internet.
	*Flujos Alternos: 1.Si no hay medio de conexion se cancela el proceso retornando un error
					  2.Si no hay conexion se empiezan nuevos intentos de conexion durante 2 mins, si no se cancela el proceso.







