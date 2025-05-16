import java.time.LocalDate;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instanciamos algunas UnidadDeMedida:
        UnidadDeMedida unidadMililitros = new UnidadDeMedida("mililitros");
        UnidadDeMedida unidadGramos = new UnidadDeMedida("gramos");
        UnidadDeMedida unidadUnidades = new UnidadDeMedida("unidades");

        // Instanciamos Imagenes para algunos articulos:
        Imagen imagenCerveza = new Imagen("Cerveza Rubia Artesanal", "https://ejemplo.com/imagenes/cerveza_rubia.png");
        Imagen imagenCocaCola = new Imagen("Coca Cola en Lata", "https://ejemplo.com/imagenes/coca_cola_lata.png");

        // Instanciamos la Imagen de Pizza:
        Imagen imagenPizzaMuzza = new Imagen("Pizza Muzzarella Grande", "https://ejemplo.com/imagenes/pizza_muzza.web");
        // Y la Imagen de sus ingredientes:
        Imagen imagenMasaPizza = new Imagen("Masa para Pizza", "https://ejemplo.com/imagenes/masa_pizza.jpg");
        Imagen imagenSalsaTomate = new Imagen("Salsa de Tomate para Pizza", "https://ejemplo.com/imagenes/salsa_tomate_pizza.png");
        Imagen imagenQuesoMuzzarella = new Imagen("Queso Muzzarella Rallado", "https://ejemplo.com/imagenes/muzzarella_rallada.jpg");

        // Instanciamos la Imagen de PapasFritas:
        Imagen imagenPapasFritas = new Imagen("Porción Papas Fritas", "https://ejemplo.com/imagenes/papas_fritas.jpg");

        Imagen imagenPapas = new Imagen("Papas para Freír", "https://ejemplo.com/imagenes/papas_freir.jpg");
        Imagen imagenAceite = new Imagen("Aceite Vegetal", "https://ejemplo.com/imagenes/aceite_vegetal.png");
        Imagen imagenSal = new Imagen("Sal Fina", "https://ejemplo.com/imagenes/sal_fina.jpg");


        // Instanciamos ArticuloInsumos, les cargamos las imagenes:
        ArticuloInsumo papaInsumo = new ArticuloInsumo("Papa", unidadGramos, true);
        papaInsumo.agregarImagen(imagenPapas);
        ArticuloInsumo aceiteInsumo = new ArticuloInsumo("Aceite Vegetal", unidadMililitros, true);
        aceiteInsumo.agregarImagen(imagenAceite);
        ArticuloInsumo salInsumo = new ArticuloInsumo("Sal Fina", unidadGramos, true);
        salInsumo.agregarImagen(imagenSal);
        ArticuloInsumo masaPizzaInsumo = new ArticuloInsumo("Masa para Pizza", unidadGramos, true);
        masaPizzaInsumo.agregarImagen(imagenMasaPizza);
        ArticuloInsumo quesoMuzzarellaInsumo = new ArticuloInsumo("Queso Muzzarella", unidadGramos, true);
        quesoMuzzarellaInsumo.agregarImagen(imagenQuesoMuzzarella);
        ArticuloInsumo salsaDeTomateInsumo = new ArticuloInsumo("Salsa de Tomate", unidadMililitros, true);
        salsaDeTomateInsumo.agregarImagen(imagenSalsaTomate);
        ArticuloInsumo cervezaInsumo = new ArticuloInsumo("Cerveza Rubia", unidadUnidades, false);
        cervezaInsumo.agregarImagen(imagenCerveza);
        ArticuloInsumo cocaColaInsumo = new ArticuloInsumo("Gaseosa Coca-Cola", unidadUnidades, false);
        cocaColaInsumo.agregarImagen(imagenCocaCola);

        // Instanciamos los detalles de unas Papas:
        ArticuloManufacturadoDetalle detallePapaFritaPapa = new ArticuloManufacturadoDetalle(500, papaInsumo);
        ArticuloManufacturadoDetalle detallePapaFritaAceite = new ArticuloManufacturadoDetalle(500, aceiteInsumo);
        ArticuloManufacturadoDetalle detallePapaFritaSal = new ArticuloManufacturadoDetalle(50, salInsumo);

        // Instanciamos los detalles para una Muzza:
        ArticuloManufacturadoDetalle detallePizzaMuzzaMasa = new ArticuloManufacturadoDetalle(1000, masaPizzaInsumo);
        ArticuloManufacturadoDetalle detallePizzaMuzzaSalsa = new ArticuloManufacturadoDetalle(300, salsaDeTomateInsumo);
        ArticuloManufacturadoDetalle detallePizzaMuzzaMuzzarella = new ArticuloManufacturadoDetalle(300, quesoMuzzarellaInsumo);


        /* Chequeamos que vaya mas o menos bien
        System.out.println("Detalles para Papas Fritas:");
        System.out.println(detallePapaFritaPapa);
        System.out.println(detallePapaFritaAceite);
        System.out.println(detallePapaFritaSal);

        System.out.println("\nDetalles para Pizza Muzzarella:");
        System.out.println(detallePizzaMuzzaMasa);
        System.out.println(detallePizzaMuzzaSalsa);
        System.out.println(detallePizzaMuzzaMuzzarella);*/

        // Instanciamos Papas y Muzza
        ArticuloManufacturado papasMedianas = new ArticuloManufacturado("Papas Fritas (Porción)", unidadUnidades, 15); // Estimado 15 minutos
        papasMedianas.setDescripcion("Deliciosas papas fritas caseras.");
        papasMedianas.setPreparacion("Cortar papas, freír en aceite caliente, salar al gusto.");
        papasMedianas.agregarDetalleInsumos(detallePapaFritaPapa);
        papasMedianas.agregarDetalleInsumos(detallePapaFritaAceite);
        papasMedianas.agregarDetalleInsumos(detallePapaFritaSal);
        papasMedianas.agregarImagen(imagenPapasFritas);

        ArticuloManufacturado muzza8Porciones = new ArticuloManufacturado("Pizza Muzzarella (Grande)", unidadUnidades, 20); // Estimado 20 minutos
        muzza8Porciones.setDescripcion("Clásica pizza de muzzarella con salsa de tomate.");
        muzza8Porciones.setPreparacion("Estirar masa, agregar salsa y muzzarella, hornear.");
        muzza8Porciones.agregarDetalleInsumos(detallePizzaMuzzaMasa);
        muzza8Porciones.agregarDetalleInsumos(detallePizzaMuzzaSalsa);
        muzza8Porciones.agregarDetalleInsumos(detallePizzaMuzzaMuzzarella);
        muzza8Porciones.agregarImagen(imagenPizzaMuzza);

        // System.out.println(muzza8Porciones);
        // System.out.println(papasMedianas);

        // Instanciamos un domicilio con Argentina, Mendoza, Godoy Cruz.
        Pais pais = new Pais();
        pais.setNombre("Argentina");

        Provincia provincia = new Provincia();
        provincia.setNombre("Mendoza");
        provincia.setPais(pais);

        Localidad localidad = new Localidad();
        localidad.setNombre("Godoy Cruz");
        localidad.setProvincia(provincia);

        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("San Martin");
        domicilio.setNumero(123);
        domicilio.setCodigoPostal(5501);
        domicilio.setLocalidad(localidad);

        // System.out.println(domicilio);

        // Instanaciamos empresa, con 2 sucursales.
        Empresa empresa = new Empresa();
        empresa.setNombre("Buen Sabor");
        empresa.setRazonSocial("Buen Sabor S.A.");
        empresa.setCuil(306789123);

        Sucursal sucursal1 = new Sucursal();
        sucursal1.setNombre("Sucursal Centro");
        sucursal1.setHorarioApertura(LocalTime.of(9, 0));
        sucursal1.setHorarioCierre(LocalTime.of(22, 0));
        sucursal1.setDomicilio(domicilio);

        Sucursal sucursal2 = new Sucursal();
        sucursal2.setNombre("Sucursal Sur");
        sucursal2.setHorarioApertura(LocalTime.of(10, 0));
        sucursal2.setHorarioCierre(LocalTime.of(23, 0));
        sucursal2.setDomicilio(domicilio);

        empresa.addSucursal(sucursal1);
        empresa.addSucursal(sucursal2);

        // Instanciamos un usuario y cliente.
        Usuario usuario = new Usuario();
        usuario.setId("auth0|abc123");
        usuario.setUsername("juan_p");

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setTelefono("2611234567");
        cliente.setEmail("juanp@gmail.com");
        cliente.setFechaNacimiento(LocalDate.of(1990, 5, 15));
        cliente.setUsuario(usuario);

        // System.out.println(cliente);
        // System.out.println(usuario);

        // === PEDIDO Y DETALLES ===
        DetallePedido detPedido1 = new DetallePedido();
        detPedido1.setCantidad(1);
        detPedido1.setSubTotal(2500);
        detPedido1.setArticulo(papasMedianas);

        Pedido pedido = new Pedido();
        pedido.setHoraEstimadaFinalizacion(LocalTime.of(20, 30));
        pedido.setTotal(7500);
        pedido.setTotalCosto(6000);
        pedido.setEstado(Estado.PENDIENTE);
        pedido.setTipoEnvio(TipoEnvio.DELIVERY);
        pedido.setFormaPago(FormaPago.EFECTIVO);
        pedido.setFechaPedido(LocalDate.now());
        pedido.setSucursal(sucursal1);
        pedido.agregarDetallePedido(detPedido1);



        // === FACTURA ===
        Factura factura = new Factura();
        factura.setFechaFacturacion(LocalDate.now());
        factura.setMpPaymentId(111222333);
        factura.setMpMerchantOrderId(987654321);
        factura.setMpPreferenceId("pref123");
        factura.setMpPaymentType("credit_card");
        factura.setFormaPago(FormaPago.MERCADOPAGO);
        factura.setTotalVenta(7500);

        pedido.setFactura(factura);
        // System.out.println(pedido);

        // === PROMOCIONES ===
        Promocion promo1 = new Promocion();
        promo1.setDenominacion("2x1");
        promo1.setFecheDesde(LocalDate.now().minusDays(5));
        promo1.setFechaHasta(LocalDate.now().plusDays(5));
        promo1.setHoraDesde(LocalTime.of(18, 0));
        promo1.setHoraHasta(LocalTime.of(21, 0));
        promo1.setDescripcionDescuento("2x1 en pizzas");
        promo1.setPrecioPromocional(2000);
        promo1.setTipoPromocion(TipoPromocion.HAPPYHOUR);

        Promocion promo2 = new Promocion();
        promo2.setDenominacion("Combo Almuerzo");
        promo2.setFecheDesde(LocalDate.now().minusDays(2));
        promo2.setFechaHasta(LocalDate.now().plusDays(2));
        promo2.setHoraDesde(LocalTime.of(12, 0));
        promo2.setHoraHasta(LocalTime.of(15, 0));
        promo2.setDescripcionDescuento("Pizza + bebida");
        promo2.setPrecioPromocional(3000);
        promo2.setTipoPromocion(TipoPromocion.PROMOCION1);

        sucursal1.addPromocion(promo1);
        sucursal1.addPromocion(promo2);

        // Instanciar todas las categorias:
        Categoria bebidas = new Categoria("Bebidas");
        Categoria alimentos = new Categoria("Alimentos");
        Categoria bebidasAlcoholicas = new Categoria("Bebidas alcoholicas");
        Categoria sacks = new Categoria("Snacks");
        Categoria pizzas = new Categoria("Pizzas");

        // Establecemos las relaciones de subcategrias
        bebidas.addCategoria(bebidasAlcoholicas);
        alimentos.addCategoria(sacks);

        // Pizzas es subcategoria de Alimentos
        alimentos.addCategoria(pizzas);

        // System.out.println(bebidas.getDenominacion() + " tiene subcategorias: " + bebidas.getSetDeSubCategorias());
        // System.out.println(alimentos.getDenominacion() + " tiene subcategorias: " + alimentos.getSetDeSubCategorias());



    }
}