import java.util.HashMap;
import java.util.Map;

class Agenda {
    public Map<Integer, Contato> contatosMap = new HashMap<>();
    public int id = 1;

    public void consultarContatos() {
        for (var contato : contatosMap.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() 
            + " | " + contato.getValue().getTelefone() + " | " + contato.getValue().getSexo()
            + " | " + contato.getValue().getEmail());
        }
    }

    public void cadastrarContatos(Contato contato) {
        contatosMap.put(id, contato);
        id++;
    }

    public void editarContato(int id, Contato contatoNovo) {
        contatosMap.replace(id, contatoNovo);
    }

    public void excluirContato(int id) {
        contatosMap.remove(id);
    }

}