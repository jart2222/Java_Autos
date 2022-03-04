import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Date fecha=new Date();

        Motor motorSubaru= new Motor(2.0,TipoMotor.BENCINA);
        Automovil auto=new Automovil();

        Automovil sabaru = new Automovil("Sabaru","Impresa");
        sabaru.setMotor(motorSubaru);
        sabaru.setEstanque(new Estanque());
        sabaru.setColor(Color.BLANCO);

        Motor motorMazda=new Motor(3.0,TipoMotor.DIESEL);
        Automovil mazda= new Automovil("Mazda","BT-50",Color.ROJO,motorMazda);
       // mazda.setEstanque(new Estanque(50));

        Automovil nissan=new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));

        Automovil nissan2=new Automovil("Nissan","Navara",Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA),new Estanque(50));

        System.out.println("(nissan==nissan2) = " + (nissan==nissan2));
        System.out.println("nissan.equals(nissan2) = " + nissan.equals(nissan2));
        System.out.println("nissan.equals(auto) = " + nissan.equals(auto));
        System.out.println("nissan.equals(fecha) = " + nissan.equals(fecha));

        System.out.println(nissan.toString());
        System.out.println(mazda.toString());




    }
}
