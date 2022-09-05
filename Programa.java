

public class Programa {
    public static void main(String[] args) {
   

        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Rafael", 'M', "rafale@gmail.com", "291098190");
        Contato contato2 = new Contato("Gabriela", 'F', "gabriela@gmail.com", "939098190");
        Contato contato3 = new Contato("Sergio", 'M', "sergio@gmail.com", "091933190");

        System.out.println("Sua agenda de contatos:");
        System.out.println("Essas foram suas últimas ligações: ");
        System.out.println(contato1.getTelefone());
        System.out.println(contato2.getTelefone());
        System.out.println(contato3.getTelefone());

        agenda.cadastrarContatos(contato1);
        System.out.println("Você cadastrou o " + contato1.getNome());
        agenda.editarContato(1, contato3);
        System.out.println("Você editou o contato do " + contato1.getNome());
        agenda.consultarContatos();
        agenda.excluirContato(1);
        System.out.println("Você excluiu um contato");

    }
}