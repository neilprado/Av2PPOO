package Composite_Questão5.View;

import Composite_Questão5.Model.Directory;
import Composite_Questão5.Model.File;
import Composite_Questão5.Model.MyFile;

public class Client {
    public static void main(String[] args) {
        File arquivo1 = new MyFile("Arq1", "20");
        File arquivo2 = new MyFile("Arq2", "30");
        File arquivo3 = new MyFile("Arq3", "180");
        File pasta1 = new Directory("MinhaPasta");

        ((Directory) pasta1).adicionar(arquivo1);
        ((Directory) pasta1).adicionar(arquivo2);
        ((Directory) pasta1).adicionar(arquivo3);
        pasta1.getNome();

    }
}
