package lista_7;

import java.util.Random;

abstract class Animal {
    public abstract String fala();
}

class Homem extends Animal{
    public String fala(){
        return "Oi";
    }
}

class Cao extends Animal{
    public String fala(){
        return "Au au";
    }
}

class Gato extends Animal{
    public String fala(){
        return "Miau";
    }
}

public class Zoologico {
    public static void main(String[] args){
        Random gerador = new Random();

        Animal[] animais = new Animal[10];

        for(int i=0; i<animais.length;i++){
            int sorteio = gerador.nextInt(3);

            if(sorteio==0){
                animais[i] = new Cao();
            }else if(sorteio==1){
                animais[i] = new Homem();
            }else{
                animais[i] = new Gato();
            }
        }

        for(int i=0;i<animais.length;i++){
            System.out.println(animais[i].fala());
        }
    }
}
