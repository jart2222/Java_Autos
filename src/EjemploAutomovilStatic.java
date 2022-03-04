import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil sabaru = new Automovil("Sabaru","Impresa");
        sabaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        sabaru.setEstanque(new Estanque());
        sabaru.setColor(Color.BLANCO);
        Automovil.setColorPatente(Color.BLANCO);
        sabaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda= new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan=new Automovil("Nissan","Navara",Color.GRIS,new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
       nissan.setTipo(TipoAutomovil.PICKUP);

       Automovil nissan2=new Automovil("Nissan","Navara",Color.GRIS, new Motor(3.5, TipoMotor.BENCINA),new Estanque(50));
       nissan2.setColor(Color.AMARILLO);
       nissan2.setTipo(TipoAutomovil.PICKUP);

       Automovil.setColorPatente(Color.AZUL);

        System.out.println(sabaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometro por litros: "+Automovil.calcularConsumoEstatico(300,60));
        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAX_CUIDAD);

        TipoAutomovil tipoSubaru=sabaru.getTipo();
        System.out.println("tipo subaru: "+tipoSubaru.getNombre());
        System.out.println("tipo desc. subaru: "+tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300,70));



    }
}
