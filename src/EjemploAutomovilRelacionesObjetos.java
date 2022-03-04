public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedaSub=new Rueda[10];

        Persona conductorSabaru=new Persona("Luci","Martinez");
        Automovil sabaru = new Automovil("Sabaru","Impresa");
        sabaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        sabaru.setEstanque(new Estanque());
        sabaru.setColor(Color.BLANCO);
        sabaru.setTipo(TipoAutomovil.HATCHBACK);
        sabaru.setConductor(conductorSabaru);
        //sabaru.setRuedas(ruedaSub);

        for (int i = 0; i < ruedaSub.length; i++) {
            sabaru.addRuedas(new Rueda("Yokohama",16,7.5));
        }


        Rueda[] ruedasMaz= new Rueda[5];


        Persona pato=new Persona("Pato","Rodriguez");
        Automovil mazda= new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);
        for (int i = 0; i < ruedasMaz.length; i++) {

            mazda.addRuedas(new Rueda("Michelin",18,10.5));
        }



        Persona bea=new Persona("Bea","Gonzales");
        Automovil nissan=new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));
       nissan.setTipo(TipoAutomovil.PICKUP);
       nissan.setConductor(bea);
       nissan.addRuedas( new Rueda("Pirelli",20,11.5)).addRuedas( new Rueda("Pirelli",20,11.5))
               .addRuedas( new Rueda("Pirelli",20,11.5)).addRuedas( new Rueda("Pirelli",20,11.5))
               .addRuedas( new Rueda("Pirelli",20,11.5));



        Rueda[] ruedasNissan2={new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5),
                new Rueda("Pirelli",20,11.5)};

       Persona lalo=new Persona("Lalo","Mena");
       Automovil nissan2=new Automovil("Nissan","Navara",Color.GRIS,
               new Motor(3.5, TipoMotor.BENCINA),new Estanque(50),lalo,ruedasNissan2);
       nissan2.setColor(Color.AMARILLO);
       nissan2.setTipo(TipoAutomovil.PICKUP);
       Automovil.setColorPatente(Color.AZUL);

        System.out.println(sabaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());



    }
}
