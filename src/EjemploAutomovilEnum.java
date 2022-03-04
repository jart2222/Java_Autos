public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil sabaru = new Automovil("Sabaru","Impresa");
        sabaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        sabaru.setEstanque(new Estanque());
        sabaru.setColor(Color.BLANCO);
        sabaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda= new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        TipoAutomovil tipo=sabaru.getTipo();
        System.out.println("tipo subaru: "+tipo.getNombre());
        System.out.println("tipo desc. subaru: "+tipo.getDescripcion());

        tipo=mazda.getTipo();
        switch (tipo){
            //ya incluye break
            case CONVERTIBLE ->
                    System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                    System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON ->
                    System.out.println("Es un automovil unitario de trasporte, de empresa");
            case HATCHBACK ->
                    System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                    System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                    System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                    System.out.println("Es un automovil grande, con maleta grande .....");

        }//switch
        System.out.println("------------------------------------------------");

        TipoAutomovil[] tipos=TipoAutomovil.values();
        for (TipoAutomovil ta :tipos ) {
            System.out.print(ta+" => "+ta.name()+", "+
                    ta.getNombre()+", "+
                    ta.getDescripcion()+", "+
                    ta.getNumeroPuerta());
            System.out.println();
        }




    }
}
