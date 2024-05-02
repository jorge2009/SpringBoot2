# SpringBoot2

# Arquitectura de Servicio
# Aplicacion Spring Boot con manejo de entidades JPA
# Se manejas excepciones en los movimiento para evitar errores al no encontrar ningun movimiento o existir algun tipo de error
# Se despliega la solucion en docker que se encuentra en la siguiente ruta
# LA ruta de crud requerido se encuentra en el siguiente repositorio:
# F1  Cruds (GET,POST,PUT,DELETE) /cuenta
#                               /cliente
#                               /movimiento
# F2  Validacion de movimientos al ser deposito de aumentan al saldo y al ser retiros se debitan del saldo, al querer retirar un valor menor se presenta un mensaje de # saldo no disponible 
# F3  Se toma en cuenta en la F2 el registro de movimientos
# F4  Se puede consultar por fechas los movimientos existentes
# "fecha": "2023-01-23",
 #       "tipo_movimiento": "debito",
 #       "valor": 40.0,
 #       "saldo": 40.0,
 #       "cuenta": {
 #           "idCuenta": 1,
 #           "cliente": {
 #               "persona": {
 #                   "identificacion": 1715555647,
 #                   "nombre": "Maria Estrada",
 #                   "genero": "Femenino",
 #                   "idPersona": 1,
 #                   "telefono": 2144443647,
 #                   "edad": 23,
 #                   "direccion": "La central sn y Principal"
 #               }
# F5 Se realizan pruebas initarias con mockito para obtener los clientes
# F6  Se realiza ya ingregracion para despliege en docker
# F7  Se adjunto el docker creado y desplegado
