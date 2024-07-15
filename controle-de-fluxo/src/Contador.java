import java.util.Locale;

public class Contador {
	public static void main(String[] args) {
        // Inicializa o contador
        int contadorAlunos = 12;

        // Exemplo de loop para simular a contagem de Alunos
        while (contadorAlunos <30 ) {
            // Simula a validação de um alunos
            boolean alunoValido = validarAluno();
            if (alunoValido) {
                System.out.println("Alunos " + contadorAlunos + " validado.");
                contadorAlunos++;
            } else {
                System.out.println("Aluno " + contadorAlunos + " inválido.");
            }
        }

        System.out.println("Total de Alunos validados: " + contadorAlunos);
    }

    public static boolean validarAluno() {
        // Aqui você pode adicionar a lógica de validação do alunos
        // Por exemplo, verificar se todos os campos necessários foram preenchidos corretamente
        // Este é apenas um exemplo, então vamos retornar verdadeiro para simular um aluno válido
        return true;
    }
	

}