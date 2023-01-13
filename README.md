# QALAB_Automatizacion-web
Enunciado:
Se requiere realizar una automatización para validar funcionalidad del login y del carrito de compra.

Los datos de autentificacion estan escritas en el escenario.

Realizar lo siguiente (tomar en cuenta el siguiente escenario gherkin):

Tomar en cuenta esta pagina web:

https://www.saucedemo.com/
Escenario: Iniciar sesión
  Dado que me encuentro en la página de login de Saucedemo
  Cuando inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
  Entonces valido que debería aparecer el título de "PRODUCTS"
  Y también valido que al menos exista un item
  Y agrego un item al carrito de compras
  Y reviso que el carrito de compras tenga un item agregado
  Y valido que el item agregado se llame "Sauce Labs Bike Light"
  
Pasaron todos los test
![](https://github.com/asantisl/QALAB_Automatizacion-web/blob/main/img/test.png)
