package q3.src;

public class Mouse extends Dispositivo implements Ativar, Desativar, Uso {

    @Override
    public void ativar() {
        System.out.println("ligar os componentes eletrônicos");
        System.out.println("---------------------");
        System.out.println("conectar o cabo usb na porta usb");
    }

    @Override
    public void desativar() {
        System.out.println("remover o cabo usb da porta usb");
        System.out.println("---------------------");
        System.out.println("desligar os componentes eletrônicos");

    }

    @Override
    public void uso() {
        System.out.println("use o mouse para mexer o ponteiro do cursor em seu dispositivo");
    }

}
