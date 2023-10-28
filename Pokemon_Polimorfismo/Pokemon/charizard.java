package Pokemon;

public class charizard extends Pokemon{
    private Tipo tipo = Tipo.FUEGO, tipo= Tipo.VOLADOR;

    public charizard(String nombre, int nivel){
        super(nombre, nivel, 78,84,78,100,109,85);
        ListaMovimientos listaMovimientos = new ListaMovimientos();


        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Trajo Areo"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Arañoso"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Ascuas"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Garra Dragon"));
    }
    @Override
    public double obtenerEfectividad(Pokemon pokemonAtacante,int m){
        double efectividad = 1.0;

        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.PLANTA) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ROCA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.HIELO) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ELECTRICO) efectividad = 0.5;
        
        return efectividad;
    }
}
