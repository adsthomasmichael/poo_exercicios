package clinicaVeterinaria;

public class InformacoesAnimais {

    public void imprimeExclusivosAnimal(Animal a){

        if ( a instanceof Cachorro){
            Cachorro c = (Cachorro) a;
            System.out.printf("É um cachorro e sua raça é %S.", c.getRaca());
        } else if ( a instanceof Gato) {
            Gato g = (Gato) a;
            System.out.printf("É um gato e seu peso é %.2f.", g.getPeso());
        }
    }

    public void imprimeInformacoesAnimal(Animal a){
        System.out.println("=== INFO ANIMAL ===");
        a.imprimeInfo();
    }


}
