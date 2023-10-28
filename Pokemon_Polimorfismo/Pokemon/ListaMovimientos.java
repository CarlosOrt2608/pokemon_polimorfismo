package Pokemon;

import java.util.ArrayList;
public class ListaMovimientos{
    
    private ArrayList<Movimiento> movimientos=new ArrayList<>();
    
    
    
   
    /**
     * 
     */
    public ListaMovimientos(){
        movimientos.add(new Movimiento("Trajo Areo", 75, 15, Tipo.VOLADOR, TipodeMovimiento.ESTADO));
            movimientos.add(new Movimiento("Arañazo", 100, 40, Tipo.NORMAL, TipodeMovimiento.FISICO));
        movimientos.add(new Movimiento("Ascuas", 90, 25, Tipo.FUEGO, TipodeMovimiento.ESTADO));
            movimientos.add(new Movimiento("Garra  dragon", 80, 15, Tipo.DRAGON, TipodeMovimiento.FISICO));

        movimientos.add(new Movimiento("Gruñido", 0, 40, Tipo.NORMAL, TipodeMovimiento.ESPECIAL));
            movimientos.add(new Movimiento("Pistola agua", 40, 25, Tipo.AGUA, TipodeMovimiento.ESTADO));
        movimientos.add(new Movimiento("Rayo Confuso", 0, 10, Tipo.FANTASMA, TipodeMovimiento.ESTADO));
            movimientos.add(new Movimiento("Canto Helado", 40, 30, Tipo.HIELO, TipodeMovimiento.FISICO));
    }
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for(Movimiento movimiento:movimientos){
            if(movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
            
        }
        return null;
    }
}
    