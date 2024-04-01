package Questao04;

public class BancoDeDados {
    private String Usuarios[][] = new String[20][35];
    int i = 0, j;
    int aux;

    void adicionar(String usuario){
        Usuarios[i][0] = usuario;
        i++;
    }

    void reorganizar(){
        for(j = aux; j < i; j++){
            Usuarios[j][0] = Usuarios[j+1][0];
        }
        Usuarios[i-1][0] = null;
        i--;
    }

    void remover(String usuario){
        for(j = 0; j < i; j++){
            if(Usuarios[j][0].equals(usuario)){
                aux = j;
                Usuarios[j][0] = null;
                break;
            }
        }

        if(j == i)
            System.out.println("Item não encontrado!");

        reorganizar();
    }

    void listar(){
        System.out.println("Itens que estão no seu carrinho de compras: ");
        for(j = 0; j < i; j++){
            if(Usuarios[j][0] != null)
                System.out.println(Usuarios[j][0]);
        }
    }

    int cheio(){
        if(i == 19)
            return 1;
        else
            return 0;
    }
}
