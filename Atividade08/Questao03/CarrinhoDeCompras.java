package Questao03;

public class CarrinhoDeCompras{
    private String carrinhoCompras[][] = new String[20][15];
    int i = 0, j;
    int aux;

    void adicionar(String item){
        carrinhoCompras[i][0] = item;
        i++;
    }

    void reorganizar(){
        for(j = aux; j < i; j++){
            carrinhoCompras[j][0] = carrinhoCompras[j+1][0];
        }
        carrinhoCompras[i-1][0] = null;
        i--;
    }

    void remover(String item){
        for(j = 0; j < i; j++){
            if(carrinhoCompras[j][0].equals(item)){
                aux = j;
                carrinhoCompras[j][0] = null;
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
            if(carrinhoCompras[j][0] != null)
                System.out.println(carrinhoCompras[j][0]);
        }
    }

    int carrinhoCheio(){
        if(i == 19)
            return 1;
        else
            return 0;
    }
}