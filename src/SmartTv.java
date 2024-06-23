public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        //canal = canal + 1; É A MESMA COISA QUE : caanal++
    }
    public void diminuirCanal(){
        canal--;
        //canal =  canal - 1; É A MESMA COISA QUE : canal--
    }
    

    

    public void aumentarVolume(){
        volume++;
        //volume = volume + 1; É A MESMA COISA QUE: volume++
        System.out.println("Aumentando o volume para  : " + volume);
    }
    public void diminuirVolume(){
        volume--;
        //volume = volume - 1; É A MESMA COISA QUE: volume--
        System.out.println("Diminuindo o volume para  : " + volume);


    }    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}