package Adapter_Questão2.View;

import Adapter_Questão2.Adapter.SomadorAdapter;
import Adapter_Questão2.Model.SomadorEsperado;
import Adapter_Questão2.Model.Usuario;

public class Client {
    public static void main(String[] args) {
        SomadorEsperado esperado = new SomadorAdapter();
        Usuario usuario = new Usuario(esperado);

        int total = usuario.somar();
        System.out.println("O valor total é: " + total);
    }
}
