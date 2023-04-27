

       public static void main(String[] args) {
        Grupo grupo = new Grupo();

        grupo.adicionarHeroi(new Heroi(1, "homen Aranha", 70));
        grupo.adicionarHeroi(new Heroi(2, "HULK", 120));
        grupo.adicionarHeroi(new Heroi(3, "groot", 150));
        grupo.adicionarHeroi(new Heroi(4, "thor", 150));

        grupo.removerHeroi(1);

        System.out.println("O total de moedas do grupo é: " + grupo.getTotalMoedasDeOuro());

    }
