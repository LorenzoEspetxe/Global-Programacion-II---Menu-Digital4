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


    }
}