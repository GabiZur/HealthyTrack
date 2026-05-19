package Logica;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorHabitos {
    private ArrayList<RegistroAgua> listaAgua;
    private ArrayList<RegistroSuenho> listaSuenho;
    private ArrayList<RegistroEjercicio> listaEjercicios;
    
    public GestorHabitos(){
        listaAgua = new ArrayList<>();
        listaSuenho = new ArrayList<>();
        listaEjercicios = new ArrayList<>();
        
    }

    public ArrayList<RegistroAgua> getListaAgua() {
        return listaAgua;
    }

    public ArrayList<RegistroSuenho> getListaSuenho() {
        return listaSuenho;
    }

    public ArrayList<RegistroEjercicio> getListaEjercicios() {
        return listaEjercicios;
    }
    
    
    
    public boolean registrarAgua(RegistroAgua agua){  
        if(agua.getCantidadAgua() <= 0){
            return false;
        }
        listaAgua.add(agua);
        
        return true;
    }
    
    public boolean registrarSuenho(RegistroSuenho suenho){
        if(suenho.getHorasSuenho() <= 0){
            return false;
        }
        
        if(suenho.getHorasSuenho() > 24){
            return false;
        }
        
        listaSuenho.add(suenho);
        
        return true;
    }
    
    public boolean registrarEjercicio (RegistroEjercicio ejercicio){
        
        if(ejercicio.getTipoEjercicio().trim().isEmpty()){
            return false;
        }
        
        if(ejercicio.getMinutos() <= 0){
            return false;
        }
        
        if(ejercicio.getCalorias() <= 0){
            return false;
        }
        
        if(ejercicio.getCalorias() > 300){
            return false;
        }
        
        listaEjercicios.add(ejercicio);
        return true;
    }
    
    public void mostrarAgua(){
        for(RegistroAgua agua : listaAgua){
            System.out.println(agua.getCantidadAgua() + " vasos - " + agua.getFecha());
        }
    }
    
    public void mostrarEjercicio(){
        for(RegistroEjercicio ejercicio : listaEjercicios){
            System.out.println("Tipo: "+ejercicio.getTipoEjercicio() 
                    + " | Tiempo: " + ejercicio.getMinutos()+ " minutos "
                    + " | Calorias quemadas" + ejercicio.getCalorias()
                    + "Fecha: " + ejercicio.getFecha());
                    
        }
    }
    
    public void mostrarSuenho(){
        for(RegistroSuenho suenho : listaSuenho){
            System.out.println("Horas suenho: " + suenho.getHorasSuenho() 
                    + " | fecha: " + suenho.getFecha());
        }
    }
    
    public boolean editarAgua(int posicion, int nuevaCantidad){
        if(posicion >= 0 && posicion < listaAgua.size()){
            if(nuevaCantidad > 0){
                listaAgua.get(posicion).setCantidadAgua(nuevaCantidad);
                
                return true;
            }
        }
        return false;
    }
    
    public boolean editarSuenho(int posicion, double nuevasHoras){
        if(posicion >= 0 && posicion < listaSuenho.size()){
            
            if(nuevasHoras > 0 && nuevasHoras <= 24){
                listaSuenho.get(posicion).setHorasSuenho(posicion);
                return true;
            }
        }
        return false;
    }
    
    public boolean editarEjercicio(int posicion, String nuevoTipo, int nuevosMinutos, int nuevasCalorias){
        if(posicion >= 0 && posicion < listaEjercicios.size()){
            if(nuevoTipo.trim().isEmpty()){
                return false;
            }
            
            if(nuevosMinutos <= 0 || nuevosMinutos > 300){
                return false;
            }
            
            if(nuevasCalorias <= 0){
                return false;
            }
            
            RegistroEjercicio ejercicio = listaEjercicios.get(posicion);
            ejercicio.setTipoEjercicio(nuevoTipo);
            ejercicio.setCalorias(nuevasCalorias);
            ejercicio.setMinutos(nuevosMinutos);
            
            return true;
            
        }
        
        return false;
        
    }
    
    public boolean eliminarAgua(int cantidad){
        Iterator<RegistroAgua> iterator = listaAgua.iterator();
        
        while(iterator.hasNext()){
            RegistroAgua agua = iterator.next();
            
            if(agua.getCantidadAgua() == cantidad){
                
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarSuenho(double horas){
        Iterator<RegistroSuenho> iterator = listaSuenho.iterator();
        
        while(iterator.hasNext()){
            
            RegistroSuenho suenho = iterator.next();
            
            if(suenho.getHorasSuenho() == horas){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarEjercicio(String tipo){
        
        Iterator<RegistroEjercicio> iterator = listaEjercicios.iterator();
        
        while(iterator.hasNext()){
            RegistroEjercicio ejercicio = iterator.next();
            
            if(ejercicio.getTipoEjercicio().equalsIgnoreCase(tipo)){
                iterator.remove();
            }
            
            return true;
        }
        
        return false;
    }
    
    public void mostrarHistorial(){
        System.out.println("=========== HISTORIAL AGUA ===========");
        
        for(RegistroAgua agua : listaAgua){
            System.out.println(agua.getCantidadAgua() + " Vasos - "
            + agua.getFecha());
            
        }
        System.out.println("=========== HISTORIAL EJERCICIO ===========");
        
        for(RegistroEjercicio ejercicio : listaEjercicios){
            System.out.println(ejercicio.getTipoEjercicio() + " | "
            + ejercicio.getMinutos() + " minutos "
            + ejercicio.getCalorias() + " Calorias quemadas "
            + ejercicio.getFecha());
        }
        System.out.println("=========== HISTORIAL SUENHO ===========");
        
        for(RegistroSuenho suenho : listaSuenho){
            System.out.println(suenho.getHorasSuenho() + " Horas dormidas"
            + suenho.getFecha());
        }
            
        
    }
    
    
}
