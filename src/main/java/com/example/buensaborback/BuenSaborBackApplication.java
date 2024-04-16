package com.example.buensaborback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BuenSaborBackApplication {
// Aca tiene que inyectar todos los repositorios
// Es por ello que deben crear el paquete reositorio

// Ejemplo  @Autowired
//	private ClienteRepository clienteRepository;


	public static void main(String[] args) {
		SpringApplication.run(BuenSaborBackApplication.class, args);

		System.out.println("Estoy activo en el main");
	}


/*
	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository, ArticuloInsumoRepository articuloInsumoRepository, ArticuloManufacturadoRepository articuloManufacturadoRepository, PedidoRepository pedidoRepository, RubroArticuloRepository rubroArticuloRepository, UnidadMedidaRepository unidadMedidaRepository) {
		return args -> {
			System.out.println("----------------ESTOY----FUNCIONANDO---------------------");



}

 */


	// Etapa del dashboard
	// Crear 1 pais
	// Crear 2 provincias para ese pais
	// crear 2 localidades para cada provincia

	// Crear 1 empresa
	// Crear 2 sucursales para esa empresa
	// crear los Domicilios para esas sucursales

	// establecer las relaciones entre los objetos y ver si funciona

	// Crear Unidades de medida
	// Crear Categorías de productos y subCategorías de los mismos
	// Crear Insumos , coca cola , harina , etc
	// crear 3 fotos para cada insumo, Tu modelo lo permite?
	// Crear Articulos Manufacturados
	// Crear 3 fotos para los artículos manufacturados, Tu modelo lo permite?
	// Establcer las relaciones entre estos objetos.
	// Verificar el modelo haciendo System.out y navegando y revisando
	// Crear 2 promociones para una sucursal - Dia de los enamorados y Vendimia
	// Establecer los articulos manufacturados pizzas  e insumos como cerveza que intervienen
	// en esa promoción
	// Tener en cuenta que esa promocion es exclusivamente para una sucursal determinada d euna empresa determinada

	// Etapa totalmente independiente al Dashboard
	// El proceso de selección de platos y pedido




}