# di-factura-springboot-api
Este proyecto es una API REST desarrollada con Spring Boot que gestiona la creación y presentación de facturas. El enfoque principal del proyecto es demostrar la aplicación de la Inyección de Dependencias (Dependency Injection - DI) en un entorno Spring.

## Características principales:
-Controladores REST: Exposición de endpoints para acceder a la información de facturas.<br>
-Inyección de Dependencias: Uso de anotaciones de Spring como @Autowired, @Component, @RequestScope y configuraciones de beans en AppConfig.java.<br>
-Configuración de Beans: Definición de beans para la creación de listas de ítems en la factura.<br>
-Propiedades Externas: Configuración de propiedades externas mediante archivos .properties para parametrizar información del cliente y la descripción de las facturas.
## Estructura del Proyecto:
-Controllers: Contiene el controlador InvoiceController, que maneja las solicitudes REST.<br>
-Models: Define las clases Client, Invoice, Item, y Product que representan los datos de la aplicación.<br>
-AppConfig: Clase de configuración que define los beans y sus dependencias.<br><br><br>
"Este repositorio es ideal para aprender y aplicar conceptos de Spring Boot, especialmente en relación a la inyección de dependencias y la creación de APIs REST."
