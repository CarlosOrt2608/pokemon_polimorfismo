package Pokemon;

public class lapras extends Pokemon{
    private Tipo tipo1 = Tipo.HIELO, tipo2 = Tipo.AGUA;

    public lapras(String nombre, int nivel){
        super(nombre, nivel,130,85,80,60,85,95);
       

        

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Gruñido"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Pistola Agua"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Rayo Confuso"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Canto Helado"));
    }
 
    public double obtenerEfectividad(Pokemon pokemonAtacante,int m){
        double efectividad = 1.0;

        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.LUCHA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.FUEGO) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ROCA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ELECTRICO) efectividad = 05;
        if(pokemonAtacante.getMovimientos(m).getTipo()==  Tipo.PLANTA) efectividad = 0.5;
        
        return efectividad;
    }
}


    





