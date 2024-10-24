public class App{
    public static void main(String[] args) {
        System.out.println("Hello"); //printline (determinador de linha no final)
        System.out.println(args.length);
        if(args.length>=1){
            System.out.println(args[0]);
        } else{
            System.out.println("Jair Messias Bolsonaro");
        }
    }
}

//Linguagem C compila: traduz um código para um executável de uma plataforma específica
//Linguagem Python interpreta: roda o código em tempo de execução (o browser faz isso)

//Java era a linguagem do browser, a linguagem da internet
//Por isso, ele compila um código executável em qualquer máquina
//É mais devagar que o C, mas mais rápido que o Python
//Java compila o código fonte para o arquivo em linguagem de máquina (linguagem universal - bytecode Java) - o Java Virtual Machine executa essa linguagem