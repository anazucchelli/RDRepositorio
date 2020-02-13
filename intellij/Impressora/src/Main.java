public class Main {
    public static void main(String[] args) {
        Contrato contrato1 = new Contrato("texto", "pdf");
        Foto foto1 = new Foto("foto", "jpg");
        Documento documento1 = new Documento("texto", "doc");
        Impressora impressora1 = new Impressora();

//        contrato1.imprimir();
//        foto1.imprimir();
//        documento1.imprimir();

        impressora1.adicionarImprimivel(contrato1);
        impressora1.adicionarImprimivel(foto1);
        impressora1.adicionarImprimivel(documento1);

        impressora1.imprimirTudo();

        }
    }

